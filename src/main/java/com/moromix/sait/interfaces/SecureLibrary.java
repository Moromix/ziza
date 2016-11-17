package com.moromix.sait.interfaces;


import com.moromix.sait.objects.User;

public interface SecureLibrary {

    boolean login(User user);

    void logout(User user);

}
