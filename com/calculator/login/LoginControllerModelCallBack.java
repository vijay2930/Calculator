package com.calculator.login;

import com.calculator.dto.User;

interface LoginControllerModelCallBack {
    void loginSuccessful(User user);
    void loginFailed(String s);
    void signupFailed(String msg);

    void signupSuccessful(User user);
}
