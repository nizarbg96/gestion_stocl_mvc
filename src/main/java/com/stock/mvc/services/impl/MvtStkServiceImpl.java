package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IMvtStkDao;
import com.stock.mvc.entites.MvtStk;
import com.stock.mvc.services.IMvtStkService;

@Transactional
public class MvtStkServiceImpl implements IMvtStkService {

	IMvtStkDao dao;

	public void setDao(IMvtStkDao dao) {
		this.dao = dao;
	}

	@Override
	public MvtStk save(MvtStk entity) {
		return dao.save(entity);
	}

	@Override
	public MvtStk update(MvtStk entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<MvtStk> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public MvtStk getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public List<MvtStk> selectAll(String sortField, String sort) {

		return dao.selectAll(sortField, sort);
	}

	@Override
	public MvtStk findOne(String paramName, Object ParamValue) {

		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public MvtStk findOne(String[] paramNames, Object[] ParamValues) {

		return dao.findOne(paramNames, ParamValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
