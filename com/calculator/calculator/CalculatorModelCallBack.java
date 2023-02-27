package com.calculator.calculator;

public interface CalculatorModelCallBack {
    void getMyHistory(String userName, String date);

    void getResult(String userName, String exp);
}
