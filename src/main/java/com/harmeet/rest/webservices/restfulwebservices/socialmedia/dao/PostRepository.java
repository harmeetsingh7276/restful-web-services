package com.harmeet.rest.webservices.restfulwebservices.socialmedia.dao;

import com.harmeet.rest.webservices.restfulwebservices.socialmedia.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
