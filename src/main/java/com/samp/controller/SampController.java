package com.samp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampController {
	
	@GetMapping(value = "/getGit")
	public String getGit() {
		return "Project deployed Successfully";
	}

}
