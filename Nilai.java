/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo_J2
 */
public class Nilai implements Penilaian {
    private final double uts;
    private final double uas;
    private final double tugas;

    public Nilai(double uts, double uas, double tugas) {
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    
    public double hitungNilaiAkhir() {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3);
    }
    
    public String grade() {
        double nilai = hitungNilaiAkhir();
        if (nilai >= 85) return "A";
        else if (nilai >= 75) return "B";
        else if (nilai >= 65) return "C";
        else return "D";
    }
}