package com.harmeet.rest.webservices.restfulwebservices.socialmedia.dao;

import com.harmeet.rest.webservices.restfulwebservices.socialmedia.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
