package org.SpringStarter.BlogApp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Authority {

    @Id
    public Long id;

    private String name;
    
}
