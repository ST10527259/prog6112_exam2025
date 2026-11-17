/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_exam2025;

// Renamed to ProductSalesData to avoid naming conflicts with Question 1
public class ProductSalesData implements IProductSales {

    // 2D Array: 2 Years (rows), 3 Products (Microphone, Speakers, Mixing Desk)
    private int[][] salesData = {
        {300, 150, 700}, // Year 1
        {250, 200, 600} // Year 2
    };

    // Sales limit threshold set to 500
    private final int SALES_LIMIT = 500;

    @Override
    public int[][] GetProductSales() {
        return salesData;
    }

    // Calculate total of all sales (300+150+700+250+200+600 = 2200)
    @Override
    public int GetTotalSales() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    // Calculate average sales across all items
    @Override
    public double GetAverageSales() {
        int total = GetTotalSales();
        int totalElements = 0;
        for (int i = 0; i < salesData.length; i++) {
            totalElements += salesData[i].length;
        }
        return (double) total / totalElements;
    }

    // Count sales strictly greater than 500 (Returns 2: 700 and 600)
    @Override
    public int GetSalesOverLimit() {
        int count = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                if (salesData[i][j] > SALES_LIMIT) {
                    count++;
                }
            }
        }
        return count;
    }

    // Count sales less than or equal to 500 (Returns 4: 300, 150, 250, 200)
    @Override
    public int GetSalesUnderLimit() {
        int count = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                if (salesData[i][j] <= SALES_LIMIT) {
                    count++;
                }
            }
        }
        return count;
    }

    // Returns number of years processed (2 rows = 2 years)
    @Override
    public int GetProductsProcessed() {
        return salesData.length;
    }
}
