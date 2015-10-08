package com.inblog.controller;

import com.inblog.entity.Blog;
import com.inblog.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 10/7/15.
 */

@Controller
@RequestMapping("/blog")
public class BlogController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogController.class);

    private static final String BASE_PATH = "/blog/blog-";

    private static final String PAGE_BLOGS = BASE_PATH + "search";

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String postAdd(@ModelAttribute("user") Blog blog) {

        blogService.save(blog);
        return "redirect:/blog/search";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String getSearch(Model model) {
        List<Blog> list = new ArrayList<Blog>();
        list = blogService.findAll();
        model.addAttribute("blog", new Blog());
        model.addAttribute("blogs", list);
        return PAGE_BLOGS;
    }
}
