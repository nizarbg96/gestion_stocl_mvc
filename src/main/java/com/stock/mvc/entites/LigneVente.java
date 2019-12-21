package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class LigneVente implements Serializable{
	@Id
	@GeneratedValue
	private Long idLigneVente;
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name = "idVente")
	private Vente vente;
	
	
	public Vente getVente() {
		return vente;
	}
	public void setVente(Vente vente) {
		this.vente = vente;
	}
	public LigneVente() {
		// TODO Auto-generated constructor stub
	}
	public Long getIdLigneVente() {
		return idLigneVente;
	}
	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
