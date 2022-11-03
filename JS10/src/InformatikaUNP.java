/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fachri
 */
public class InformatikaUNP {
    public static void main(String[] args) {
        Mahasiswa11 informatika = new Mahasiswa11();
        Mahasiswa11 elektronika = new Mahasiswa11();
        
        informatika.nama = "Happy Alicia";
        informatika.nim = 1;
        informatika.jur = "S1 Informatika";
        informatika.univ = "Universitas Negeri Padang";
        
        elektronika.nama = "Wilson";
        elektronika.nim = 2;
        elektronika.jur = "S1 Elektronika";
        elektronika.univ = "Universitas Negeri Padang";
        
        System.out.println("Data Mahasiswa Informatika");
        System.out.println("Nama : " + informatika.nama);
        System.out.println("NIM : " + informatika.nim);
        System.out.println("Jurusan : " + informatika.jur);
        System.out.println("Status : " + informatika.univ);
        
        System.out.println("------------------------------");
        
        System.out.println("Data Mahasiswa Elektronika");
        System.out.println("Nama : " + elektronika.nama);
        System.out.println("NIM : " + elektronika.nim);
        System.out.println("Jurusan: " + elektronika.jur);
        System.out.println("Status: " + elektronika.univ);
    
    
    
    
    
    
    
    }


}
