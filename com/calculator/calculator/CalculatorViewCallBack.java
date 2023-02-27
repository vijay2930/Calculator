package com.calculator.calculator;

import com.calculator.dto.Expression;

import java.util.List;

public interface CalculatorViewCallBack {
    void getMyHistoryFailed(String s);

    void getMyHistorySuccessfully(List<Expression> expressionList);

    void getResultFailed(String s);

    void getResultSuccessfully(String res);
}
