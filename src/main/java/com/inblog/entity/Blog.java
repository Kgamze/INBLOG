package com.inblog.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author Mesut Doğan <mesut.dogan@indbilisim.com.tr>
 */

@Entity
public class Blog {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String url;

    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "blog", cascade = CascadeType.REMOVE)
    private List<Item> items;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
