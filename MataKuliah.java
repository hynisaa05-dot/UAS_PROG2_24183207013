/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo_J2
 */
public class MataKuliah {
    private final String kodeMK;
    private final String namaMK;
    private final int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilMatkul() {
        System.out.println(kodeMK + " - " + namaMK + " (" + sks + " SKS)");
    }
}