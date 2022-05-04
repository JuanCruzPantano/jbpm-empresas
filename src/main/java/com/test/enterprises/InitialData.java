package com.test.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class InitialData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String bdfEmail;
	private java.lang.String bdfLoginName;
	private java.lang.String bdfName;
	private java.lang.String currentUser;
	private java.lang.String email;
	private java.lang.String completeNames;
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "INITIALDATA_ID_GENERATOR")
	@javax.persistence.SequenceGenerator(name = "INITIALDATA_ID_GENERATOR", sequenceName = "INITIALDATA_ID_SEQ")
	private java.lang.Long id;
	private java.lang.String languageBDF;
	private java.lang.String languageClient;
	private java.lang.String login;
	private java.lang.String products;
	private java.lang.String reasonRequest;
	private java.util.List<java.lang.Integer> rolIds;

	public InitialData() {
	}

	public java.lang.String getBdfEmail() {
		return this.bdfEmail;
	}

	public void setBdfEmail(java.lang.String bdfEmail) {
		this.bdfEmail = bdfEmail;
	}

	public java.lang.String getBdfLoginName() {
		return this.bdfLoginName;
	}

	public void setBdfLoginName(java.lang.String bdfLoginName) {
		this.bdfLoginName = bdfLoginName;
	}

	public java.lang.String getBdfName() {
		return this.bdfName;
	}

	public void setBdfName(java.lang.String bdfName) {
		this.bdfName = bdfName;
	}

	public java.lang.String getCurrentUser() {
		return this.currentUser;
	}

	public void setCurrentUser(java.lang.String currentUser) {
		this.currentUser = currentUser;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getCompleteNames() {
		return this.completeNames;
	}

	public void setCompleteNames(java.lang.String completeNames) {
		this.completeNames = completeNames;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getLanguageBDF() {
		return this.languageBDF;
	}

	public void setLanguageBDF(java.lang.String languageBDF) {
		this.languageBDF = languageBDF;
	}

	public java.lang.String getLanguageClient() {
		return this.languageClient;
	}

	public void setLanguageClient(java.lang.String languageClient) {
		this.languageClient = languageClient;
	}

	public java.lang.String getLogin() {
		return this.login;
	}

	public void setLogin(java.lang.String login) {
		this.login = login;
	}

	public java.lang.String getProducts() {
		return this.products;
	}

	public void setProducts(java.lang.String products) {
		this.products = products;
	}

	public java.lang.String getReasonRequest() {
		return this.reasonRequest;
	}

	public void setReasonRequest(java.lang.String reasonRequest) {
		this.reasonRequest = reasonRequest;
	}

	public java.util.List<java.lang.Integer> getRolIds() {
		return this.rolIds;
	}

	public void setRolIds(java.util.List<java.lang.Integer> rolIds) {
		this.rolIds = rolIds;
	}

	public InitialData(java.lang.String bdfEmail,
			java.lang.String bdfLoginName, java.lang.String bdfName,
			java.lang.String currentUser, java.lang.String email,
			java.lang.String completeNames, java.lang.Long id,
			java.lang.String languageBDF, java.lang.String languageClient,
			java.lang.String login, java.lang.String products,
			java.lang.String reasonRequest,
			java.util.List<java.lang.Integer> rolIds) {
		this.bdfEmail = bdfEmail;
		this.bdfLoginName = bdfLoginName;
		this.bdfName = bdfName;
		this.currentUser = currentUser;
		this.email = email;
		this.completeNames = completeNames;
		this.id = id;
		this.languageBDF = languageBDF;
		this.languageClient = languageClient;
		this.login = login;
		this.products = products;
		this.reasonRequest = reasonRequest;
		this.rolIds = rolIds;
	}

}