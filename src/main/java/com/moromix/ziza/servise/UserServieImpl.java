package com.moromix.ziza.servise;
/**
 * {@link com.moromix.ziza.servise.UserService} interfase.
 *
 * @autor Viktor Morozov
 * @version 1.0
 */

import com.moromix.ziza.dao.RoleDao;
import com.moromix.ziza.dao.UserDao;
import com.moromix.ziza.model.Role;
import com.moromix.ziza.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServieImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        userDao.save(user);
    }

    @Override
    public User findBayUsername(String username) {

        return userDao.findByUsername(username);
    }
}
