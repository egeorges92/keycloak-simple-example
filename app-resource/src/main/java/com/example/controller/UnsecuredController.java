package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnsecuredController {

	@RequestMapping(path = { "/", "/unsecured" })
	public String noSecuredEndpoint() {
		return "This is an unsecured endpoint payload";
	}

}
