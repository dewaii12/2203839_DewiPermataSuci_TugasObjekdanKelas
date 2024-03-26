/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;

public class Pertemuan6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai alas Segitiga 1:");
        double alas1 = input.nextDouble();
        System.out.println("Masukkan nilai tinggi Segitiga 1:");
        double tinggi1 = input.nextDouble();
        System.out.println("Masukkan nilai sisi Segitiga 1:");
        double sisi1 = input.nextDouble();
        Segitiga segitiga1 = new Segitiga();
        System.out.println("Keliling dari Segitiga1 adalah "+segitiga1.getKeliling()+" dan Luas dari Segitiga1 adalah "+segitiga1.getLuas());
    
        Segitiga segitiga2 = new Segitiga();
        System.out.println("\nMasukkan nilai alas Segitiga 2:");
        double alas2 = input.nextDouble();
        System.out.println("Masukkan nilai tinggi Segitiga 2:");
        double tinggi2 = input.nextDouble();
        System.out.println("Masukkan nilai sisi Segitiga 2:");
        double sisi2 = input.nextDouble();
        System.out.println("Keliling dari Segitiga2 adalah "+segitiga2.getKeliling()+" dan Luas dari Segitiga2 adalah "+segitiga2.getLuas());
    
        Segitiga segitiga3 = new Segitiga();
         System.out.println("\nMasukkan nilai alas Segitiga 3:");
        double alas3 = input.nextDouble();
        System.out.println("Masukkan nilai tinggi Segitiga 3:");
        double tinggi3 = input.nextDouble();
        System.out.println("Masukkan nilai sisi Segitiga 3:");
        double sisi3 = input.nextDouble();
        System.out.println("Keliling dari Segitiga3 adalah "+segitiga3.getKeliling()+" dan Luas dari Segitiga3 adalah "+segitiga3.getLuas());
    }
}
