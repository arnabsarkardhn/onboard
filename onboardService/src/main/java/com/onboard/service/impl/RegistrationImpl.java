package com.onboard.service.impl;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.onboard.api.RegistrationApi;
import com.onboard.request.RegistrationRequest;
import com.onboard.response.RegistrationResponse;

@Service
@Scope( scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON )
public class RegistrationImpl implements RegistrationApi{

	@Override
	public ResponseEntity<?> createRegistration(RegistrationRequest registrationRequest) {

		RegistrationResponse res = new RegistrationResponse();
		res.setValue("fine");
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

}
