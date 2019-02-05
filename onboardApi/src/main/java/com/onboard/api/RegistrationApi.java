package com.onboard.api;

import javax.ws.rs.core.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onboard.request.RegistrationRequest;

@RestController
@RequestMapping("/registration")
public interface RegistrationApi {

	@PostMapping(
			path= "/create", 
			consumes = MediaType.APPLICATION_JSON, 
			produces = MediaType.APPLICATION_JSON
	)
	ResponseEntity<?> createRegistration(@RequestBody RegistrationRequest registrationRequest);
	
}
