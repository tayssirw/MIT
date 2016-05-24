package com.mit.entity;

// Generated 23 mai 2016 00:14:51 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tache generated by hbm2java
 */
@Entity
@Table(name = "tache", catalog = "mitdb")
public class Tache implements java.io.Serializable {

	private TacheId id;
	private Projet projet;
	private String nomTache;
	private String descTache;
	private String etatTache;
	private Date dateD;
	private Date dateF;
	private Set<Contratmembre> contratmembres = new HashSet<Contratmembre>(0);

	public Tache() {
	}

	public Tache(TacheId id, Projet projet) {
		this.id = id;
		this.projet = projet;
	}

	public Tache(TacheId id, Projet projet, String nomTache, String descTache,
			String etatTache, Date dateD, Date dateF,
			Set<Contratmembre> contratmembres) {
		this.id = id;
		this.projet = projet;
		this.nomTache = nomTache;
		this.descTache = descTache;
		this.etatTache = etatTache;
		this.dateD = dateD;
		this.dateF = dateF;
		this.contratmembres = contratmembres;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idProjet", column = @Column(name = "idProjet", nullable = false)),
			@AttributeOverride(name = "idTache", column = @Column(name = "idTache", nullable = false)) })
	public TacheId getId() {
		return this.id;
	}

	public void setId(TacheId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProjet", nullable = false, insertable = false, updatable = false)
	public Projet getProjet() {
		return this.projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	@Column(name = "nomTache", length = 254)
	public String getNomTache() {
		return this.nomTache;
	}

	public void setNomTache(String nomTache) {
		this.nomTache = nomTache;
	}

	@Column(name = "descTache", length = 254)
	public String getDescTache() {
		return this.descTache;
	}

	public void setDescTache(String descTache) {
		this.descTache = descTache;
	}

	@Column(name = "etatTache", length = 254)
	public String getEtatTache() {
		return this.etatTache;
	}

	public void setEtatTache(String etatTache) {
		this.etatTache = etatTache;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateD", length = 10)
	public Date getDateD() {
		return this.dateD;
	}

	public void setDateD(Date dateD) {
		this.dateD = dateD;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateF", length = 10)
	public Date getDateF() {
		return this.dateF;
	}

	public void setDateF(Date dateF) {
		this.dateF = dateF;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tache")
	public Set<Contratmembre> getContratmembres() {
		return this.contratmembres;
	}

	public void setContratmembres(Set<Contratmembre> contratmembres) {
		this.contratmembres = contratmembres;
	}

}
