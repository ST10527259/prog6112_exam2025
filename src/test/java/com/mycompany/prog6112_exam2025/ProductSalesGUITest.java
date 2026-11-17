/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prog6112_exam2025;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProductSalesGUITest {
  
    // Instantiates ProductSalesData instead of ProductSales
    private ProductSalesData logic = new ProductSalesData();

    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {
        int expected = 2;
        int actual = logic.GetSalesOverLimit();
        assertEquals(expected, actual);
    }

    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        int expected = 4;
        int actual = logic.GetSalesUnderLimit();
        assertEquals(expected, actual);
    }
}
