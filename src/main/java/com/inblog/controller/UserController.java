package com.inblog.controller;

import com.inblog.entity.User;
import com.inblog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 9/21/15.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private static final String BASE_PATH = "user/user-";

    private static final String PAGE_VIEW = BASE_PATH + "view";

    private static final String PAGE_DETAIL = BASE_PATH + "detail";

    private static final String PAGE_SIGNUP = BASE_PATH + "signup";

    private static final String PAGE_REDIRECT_DEFAULT = "redirect:view";


    @Autowired
    UserService userService;

    @ModelAttribute("user")
    public User serveNewUser() {
        return new User();
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String getView(Model model) {

        List<User> userList = userService.findAll();
        model.addAttribute("userList", userList);
        return PAGE_VIEW;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getDetail(Model model, @PathVariable Long id) {
        User user = userService.findOne(id);
        model.addAttribute("user", user);
        return PAGE_DETAIL;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String getSignUp() {
        LOGGER.info("Bos user nesnesi gonderildi");
        return PAGE_SIGNUP;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String postSignUp(@ModelAttribute("user") User user, BindingResult result) {
        userService.save(user);
        if (result.hasErrors())
            LOGGER.info("Kullanici kaydinda hata olustu");
        else LOGGER.info("Kullanici kaydi basarili");
        return PAGE_REDIRECT_DEFAULT;
    }
}
