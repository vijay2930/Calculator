package com.calculator.calculator;

public interface CalculatorControllerViewCallBack {
    void getMyHistory(String userName, String date);

    void getResult(String userName, String exp);
}
