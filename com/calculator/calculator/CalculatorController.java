package com.calculator.calculator;

import com.calculator.dto.Expression;

import java.util.List;

public class CalculatorController implements CalculatorControllerViewCallBack,CalculatorControllerModelCallBack{
    private CalculatorModelCallBack calculatorModel;
    private CalculatorViewCallBack calculatorView;
    public CalculatorController(CalculatorViewCallBack calculatorView) {
        this.calculatorView=calculatorView;
        this.calculatorModel=new CalculatorModel(this);
    }

    @Override
    public void getMyHistory(String userName, String date) {
        this.calculatorModel.getMyHistory(userName,date);
    }

    @Override
    public void getResult(String userName, String exp) {
        this.calculatorModel.getResult(userName,exp);
    }

    @Override
    public void getMyHistoryFailed(String s) {
        this.calculatorView.getMyHistoryFailed(s);
    }

    @Override
    public void getMyHistorySuccessfully(List<Expression> expressionList) {
        this.calculatorView.getMyHistorySuccessfully(expressionList);
    }

    @Override
    public void getResultFailed(String s) {
        this.calculatorView.getResultFailed(s);
    }

    @Override
    public void getResultSuccessfull(String res) {
        this.calculatorView.getResultSuccessfully(res);
    }
}
