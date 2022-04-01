package com.wendells.taxcalculator;

import java.math.BigDecimal;

public class MinnesotaSalesTaxCalculatorStrategy implements SalesTaxCalculatorStrategy {
    public static final BigDecimal tax = new BigDecimal("0.0678");

    @Override
    public BigDecimal calculate(BigDecimal sales) {
        return tax.multiply(sales);
    }
}
