/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Pekerja extends Manusia {
    private int gaji;   // Atribut tambahan 
    
    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super (nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    // Getter dan Setter untuk atribut gaji
    public int getGaji() {
        return gaji;
    }
    public void setGaji (int gaji) {
        this.gaji = gaji;
    }
    
    // Override metode toString()
    @Override
   public String toString() {
        return "Nama: " + getNama() + "\nUsia: " + usia + "\nPekerjaan: " + pekerjaan + "\nGaji: " + gaji;
   }
}
