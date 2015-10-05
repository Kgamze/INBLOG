package com.inblog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 9/28/15.
 */

@Controller
public class LoginController {


    private static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(Model model) {
        LOGGER.debug("home page...");
        return "login";
    }

}
