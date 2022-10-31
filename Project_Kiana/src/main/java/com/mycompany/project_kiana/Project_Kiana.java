/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project_kiana;

/**
 *
 * @author MSI Katana GF66
 * Gilang Fibarkah 21103062
 */
public class Project_Kiana {

    public static void main(String[] args) {
        schariac Objek = new schariac ();
        kaslana mathMenu = new kaslana();
        do {
            mathMenu.menuPilihan();
            switch (mathMenu.pilihan){
                case 1 -> Objek.inisialisasiTitik();
                case 2 -> Objek.tampilTitik();
                case 3 -> Objek.perkalianSkalar();
                case 4 -> Objek.pencerminanSumbuX();
                case 5 -> Objek.pencerminanSumbuY();
                case 6 -> System.out.println("Jarak = " + Objek.jarak());
                case 0 -> System.out.println("Anda keluar");
                default -> System.out.println("Pilihan Anda Salah");
            }
        }while(mathMenu.pilihan!=0);
    }
}

    

