package com.mit.entity;

// Generated 23 mai 2016 00:14:51 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ContratsocieteId generated by hbm2java
 */
@Embeddable
public class ContratsocieteId implements java.io.Serializable {

	private int idProjet;
	private int idContrat;
	private int idSociete;

	public ContratsocieteId() {
	}

	public ContratsocieteId(int idProjet, int idContrat, int idSociete) {
		this.idProjet = idProjet;
		this.idContrat = idContrat;
		this.idSociete = idSociete;
	}

	@Column(name = "idProjet", nullable = false)
	public int getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}

	@Column(name = "idContrat", nullable = false)
	public int getIdContrat() {
		return this.idContrat;
	}

	public void setIdContrat(int idContrat) {
		this.idContrat = idContrat;
	}

	@Column(name = "idSociete", nullable = false)
	public int getIdSociete() {
		return this.idSociete;
	}

	public void setIdSociete(int idSociete) {
		this.idSociete = idSociete;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ContratsocieteId))
			return false;
		ContratsocieteId castOther = (ContratsocieteId) other;

		return (this.getIdProjet() == castOther.getIdProjet())
				&& (this.getIdContrat() == castOther.getIdContrat())
				&& (this.getIdSociete() == castOther.getIdSociete());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdProjet();
		result = 37 * result + this.getIdContrat();
		result = 37 * result + this.getIdSociete();
		return result;
	}

}
