package com.inblog.repository;

import com.inblog.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mesut Doğan <mesut.dogan@indbilisim.com.tr>
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
