package com.inblog.repository;

import com.inblog.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mesut Doğan <mesut.dogan@indbilisim.com.tr>
 */

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
}
