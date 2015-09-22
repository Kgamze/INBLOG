package com.inblog.init;

import com.inblog.entity.Blog;
import com.inblog.entity.Item;
import com.inblog.entity.Role;
import com.inblog.entity.User;
import com.inblog.repository.BlogRepository;
import com.inblog.repository.ItemRepository;
import com.inblog.repository.RoleRepository;
import com.inblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Mesut Doğan <mesut.dogan@indbilisim.com.tr>
 */

@Service
public class InitDBService {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private RoleRepository roleRepository;

    @PostConstruct
    @Transactional
    public void init() {

        ArrayList<Blog> blogList = new ArrayList<Blog>();
        ArrayList<Item> itemList = new ArrayList<Item>();
        Role roleUser = new Role();
        Role roleAdmin = new Role();

        User userDogan = new User();
        User userMesut = new User();
        User admin = new User();

        Blog blog = new Blog();
        blog.setName("jiripankas");
        blog.setUrl("http://feeds.feedburner.com/javavids?format=xml");
        blog.setUser(admin);

        Blog blog2 = new Blog();
        blog2.setName("jiripankas");
        blog2.setUrl("http://feeds.feedburner.com/javavids?format=xml");
        blog2.setUser(admin);


        roleAdmin.setName("ROLE_ADMIN");
        roleUser.setName("ROLE_USER");

        userDogan.setFullName("Dogan");
        userMesut.setFullName("Mesut");
        admin.setFullName("Admin");

        Item item1 = new Item();
        item1.setBlog(blog);
        item1.setDescription("Item description");
        item1.setLink("javavids.com");
        item1.setPublishDate(new Date().toString());
        item1.setTitle("First item in javavid blog");
        item1.setBlog(blog);
        itemList.add(item1);
        blog.setItems(itemList);


        blogList.add(blog);
        blogList.add(blog2);
        blog.setUser(userDogan);
        blog2.setUser(userDogan);
        userDogan.setBlogs(blogList);

        roleRepository.save(roleAdmin);
        roleRepository.save(roleUser);
        userRepository.save(userDogan);
        userRepository.save(userMesut);
        userRepository.save(admin);
        blogRepository.save(blog);
        blogRepository.save(blog2);
        itemRepository.save(item1);


    }
}
