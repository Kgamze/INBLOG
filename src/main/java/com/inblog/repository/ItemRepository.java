package com.inblog.repository;

import com.inblog.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mesut Doğan <mesut.dogan@indbilisim.com.tr>
 */

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
