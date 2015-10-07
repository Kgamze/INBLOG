package com.inblog.service;

import com.inblog.entity.Blog;
import com.inblog.repository.BlogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 10/7/15.
 */

@Service
public class BlogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogRepository.class);

    @Autowired
    BlogRepository blogRepository;

    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

}
