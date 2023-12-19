package com.harmeet.rest.webservices.restfulwebservices.socialmedia.dao;

import com.harmeet.rest.webservices.restfulwebservices.socialmedia.user.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount=0;

    static {
        users.add(new User(++userCount, "Harmeet", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount, "Payal", LocalDate.now().minusYears(25)));
        users.add(new User(++userCount, "Renu", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(Integer id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }
}
