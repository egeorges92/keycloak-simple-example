package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(path="/user")
	public String userSecuredEndpoint(){
        return "This is an USER endpoint payload";
    }
	
}
