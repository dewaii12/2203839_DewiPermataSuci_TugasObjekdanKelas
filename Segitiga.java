/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author dewipermatasuci
 */
public class Segitiga {
    double alas;
    double tinggi;
    double sisi;
    
    Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }
    
    double getLuas(){
        return 0.5 * alas * tinggi;
    }
    
    double getKeliling(){
        return alas + tinggi + sisi;
    }
}
