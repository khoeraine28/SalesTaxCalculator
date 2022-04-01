package com.wendells.taxcalculator;

import java.math.BigDecimal;

public class TexasSalesTaxCalculatorStrategy implements SalesTaxCalculatorStrategy {
    public static final BigDecimal tax = new BigDecimal("0.0625");

    @Override
    public BigDecimal calculate(BigDecimal sales) {
        return tax.multiply(sales);
    }
}
