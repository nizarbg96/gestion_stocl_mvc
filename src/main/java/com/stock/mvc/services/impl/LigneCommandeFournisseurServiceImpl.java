package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ILigneCommandeFournisseurDao;
import com.stock.mvc.entites.LigneCommandeFournisseur;
import com.stock.mvc.services.ILigneCommandeFournisseurService;
@Transactional
public class LigneCommandeFournisseurServiceImpl implements ILigneCommandeFournisseurService {
	
	ILigneCommandeFournisseurDao dao;

	public void setDao(ILigneCommandeFournisseurDao dao) {
		this.dao = dao;
	}


	@Override
	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public LigneCommandeFournisseur getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public List<LigneCommandeFournisseur> selectAll(String sortField, String sort) {

		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeFournisseur findOne(String paramName, Object ParamValue) {

		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public LigneCommandeFournisseur findOne(String[] paramNames, Object[] ParamValues) {

		return dao.findOne(paramNames, ParamValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);	
	}

}
