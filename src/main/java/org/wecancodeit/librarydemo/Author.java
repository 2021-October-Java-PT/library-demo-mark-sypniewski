package org.wecancodeit.librarydemo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {

        @Id
        @GeneratedValue
        private Long id;
        private String firstName;
        private String lastname;

    public Author(String test_firstName, String test_lastName) {

    }
}
