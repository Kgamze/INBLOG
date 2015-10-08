package com.inblog.service;

import com.inblog.entity.Blog;
import com.inblog.entity.Item;
import com.inblog.repository.BlogRepository;
import com.inblog.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 10/7/15.
 */

@Service
public class BlogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogRepository.class);

    @Autowired
    BlogRepository blogRepository;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    RssService rssService;

    public void save(Blog blog) {
        List<Item> itemList = rssService.getItems(blog.getUrl());
        blog.setItems(itemList);
        blogRepository.save(blog);
        for (Item item : itemList) {
            item.setBlog(blog);
        }
        itemRepository.save(itemList);
    }

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    public void saveItems(Blog blog) {

    }

}
