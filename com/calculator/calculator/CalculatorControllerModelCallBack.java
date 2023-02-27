package com.calculator.calculator;

import com.calculator.dto.Expression;

import java.util.List;

public interface CalculatorControllerModelCallBack {
    void getMyHistoryFailed(String s);

    void getMyHistorySuccessfully(List<Expression> expressionList);

    void getResultFailed(String s);

    void getResultSuccessfull(String res);
}
