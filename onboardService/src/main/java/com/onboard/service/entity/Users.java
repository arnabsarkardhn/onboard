package com.onboard.service.entity;

import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {
	
	@Id
	public ObjectId id;
    private String username;
    private String password;

    public Users() {
    }

    public Users(ObjectId id, final String password, final String username) {
    	this.id = id;
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

}