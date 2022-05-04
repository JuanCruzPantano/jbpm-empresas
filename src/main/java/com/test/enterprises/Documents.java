package com.test.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Documents implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Boolean signedW8BENEntities;
	private java.lang.Boolean signedW8BENIndividuals;

	private java.lang.Boolean signedTaxpayer;

	private java.lang.Boolean signedCLI;

	private java.lang.Boolean signedAuthResolution;

	private java.lang.Boolean signedBenefitialOwnership;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "DOCUMENTS_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "DOCUMENTS_ID_GENERATOR", sequenceName = "DOCUMENTS_ID_SEQ")
	private java.lang.Long id;

	public Documents() {
	}

	public java.lang.Boolean getSignedW8BENEntities() {
		return this.signedW8BENEntities;
	}

	public void setSignedW8BENEntities(java.lang.Boolean signedW8BENEntities) {
		this.signedW8BENEntities = signedW8BENEntities;
	}

	public java.lang.Boolean getSignedW8BENIndividuals() {
		return this.signedW8BENIndividuals;
	}

	public void setSignedW8BENIndividuals(
			java.lang.Boolean signedW8BENIndividuals) {
		this.signedW8BENIndividuals = signedW8BENIndividuals;
	}

	public java.lang.Boolean getSignedTaxpayer() {
		return this.signedTaxpayer;
	}

	public void setSignedTaxpayer(java.lang.Boolean signedTaxpayer) {
		this.signedTaxpayer = signedTaxpayer;
	}

	public java.lang.Boolean getSignedCLI() {
		return this.signedCLI;
	}

	public void setSignedCLI(java.lang.Boolean signedCLI) {
		this.signedCLI = signedCLI;
	}

	public java.lang.Boolean getSignedAuthResolution() {
		return this.signedAuthResolution;
	}

	public void setSignedAuthResolution(java.lang.Boolean signedAuthResolution) {
		this.signedAuthResolution = signedAuthResolution;
	}

	public java.lang.Boolean getSignedBenefitialOwnership() {
		return this.signedBenefitialOwnership;
	}

	public void setSignedBenefitialOwnership(
			java.lang.Boolean signedBenefitialOwnership) {
		this.signedBenefitialOwnership = signedBenefitialOwnership;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public Documents(java.lang.Boolean signedW8BENEntities,
			java.lang.Boolean signedW8BENIndividuals,
			java.lang.Boolean signedTaxpayer, java.lang.Boolean signedCLI,
			java.lang.Boolean signedAuthResolution,
			java.lang.Boolean signedBenefitialOwnership, java.lang.Long id) {
		this.signedW8BENEntities = signedW8BENEntities;
		this.signedW8BENIndividuals = signedW8BENIndividuals;
		this.signedTaxpayer = signedTaxpayer;
		this.signedCLI = signedCLI;
		this.signedAuthResolution = signedAuthResolution;
		this.signedBenefitialOwnership = signedBenefitialOwnership;
		this.id = id;
	}

}