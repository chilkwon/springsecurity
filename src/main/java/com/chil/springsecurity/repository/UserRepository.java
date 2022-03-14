package com.chil.springsecurity.repository;

import com.chil.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// No need @Repository for IOC because JpaRepostory has @Repository.
public interface UserRepository extends JpaRepository<User,Integer> {

}
