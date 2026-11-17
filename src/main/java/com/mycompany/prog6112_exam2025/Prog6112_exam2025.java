/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112_exam2025;

public class Prog6112_exam2025 {

    public static void main(String[] args) {
        // Declare and populate 2D array (2 Years, 3 Quarters)
        int[][] sales = {
            {300, 150, 700}, // YEAR 1
            {250, 200, 600}  // YEAR 2
        };

        // Instantiate logic object
        ProductSales logic = new ProductSales();

        // Perform calculations
        int total = logic.TotalSales(sales);
        double average = logic.AverageSales(sales);
        int max = logic.MaxSale(sales);
        int min = logic.MinSale(sales);

        // Display report
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("--------------------------------------------------");
        System.out.println("Total sales:   " + total);
        System.out.println("Average sales: " + Math.round(average));
        System.out.println("Maximum sale:  " + max);
        System.out.println("Minimum sale:  " + min);
        System.out.println("--------------------------------------------------");
    }
}
