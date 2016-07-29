package com.heroku.demo.config;

public class Demandware {

	private String url;
	private String clientId;
	private String apiVersion;
	private String username;
	private String secret;
	
	
	public Demandware(String url, String clientId, String apiVersion) {
		super();
		this.url = url;
		this.clientId = clientId;
		this.apiVersion = apiVersion;
	}
	
	
	public Demandware() {
		setUrl(isNull(System.getenv("DW_URL"), "http://mjacob01-inside-na01-dw.demandware.net"));
		setClientId(isNull(System.getenv("DW_CLIENTID"), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
		setApiVersion(isNull(System.getenv("DW_API_VERSION"), "v16_4"));
		setUsername(isNull(System.getenv("DW_USERNAME"),""));
		setSecret(isNull(System.getenv("DW_SECRET"),""));
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


	
}
