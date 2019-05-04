package com.example.demopassword.repository;


import com.example.demopassword.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("personRepository")
public interface PersonRepository extends JpaRepository<Person, Long> {
        Optional<Person> findByEmail(String email);
        Optional<Person> findByResetToken(String resetToken);

        
        }