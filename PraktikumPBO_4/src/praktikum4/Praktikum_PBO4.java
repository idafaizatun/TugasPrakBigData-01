/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Praktikum_PBO4 {
    
    public static void main(String[] args) {
        Kendaraan aku = new Kendaraan("Toyota", 200, "5VZ-FE");
        Mobil ida = new Mobil ("Toyota", 200, "5HVZ-FE", 2);
        aku.tampilkanKendaraan();
        ida.tampilkanInfoMobil();
    }
}
