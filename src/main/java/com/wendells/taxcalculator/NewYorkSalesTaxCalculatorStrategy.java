package com.wendells.taxcalculator;

import java.math.BigDecimal;

public class NewYorkSalesTaxCalculatorStrategy implements SalesTaxCalculatorStrategy {
    public static final BigDecimal tax = new BigDecimal("0.04");

    @Override
    public BigDecimal calculate(BigDecimal sales) {
        return tax.multiply(sales);
    }
}
