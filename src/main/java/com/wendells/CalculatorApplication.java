package com.wendells;

import com.wendells.taxcalculator.*;

import java.math.BigDecimal;

public class CalculatorApplication {
    public static void main(String[] args) {
        //MN=6.78%
        SalesTaxCalculatorStrategy minnesotaSalesTaxCalculatorStrategy = new MinnesotaSalesTaxCalculatorStrategy();
        SalesTaxCalculator minnesotaSalesTaxCalculator = new SalesTaxCalculator(minnesotaSalesTaxCalculatorStrategy);
        BigDecimal mnSales = new BigDecimal("100");
        BigDecimal mnTax = minnesotaSalesTaxCalculator.calculate(mnSales);
        print("Minnesota", mnTax, mnSales);

        //CA=6.5%
        SalesTaxCalculatorStrategy californiaSalesTaxCalculatorStrategy = new CaliforniaSalesTaxCalculatorStrategy();
        SalesTaxCalculator californiaSalesTaxCalculator = new SalesTaxCalculator(californiaSalesTaxCalculatorStrategy);
        BigDecimal caSales = new BigDecimal("100");
        BigDecimal caTax = californiaSalesTaxCalculator.calculate(caSales);
        print("California", caTax, caSales);

        //NY=4.00%
        SalesTaxCalculatorStrategy newYorkSalesTaxCalculatorStrategy = new NewYorkSalesTaxCalculatorStrategy();
        SalesTaxCalculator newYorkSalesTaxCalculator = new SalesTaxCalculator(newYorkSalesTaxCalculatorStrategy);
        BigDecimal nySales = new BigDecimal("100");
        BigDecimal nyTax = newYorkSalesTaxCalculator.calculate(nySales);
        print("New York", nyTax, nySales);

        //NM=5.125%
        SalesTaxCalculatorStrategy newMexicoSalesCalculatorStrategy = new NewMexicoSalesTaxCalculatorStrategy();
        SalesTaxCalculator newMexicoSalesTaxCalculator = new SalesTaxCalculator(newMexicoSalesCalculatorStrategy);
        BigDecimal nmSales = new BigDecimal("100");
        BigDecimal nmTax = newMexicoSalesTaxCalculator.calculate(nmSales);
        print("New Mexico", nmTax, nmSales);

        //TX=6.25%
        SalesTaxCalculatorStrategy texasSalesCalculatorStrategy = new TexasSalesTaxCalculatorStrategy();
        SalesTaxCalculator texasSalesTaxCalculator = new SalesTaxCalculator(texasSalesCalculatorStrategy);
        BigDecimal txSales = new BigDecimal("100");
        BigDecimal txTax = texasSalesTaxCalculator.calculate(txSales);
        print("Texas", txTax, txSales);
    }

    public static void print(String state, BigDecimal tax, BigDecimal amount) {
        System.out.println("In " + state + ", an amount of $" + tax.stripTrailingZeros()
                + " will be taxed for every $" + amount + " amount of sales.");
    }
}