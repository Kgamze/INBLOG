package com.inblog.entity;

import javax.persistence.*;

/**
 * @author Mesut Doğan <mesut.dogan@indbilisim.com.tr>
 */

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    @Column(name = "publish_date")
    private String publishDate;
    private String link;
    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
