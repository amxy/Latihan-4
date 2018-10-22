package pbo310117087latihan46tandanyakamu;

/**
 *
 * @author amxyfa
 * Nama      : Ahmad Maula
 * Kelas     : IF - 3
 * NIM       : 10117087
 * Deskripsi : menampilkan usia saat ini
 */
import java.util.Scanner;
public class Pbo310117087latihan46tandanyakamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        age agekm = new age(2018);
        System.out.println("Masukkan Tahun Lahir Anda : ");
        agekm.setYearBirth(scn.nextInt());
        System.out.println("");
        
        System.out.println("=====Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda : "+agekm.getYearBirth());
        System.out.println("Hari ini Tahun   : "+agekm.getYearNow());
        System.out.println("Umur Kamu Sampai Saat Ini adalah "+agekm.hitungUmur
        ()+" tahun");
        System.out.println("Tandanya Kamu "+agekm.tandanyaKamu(0));
        
    }
    
}
