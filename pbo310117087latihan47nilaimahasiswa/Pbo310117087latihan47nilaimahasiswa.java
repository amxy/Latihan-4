package pbo310117087latihan47nilaimahasiswa;

/**
 *
 * @author amxyfa
 * Nama      : Ahmad Maula
 * Kelas     : IF - 3
 * NIM       : 10117087
 * Deskripsi : nilai mahasiswa
 */
import java.util.Scanner;
public class Pbo310117087latihan47nilaimahasiswa {

    private static double quiz,uts,uas,NA;
    private static String index,keterangan;
    
    public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    mahasiswa mhs = new mahasiswa();
    
        System.out.print("QUIZ = ");
        quiz = scn.nextDouble();
        System.out.print("UTS  = ");
        uts = scn.nextDouble();
        System.out.print("UAS  = ");
        uas = scn.nextDouble();
        System.out.println("");
        System.out.print("Nilai Akhir = "+mhs.NA(quiz, uts, uas));
        System.out.println("");
        System.out.println("Index = "+mhs.aturanIndex(index));
        System.out.println("Keteraangan = "+mhs.aturanKeterangan(keterangan));
    }
    
}
