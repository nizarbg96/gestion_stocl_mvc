package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.LigneCommandeClient;

public interface ILigneCommandeClientService {
	public LigneCommandeClient save(LigneCommandeClient entity);

	public LigneCommandeClient update(LigneCommandeClient entity);

	public List<LigneCommandeClient> selectAll();

	public LigneCommandeClient getById(Long id);

	public void remove(Long id);

	public List<LigneCommandeClient> selectAll(String sortField, String sort);

	public LigneCommandeClient findOne(String paramName, Object ParamValue);

	public LigneCommandeClient findOne(String[] paramNames, Object[] ParamValues);

	public int findCountBy(String paramName, String paramValue);

}
