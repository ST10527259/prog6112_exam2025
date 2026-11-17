/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_exam2025;

// Logic class implementing IProduct interface
public class ProductSales implements IProduct {

    // Calculate total product sales across all rows and columns
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                total += productSales[row][col];
            }
        }
        return total;
    }

    // Calculate average product sales
    @Override
    public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);
        int totalItems = 0;

        for (int row = 0; row < productSales.length; row++) {
            totalItems += productSales[row].length;
        }

        if (totalItems == 0) {
            return 0.0;
        }

        return (double) total / totalItems;
    }

    // Find maximum sale value in 2D array
    @Override
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] > max) {
                    max = productSales[row][col];
                }
            }
        }
        return max;
    }

    // Find minimum sale value in 2D array
    @Override
    public int MinSale(int[][] productSales) {
        int min = productSales[0][0];
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] < min) {
                    min = productSales[row][col];
                }
            }
        }
        return min;
    }
}
