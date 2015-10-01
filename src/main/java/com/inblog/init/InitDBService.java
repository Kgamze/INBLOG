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
import java.util.List;

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
        userDogan.setUserName("dogan");
        userDogan.setPassword("1");
        userMesut.setFullName("Mesut");
        userMesut.setUserName("mesut");
        userMesut.setPassword("1");
        admin.setFullName("Admin");
        admin.setUserName("admin");
        admin.setPassword("1");

        List<Role> roleList = new ArrayList<Role>();
        List<User> userList = new ArrayList<User>();

        roleList.add(roleAdmin);
        roleList.add(roleUser);

        userList.add(userDogan);

        userDogan.setRoles(roleList);

        roleAdmin.setUsers(userList);
        roleUser.setUsers(userList);


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

        roleRepository.save(roleUser);
        roleRepository.save(roleAdmin);
        userRepository.save(userDogan);


    }
}
