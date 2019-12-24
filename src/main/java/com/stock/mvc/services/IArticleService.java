package com.stock.mvc.services;


import java.util.List;

import com.stock.mvc.entites.Article;

public interface IArticleService {
	public Article save(Article entity);

	public Article update(Article entity);

	public List<Article> selectAll();

	public Article getById(Long id);

	public void remove(Long id);

	public List<Article> selectAll(String sortField, String sort);

	public Article findOne(String paramName, Object ParamValue);

	public Article findOne(String[] paramNames, Object[] ParamValues);

	public int findCountBy(String paramName, String paramValue);

}
