package com.heroku.demo.config;

public class Demandware {

	private String url;
	private String clientId;
	private String apiVersion;
	private String username;
	private String secret;
	private String rootCategory;
	
	public Demandware(String url, String clientId, String apiVersion, String rootCategory) {
		super();
		this.url = url;
		this.clientId = clientId;
		this.apiVersion = apiVersion;
		this.rootCategory = rootCategory;
	}
	
	
	public Demandware() {
		setUrl(isNull(System.getenv("DW_URL"), "http://mjacob01-inside-na01-dw.demandware.net/s/SiteGenesis"));
		setClientId(isNull(System.getenv("DW_CLIENTID"), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
		setApiVersion(isNull(System.getenv("DW_API_VERSION"), "v16_4"));
		setUsername(isNull(System.getenv("DW_USERNAME"),""));
		setSecret(isNull(System.getenv("DW_SECRET"),""));
		setRootCategory(isNull(System.getenv("DW_ROOT_CATEGORY"), "root"));
	}
	
	private String isNull(String val, String d){
		if (val == null)
			return d;
		else
			return val;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getApiVersion() {
		return apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getSecret() {
		return secret;
	}


	public void setSecret(String secret) {
		this.secret = secret;
	}


	public String getRootCategory() {
		return rootCategory;
	}


	public void setRootCategory(String rootCategory) {
		this.rootCategory = rootCategory;
	}


	
}
