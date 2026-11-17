/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.mycompany.prog6112_exam2025;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProductSalesTest {

    // Instantiate backend logic object
    private ProductSales logic = new ProductSales();
    
    // Sample 2D sales data array: 2 Years x 3 Quarters
    private int[][] testSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    // Test 1: Verify total sales calculation (300+150+700+250+200+600 = 2200)
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        int expectedTotal = 2200;
        int actualTotal = logic.TotalSales(testSales);
        assertEquals(expectedTotal, actualTotal);
    }

    // Test 2: Verify average sales calculation (2200 / 6 = 366.67)
    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        double expectedAverage = 366.67;
        double actualAverage = logic.AverageSales(testSales);
        assertEquals(expectedAverage, actualAverage, 0.01); // 0.01 delta for double precision
    }
}