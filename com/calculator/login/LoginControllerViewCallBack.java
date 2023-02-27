package com.calculator.login;

import com.calculator.dto.User;

interface LoginControllerViewCallBack {

    void checkLoginCredential(String email, String password);

    void addNewUser(User user);

    void exit();
}
