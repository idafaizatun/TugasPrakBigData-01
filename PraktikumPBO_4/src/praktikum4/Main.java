/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja dan mengisialisasi dengan nama, usia, pekerjaan, dan gaji
        Pekerja pekerja2 = new Pekerja("Albert", 22, "Software Engineer", 5000000);
        
        // Menampilkan informasi pekerja menggunakan metode toString()
        System.out.println(pekerja2.toString ());
        
        // Mengubah nama pekerja menggunakan metode setter
        pekerja2.setNama("Ferry");
        
        // Menampilkan ulang informasi pekerja setelah mengubah nama
        System.out.println("Informasi setelah mengubah nama :");
        System.out.println(pekerja2.toString());
    }
}
