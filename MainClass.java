import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        ArrayList<Dosen> listDosen = new ArrayList<>();
        ArrayList<MataKuliah> listMatkul = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== SISTEM AKADEMIK ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Data Dosen");
            System.out.println("3. Input Mata Kuliah");
            System.out.println("4. Input Nilai Mahasiswa");
            System.out.println("5. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("NIM     : ");
                    String nim = input.nextLine();
                    System.out.print("Nama    : ");
                    String nama = input.nextLine();
                    System.out.print("Jurusan : ");
                    String jurusan = input.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, jurusan);
                    listMahasiswa.add(mhs);
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.print("NIDN        : ");
                    String nidn = input.nextLine();
                    System.out.print("Nama Dosen  : ");
                    String namaDosen = input.nextLine();
                    System.out.print("Mata Kuliah : ");
                    String mkDosen = input.nextLine();

                    Dosen dsn = new Dosen(nidn, namaDosen, mkDosen);
                    listDosen.add(dsn);
                    System.out.println("Data dosen berhasil ditambahkan.");
                    break;

                case 3:
                    System.out.print("Kode MK : ");
                    String kode = input.nextLine();
                    System.out.print("Nama MK : ");
                    String namaMK = input.nextLine();
                    System.out.print("SKS     : ");
                    int sks = input.nextInt();

                    MataKuliah mk = new MataKuliah(kode, namaMK, sks);
                    listMatkul.add(mk);
                    System.out.println("Mata kuliah berhasil ditambahkan.");
                    break;

                case 4:
                    System.out.print("Nilai UTS   : ");
                    double uts = input.nextDouble();
                    System.out.print("Nilai UAS   : ");
                    double uas = input.nextDouble();
                    System.out.print("Nilai Tugas: ");
                    double tugas = input.nextDouble();

                    Nilai nilai = new Nilai(uts, uas, tugas);
                    System.out.println("Nilai Akhir: " + nilai.hitungNilaiAkhir());
                    break;

                case 5:
                    System.out.println("\n--- DATA MAHASISWA ---");
                    for (Mahasiswa m : listMahasiswa) {
                        m.tampilInfo();
                        System.out.println("------------------");
                    }

                    System.out.println("\n--- DATA DOSEN ---");
                    for (Dosen d : listDosen) {
                        d.tampilInfo();
                        System.out.println("------------------");
                    }

                    System.out.println("\n--- DATA MATA KULIAH ---");
                    for (MataKuliah matkul : listMatkul) {
                        matkul.tampilMatkul();
                    }

                    System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
                    break;
            }

        } while (pilihan != 0);

        System.out.println("Program selesai. Terima kasih.");
    }
}
