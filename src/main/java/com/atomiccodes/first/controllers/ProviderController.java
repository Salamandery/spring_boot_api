package com.atomiccodes.first.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.atomiccodes.first.models.Provider;
import com.atomiccodes.first.repositories.ProviderRepository;

@RestController
@RequestMapping("/prestadores")
public class ProviderController {

	@Autowired
	private ProviderRepository providerRepository;
	
	@GetMapping
	public List<Provider> listAll() {
		return providerRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Provider add(@RequestBody Provider provider) {
		return providerRepository.save(provider);
	}
}
