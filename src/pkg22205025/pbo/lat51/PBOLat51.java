/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205025.pbo.lat51;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 * Nama :Ma'rifatu Khirzah
 * Nim :22205025
 * Prodi :Teknik Informatika
 * Deskripsi : Membuat Program dengan gaji karyawan
 * 
 */
class Karyawan {

    protected String nik;
    protected String nama;
    protected String jabatan;
    protected int golongan;

    public String getNIK() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
}

class Manager extends Karyawan {

    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjannganKehadiran(int hadir) {
        tunjanganKehadiran = kehadiran * 10000;
        return tunjanganKehadiran;
    }

    public float tunjanganJabatan(String jabatan) {
        if (jabatan.equals("Manager")) {
            tunjanganJabatan = 2000000;
        } else if (jabatan.equals("Kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }

    public float tunjanganGolongan(int golongan) {
        if (golongan == 1) {
            tunjanganGolongan = 500000;
        } else if (golongan == 2) {
            tunjanganGolongan = 1000000;
        } else if (golongan == 3) {
            tunjanganGolongan = 1500000;
        } else {
            tunjanganGolongan = 0;
        }
        
        return tunjanganGolongan;
    }

}

public class PBOLat51{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager m = new Manager();
        
        System.out.println("===Program Perhitungan Gaji Karyawan====");
        
        System.out.print("Masukkan NIK : ");
        m.setNik(scanner.nextLine());
        
        System.out.print("Masukkan Nama: ");
        m.setNama(scanner.nextLine());
        
        System.out.print("Masukkan Golongan (1/2/3) : ");
        m.setGolongan(scanner.nextInt());
        
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        m.setJabatan(scanner.next());
        
        System.out.print("Masukkan Jumlah Kehadiran : ");
        m.setKehadiran(scanner.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t: " + m.getNIK());
        System.out.println("NAMA\t: " + m.getNama());
        System.out.println("GOLONGAN: " + m.getGolongan());
        System.out.println("JABATAN\t: " + m.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN\t: " + m.tunjanganGolongan(m.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " + m.tunjanganJabatan(m.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + m.tunjannganKehadiran(m.getKehadiran()));
    }
}

