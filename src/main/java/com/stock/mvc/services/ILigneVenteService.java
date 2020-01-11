package com.stock.mvc.services;


import java.util.List;

import com.stock.mvc.entites.LigneVente;

public interface ILigneVenteService {
	public LigneVente save(LigneVente entity);

	public LigneVente update(LigneVente entity);

	public List<LigneVente> selectAll();

	public LigneVente getById(Long id);

	public void remove(Long id);

	public List<LigneVente> selectAll(String sortField, String sort);

	public LigneVente findOne(String paramName, Object ParamValue);

	public LigneVente findOne(String[] paramNames, Object[] ParamValues);

	public int findCountBy(String paramName, String paramValue);
}
