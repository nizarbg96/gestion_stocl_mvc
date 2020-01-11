package com.stock.mvc.services.impl;


import java.util.List;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ICategoryDao;
import com.stock.mvc.entites.Category;
import com.stock.mvc.services.ICategoryService;

@Transactional
public class CategoryServiceImpl implements ICategoryService {

	ICategoryDao dao;

	public void setDao(ICategoryDao dao) {
		this.dao = dao;
	}

	@Override
	public Category save(Category entity) {
		return dao.save(entity);
	}

	@Override
	public Category update(Category entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<Category> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Category getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public List<Category> selectAll(String sortField, String sort) {

		return dao.selectAll(sortField, sort);
	}

	@Override
	public Category findOne(String paramName, Object ParamValue) {

		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public Category findOne(String[] paramNames, Object[] ParamValues) {

		return dao.findOne(paramNames, ParamValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
