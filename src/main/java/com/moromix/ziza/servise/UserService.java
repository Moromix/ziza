package com.moromix.ziza.servise;

import com.moromix.ziza.model.User;

public interface UserService {
    void save(User user);
    User findBayUsername(String username);
}
