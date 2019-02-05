package com.onboard.request;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegistrationRequest {

	@JsonProperty("name")
	@NotNull
	private String name;
	
	@JsonProperty("email")
	@NotNull
	private String email;
	

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(name) + Objects.hashCode(email);
	}
	
	@Override
	public boolean equals(Object other) {
		 if (other == this) {
			 return true;
	     }
	     if ((other instanceof RegistrationRequest) == false) {
	         return false;
	     }
	     RegistrationRequest req = ((RegistrationRequest) other);
	     return req.getName().equals(name) && 
	    		req.getEmail().equals(email);
	}
	
}
