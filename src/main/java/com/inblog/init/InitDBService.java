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
        Role roleUser = new Role("ROLE_USER");
        Role roleAdmin = new Role("ROLE_ADMIN");

        User userDogan = new User();
        User userMesut = new User();
        User admin = new User();

        roleAdmin.setName("ROLE_ADMIN");
        roleUser.setName("ROLE_USER");

        userDogan.setFirstName("Doğan");
        userDogan.setPassword("1");
        userMesut.setFirstName("Mesut");
        userMesut.setPassword("1");
        admin.setFirstName("Admin");
        admin.setPassword("1");

        List<Role> roleList = new ArrayList();
        List<User> userList = new ArrayList();

        roleList.add(roleAdmin);
        roleList.add(roleUser);

        userList.add(userDogan);

        userDogan.setRoles(roleList);

        roleAdmin.setUsers(userList);
        roleUser.setUsers(userList);


        Item item1 = new Item();
        item1.setDescription("Item description");
        item1.setLink("javavids.com");
        item1.setPublishDate(new Date().toString());
        item1.setTitle("First item in javavid blog");
        itemList.add(item1);
        userDogan.setBlogs(blogList);

        userDogan.setEmail("d");
        userMesut.setEmail("m");

        roleRepository.save(roleUser);
        roleRepository.save(roleAdmin);
        userRepository.save(userDogan);
    }
}
