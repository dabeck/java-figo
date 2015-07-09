package me.figo.internal;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class SetupAccountRequest {

	@Expose
	private String bank_code;
	
	@Expose
	private String country;
	
	@Expose
	private List<String> credentials;
	
	public SetupAccountRequest(String bankCode, String countryCode, String loginName, String pin)	{
		this.bank_code = bankCode;
		this.country = countryCode;
		this.credentials = new ArrayList<String>();
		this.credentials.add(loginName);
		this.credentials.add(pin);
	}
	
	public SetupAccountRequest(String bankCode, String countryCode, List<String> credentials)	{
		this.bank_code = bankCode;
		this.country = countryCode;
		this.credentials = credentials;
	}

	public String getBankCode() {
		return bank_code;
	}

	public void setBankCode(String bank_code) {
		this.bank_code = bank_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getCredentials() {
		return credentials;
	}

	public void setCredentials(List<String> credentials) {
		this.credentials = credentials;
	}	
	
}
