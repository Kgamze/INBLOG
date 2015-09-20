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
        Role roleUser = new Role();
        Role roleAdmin = new Role();
        User userDogan = new User();
        User userMesut = new User();
        User admin = new User();
        Blog blog = new Blog();
        blog.setName("jiripankas");
        blog.setUrl("http://feeds.feedburner.com/javavids?format=xml");
        blog.setUser(admin);
        roleAdmin.setName("ROLE_ADMIN");
        roleUser.setName("ROLE_USER");
        userDogan.setFullName("Dogan");
        userMesut.setFullName("Mesut");
        Item item1 = new Item();
        item1.setBlog(blog);
        item1.setDescription("Item description");
        item1.setLink("javavids.com");
        item1.setPublishDate(new Date().toString());
        item1.setTitle("First item in javavid blog");
        roleRepository.save(roleAdmin);
        roleRepository.save(roleUser);
        userRepository.save(userDogan);
        userRepository.save(userMesut);
        userRepository.save(admin);
        blogRepository.save(blog);
        itemRepository.save(item1);


    }
}
