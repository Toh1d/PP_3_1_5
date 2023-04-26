package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void add(User user);

    void update(User user);

    User getById(Long id);

    User findByUserName(String username);

    void delete(Long id);


}
