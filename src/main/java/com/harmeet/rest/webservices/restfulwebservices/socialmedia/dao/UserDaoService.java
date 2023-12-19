package com.harmeet.rest.webservices.restfulwebservices.socialmedia.dao;

import com.harmeet.rest.webservices.restfulwebservices.socialmedia.user.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Harmeet", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Payal", LocalDate.now().minusYears(25)));
        users.add(new User(3, "Renu", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findByUserId(Integer id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }
}
