package org.SpringStarter.BlogApp.Repository;

import org.SpringStarter.BlogApp.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority,Long>{

    
}