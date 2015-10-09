package com.inblog.controller;

import com.inblog.entity.Item;
import com.inblog.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/")
public class HelloController {

	private static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	ItemService itemService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Locale locale) {
		LOGGER.debug("selam");
		List<Item> itemList = itemService.getItems();
		model.addAttribute("itemList", itemList);
		return "index";
	}
}
