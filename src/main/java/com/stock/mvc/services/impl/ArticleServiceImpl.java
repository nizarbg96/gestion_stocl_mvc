package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IArticleDao;
import com.stock.mvc.entites.Article;
import com.stock.mvc.services.IArticleService;
@Transactional
public class ArticleServiceImpl implements IArticleService {

	IArticleDao dao;

	public void setDao(IArticleDao dao) {
		this.dao = dao;
	}

	@Override
	public Article save(Article entity) {
		return dao.save(entity);
	}

	@Override
	public Article update(Article entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<Article> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Article getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public List<Article> selectAll(String sortField, String sort) {

		return dao.selectAll(sortField, sort);
	}

	@Override
	public Article findOne(String paramName, Object ParamValue) {

		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public Article findOne(String[] paramNames, Object[] ParamValues) {

		return dao.findOne(paramNames, ParamValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);	
	}

}
