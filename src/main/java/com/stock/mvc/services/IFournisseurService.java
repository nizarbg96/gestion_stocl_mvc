package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.Fournisseur;

public interface IFournisseurService {
	public Fournisseur save(Fournisseur entity);

	public Fournisseur update(Fournisseur entity);

	public List<Fournisseur> selectAll();

	public Fournisseur getById(Long id);

	public void remove(Long id);

	public List<Fournisseur> selectAll(String sortField, String sort);

	public Fournisseur findOne(String paramName, Object ParamValue);

	public Fournisseur findOne(String[] paramNames, Object[] ParamValues);

	public int findCountBy(String paramName, String paramValue);

}
