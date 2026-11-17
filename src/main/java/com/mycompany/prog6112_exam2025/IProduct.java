/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_exam2025;

// Interface defining calculation methods
public interface IProduct {

    int TotalSales(int[][] productSales);

    double AverageSales(int[][] productSales);

    int MaxSale(int[][] productSales);

    int MinSale(int[][] productSales);
}
