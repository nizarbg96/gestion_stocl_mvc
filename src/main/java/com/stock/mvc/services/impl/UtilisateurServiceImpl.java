package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IUtilisateurDao;
import com.stock.mvc.entites.Utilisateur;
import com.stock.mvc.services.IUtilisateurService;

@Transactional
public class UtilisateurServiceImpl implements IUtilisateurService {

	IUtilisateurDao dao;

	public void setDao(IUtilisateurDao dao) {
		this.dao = dao;
	}

	@Override
	public Utilisateur save(Utilisateur entity) {
		return dao.save(entity);
	}

	@Override
	public Utilisateur update(Utilisateur entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<Utilisateur> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Utilisateur getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public List<Utilisateur> selectAll(String sortField, String sort) {

		return dao.selectAll(sortField, sort);
	}

	@Override
	public Utilisateur findOne(String paramName, Object ParamValue) {

		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public Utilisateur findOne(String[] paramNames, Object[] ParamValues) {

		return dao.findOne(paramNames, ParamValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
