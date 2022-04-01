package com.wendells.taxcalculator;

import java.math.BigDecimal;

public class CaliforniaSalesTaxCalculatorStrategy implements SalesTaxCalculatorStrategy {
    public static final BigDecimal tax = new BigDecimal("0.065");

    @Override
    public BigDecimal calculate(BigDecimal sales) {
        return tax.multiply(sales);
    }
}
