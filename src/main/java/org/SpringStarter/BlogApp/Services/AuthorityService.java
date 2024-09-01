package org.SpringStarter.BlogApp.Services;

import java.util.Optional;

import org.SpringStarter.BlogApp.Repository.AuthorityRepository;
import org.SpringStarter.BlogApp.models.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityService {
    
    @Autowired
    private AuthorityRepository authorityRepository;
    
    public Authority save(Authority authority){
        return authorityRepository.save(authority);
    }

    public Optional<Authority> findById(Long id){
        return authorityRepository.findById(id);
    }
}
