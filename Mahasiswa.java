/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo_J2
 */
public class Mahasiswa {
 private String nim; 
 private String nama;
 private String jurusan;
 private static int totalMahasiswa = 0;
 
 
 public Mahasiswa (){
     totalMahasiswa++;
 }
 public Mahasiswa(String nim,String nama,String jurusan){
     this.nim = nim;
     this.nama = nama;
     this.jurusan = jurusan ;
     totalMahasiswa++;
 }
 
 public static int getTotalMahasiswa(){
     return totalMahasiswa;
 }

    void tampilInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
