package com.e45240.okta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * @author du.yang
 * @date 2018-10-12 17:57
 */
@Controller
public class SimpleAppController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/restricted")
	public String restricted() {
		return "restricted";
	}

}