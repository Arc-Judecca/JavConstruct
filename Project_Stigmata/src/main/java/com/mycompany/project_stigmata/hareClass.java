/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_stigmata;

/**
 *
 * @author MSI Katana GF66
 * Gilang Fibarkah 21103062
 */
public class hareClass {
    
    //fields
    private int saldo;
    
    //konstruktor
    public void stigma (int saldo){
        this.saldo = saldo;
    }
    
    //method
    void getSaldo (int saldo){
        System.out.println("Selamat Datang di Bank BSI");
        System.out.println("Saldo saat ini : Rp"+saldo);
    }
    void simpanUang (int saving, int saldo){
        saldo = saldo + saving ;
        System.out.println("");
        System.out.println("Simpan uang : Rp"+saving);
        System.out.println("Saldo saat ini : Rp"+saldo);
    }
    
    void ambilUang (int taken, int  saldo){
       saldo = saldo - taken ;
        System.out.println("");
        System.out.println("Ambil uang : Rp"+taken);
        System.out.println("Saldo saat ini : Rp"+saldo);
    }
}
