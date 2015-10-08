package com.inblog.service;

import com.inblog.entity.Item;
import com.inblog.jaxb.ObjectFactory;
import com.inblog.jaxb.TRss;
import com.inblog.jaxb.TRssChannel;
import com.inblog.jaxb.TRssItem;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 10/8/15.
 */

@Service
public class RssService {

    public List<Item> getItems(String url) {
        return getItems(new StreamSource(url));
    }

    public List<Item> getItems(File file) {
        return getItems(new StreamSource(file));
    }


    public List<Item> getItems(Source source) {
        System.out.println("Hello");
        List<Item> itemList = new ArrayList<Item>();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement<TRss> jaxbElement = unmarshaller.unmarshal(source, TRss.class);
            TRss rss = jaxbElement.getValue();
            List<TRssChannel> rssChannels = rss.getChannel();

            for (TRssChannel rssChannel : rssChannels) {
                List<TRssItem> rssItems = rssChannel.getItem();
                for (TRssItem rssItem : rssItems) {
                    Item item = new Item();
                    item.setTitle(rssItem.getTitle());
                    item.setDescription(rssItem.getDescription());
                    item.setLink(rssItem.getLink());
                    String date = rssItem.getPubDate();
                    item.setPublishDate(date);
                    itemList.add(item);
                    System.out.println("------------------>Item has received : " + item.getTitle());
                }
            }
        } catch (JAXBException e) {
            System.out.println("ERROR  JAXB : " + e);
        }
        return itemList;
    }

}