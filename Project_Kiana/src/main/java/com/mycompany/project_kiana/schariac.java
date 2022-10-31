/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_kiana;

/**
 *
 * @author MSI Katana GF66
 * Gilang Fibarkah 21103062
 */
import java.util.Scanner;
public class schariac {
    
   Scanner cin = new Scanner(System.in);
   protected int x,y;
   public schariac (){
       x = 0;
       y = 0;
   }
   public void inisialisasiTitik(){
        System.out.print("Masukan Nilai x : " );
        this.x = cin.nextInt();
        System.out.print("Masukan Nilai y : " );
        y = cin.nextInt();
        System.out.println("");
   }
   public void tampilTitik(){
       System.out.println("x = " + x);
       System.out.println
        ("y = " + y);
       System.out.println("");
   }
   public void perkalianSkalar(){
       int s;
       System.out.print("Masukkan bilangan skalar : ");
       s = cin.nextInt();
       System.out.println("skalar = " + ((s * x )+ (s * y)));
       System.out.println("");
       
   }
   public void pencerminanSumbuX(){
       System.out.println("Pencerminan Sumbu X = " + (x - (x + x)));
       System.out.println("");
   }
   public void pencerminanSumbuY(){
       System.out.println("Pencerminan Sumbu Y = " + (y - (y + y)));
       System.out.println("");
   }
   public int jarak (){
       int x2,y2;
       System.out.println("Masukkan koordinat jarak");
       System.out.print("Titik x : ");
       x2 = cin.nextInt();
       System.out.print("Titik Y : ");
       y2 = cin.nextInt();
       return (int) Math.sqrt(((x2 - x )* (x2 - x)) + ((y2 - y) * (y2 - y)));
   }
}
