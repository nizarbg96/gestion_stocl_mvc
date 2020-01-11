package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ILigneCommandeClientDao;
import com.stock.mvc.entites.LigneCommandeClient;
import com.stock.mvc.services.ILigneCommandeClientService;
@Transactional
public class LigneCommandeClientServiceImpl implements ILigneCommandeClientService {
	
	ILigneCommandeClientDao dao;

	public void setDao(ILigneCommandeClientDao dao) {
		this.dao = dao;
	}


	@Override
	public LigneCommandeClient save(LigneCommandeClient entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCommandeClient update(LigneCommandeClient entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<LigneCommandeClient> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public LigneCommandeClient getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public List<LigneCommandeClient> selectAll(String sortField, String sort) {

		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeClient findOne(String paramName, Object ParamValue) {

		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public LigneCommandeClient findOne(String[] paramNames, Object[] ParamValues) {

		return dao.findOne(paramNames, ParamValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);	
	}

}
