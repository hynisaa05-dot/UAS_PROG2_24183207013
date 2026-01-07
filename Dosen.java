/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo_J2
 */
public class Dosen {
    private final String nidn;
    private final String nama;
    private final String matkul;

    public Dosen(String nidn, String nama, String matkul) {
        this.nidn = nidn;
        this.nama = nama;
        this.matkul = matkul;
    }

    public void tampilInfo() {
        System.out.println("NIDN        : " + nidn);
        System.out.println("Nama Dosen  : " + nama);
        System.out.println("Mata Kuliah : " + matkul);
    }
}
