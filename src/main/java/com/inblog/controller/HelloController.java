package com.inblog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
@RequestMapping("/")
public class HelloController {


	private static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Locale locale) {
		LOGGER.debug("selam");
		return "index";
	}
}
