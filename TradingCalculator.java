package com.iontrading.tdd;

public class TradingCalculator {
    private final TradingValidator tradingValidator;

    public TradingCalculator(TradingValidator tradingValidator) {
        this.tradingValidator = tradingValidator;
    }


    public int add(int input1, int input2) {
        try {
            if(!tradingValidator.validate()) {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }

        if(input1<0 || input2<0){
            return 0;
        }
        return input1+input2;
    }

    public int divide(int i, int i1) {
        if(!tradingValidator.validate()) {
            return 0;
        }
        if(i1==0){
            throw new IllegalArgumentException();
        }
        return (int) Math.ceil((double) i/(double)i1);
    }
}
