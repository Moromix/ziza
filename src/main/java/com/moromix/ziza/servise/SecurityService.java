package com.moromix.ziza.servise;

/**
 * Created by vik on 17.11.16.
 */
public interface SecurityService {
    String findLoggerInUsername();

    void autoLogin(String username, String password);
}
