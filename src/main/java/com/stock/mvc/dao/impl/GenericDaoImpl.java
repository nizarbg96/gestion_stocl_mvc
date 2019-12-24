package com.stock.mvc.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.stock.mvc.dao.IGenericDao;

@SuppressWarnings({ "unchecked", "unused" })

public class GenericDaoImpl<E> implements IGenericDao<E> {

	@PersistenceContext
	EntityManager em;
	private Class<E> type;
 
	public Class<E> getType() {
		return type;
	}

	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<E>) pt.getActualTypeArguments()[0];
	}

	@Override
	public E save(E entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public E update(E entity) {

		return em.merge(entity);
	}

	@Override
	public List<E> selectAll() {
		javax.persistence.Query query = em.createQuery("select t from " + this.type.getSimpleName() + " t");
		return query.getResultList();
	}

	@Override
	public List<E> selectAll(String sortField, String sort) {
		javax.persistence.Query query = em
				.createQuery("select t from " + this.type.getSimpleName() + " t order by " + sortField + " " + sort);
		return query.getResultList();

	}

	@Override
	public E getById(Long id) {
		return em.find(type, id);

	}

	@Override
	public void remove(Long id) {
		E obj = em.getReference(type, id);
		em.remove(obj);

	}

	@Override
	public E findOne(String paramName, Object ParamValue) {
		javax.persistence.Query query = em
				.createQuery("select t from " + this.type.getSimpleName() + " t where " + paramName + " = :x");
		query.setParameter(paramName, ParamValue);
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
	}

	@Override
	public E findOne(String[] paramNames, Object[] ParamValues) {
		if (paramNames.length != ParamValues.length) {
			return null;
		}
		String queryString = "select e from " + this.type.getSimpleName() + " e where ";
		for (int i = 0; i < ParamValues.length; i++) {
			queryString += "e." + paramNames[i] + " = :x" + i;
			if (i + 1 < paramNames.length)
				queryString += " and ";
		}
		javax.persistence.Query query = em.createQuery(queryString);
		for (int j = 0; j < ParamValues.length; j++) {
			query.setParameter(paramNames[j], ParamValues[j]);
		}
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;

	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		javax.persistence.Query query = em
				.createQuery("select t from " + this.type.getSimpleName() + " t where " + paramName + " = :x");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size() > 0 ? ((Long) query.getSingleResult()).intValue() : 0;
	}

}
