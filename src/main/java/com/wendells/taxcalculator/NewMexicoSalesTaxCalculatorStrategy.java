package com.wendells.taxcalculator;

import java.math.BigDecimal;

public class NewMexicoSalesTaxCalculatorStrategy implements SalesTaxCalculatorStrategy {
    public static final BigDecimal tax = new BigDecimal("0.05125");

    @Override
    public BigDecimal calculate(BigDecimal sales) {
        return tax.multiply(sales);
    }
}
