package com.wendells.taxcalculator;

import java.math.BigDecimal;

public interface SalesTaxCalculatorStrategy {
    public BigDecimal calculate(BigDecimal sales);
}
