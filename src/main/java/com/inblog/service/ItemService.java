package com.inblog.service;

import com.inblog.entity.Item;
import com.inblog.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 10/9/15.
 */

@Service
public class ItemService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Item.class);

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getItems() {
        return itemRepository.findAll();
    }
}
