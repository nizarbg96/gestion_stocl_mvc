package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ICommandeFournisseurDao;
import com.stock.mvc.entites.CommandeFournisseur;
import com.stock.mvc.services.ICommandeFournisseurService;
@Transactional
public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService {
	
	ICommandeFournisseurDao dao;

	public void setDao(ICommandeFournisseurDao dao) {
		this.dao = dao;
	}


	@Override
	public CommandeFournisseur save(CommandeFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public CommandeFournisseur update(CommandeFournisseur entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<CommandeFournisseur> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public CommandeFournisseur getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public List<CommandeFournisseur> selectAll(String sortField, String sort) {

		return dao.selectAll(sortField, sort);
	}

	@Override
	public CommandeFournisseur findOne(String paramName, Object ParamValue) {

		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public CommandeFournisseur findOne(String[] paramNames, Object[] ParamValues) {

		return dao.findOne(paramNames, ParamValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);	
	}

}
