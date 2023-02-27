package com.calculator.login;

import com.calculator.dto.User;

public interface LoginModelCallBack {

    void checkLoginCredential(String email, String password);

    void addNewUser(User user);

    void exit();
}
