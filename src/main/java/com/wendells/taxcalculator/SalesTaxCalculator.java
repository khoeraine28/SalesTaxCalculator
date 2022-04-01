package com.wendells.taxcalculator;

import java.math.BigDecimal;

public class SalesTaxCalculator {
    private final SalesTaxCalculatorStrategy calculatorStrategy;

    public SalesTaxCalculator(SalesTaxCalculatorStrategy calculatorStrategy) {
        this.calculatorStrategy = calculatorStrategy;
    }

    public BigDecimal calculate(BigDecimal sales) {
        return calculatorStrategy.calculate(sales);
    }
}
