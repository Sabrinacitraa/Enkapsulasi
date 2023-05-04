/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetterSetter;

/**
 *
 * @author ACER
 */
public class run2 {
    public static void main(String[] args) {
        BanyakData a = new BanyakData();
        
        a.setNama("Sabrina");
        a.setKelas("X RPL 4");
        a.setAlamat("JL.Danau Kerinci");
        a.setKecamatan("Sawojajar");
        a.setKabupaten("Malang");
        
        System.out.println("Nama      : " + a.getNama());
        System.out.println("Kelas     : " + a.getKelas());
        System.out.println("Alamat    : " + a.getAlamat());
        System.out.println("Kecamatan : " + a.getKecamatan());
        System.out.println("Kabupaten : " + a.getKabupaten());
    }
    
}
