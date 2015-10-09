package com.inblog.rss;

import com.inblog.entity.Blog;
import com.inblog.entity.Item;
import com.inblog.service.RssService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 10/8/15.
 */

public class RssServiceTest {

    RssService rssService = new RssService();

    @Test
    public void getItems() {
        List<Item> itemList;
        itemList = rssService.getItems(new Blog());
        Assert.assertTrue(itemList.size() == 0);
    }
}
