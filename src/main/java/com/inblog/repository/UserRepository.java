package com.inblog.repository;

import com.inblog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mesut Doğan <mesut.dogan@indbilisim.com.tr>
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByMail(String mail);
}
