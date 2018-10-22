package pbo310117087latihan45cetaknama;

/**
 *
 * @author amxyfa
 * Nama      : Ahmad Maula
 * Kelas     : IF - 3
 * NIM       : 10117087
 * Deskripsi : menghasilkan cetakan nama
 */
import java.util.Scanner;
public class Pbo310117087latihan45cetaknama {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
     Scanner scn  = new Scanner (System.in);
     Scanner scn2 = new Scanner (System.in);
     
    printer prnt = new printer();
    
        System.out.println("=====Aplikasi Pencetak Nama ======");
        System.out.print("Masukkan Nama Anda : ");
        prnt.setNama(scn.nextLine());
        System.out.print("Mau Cetak Nama Berapa Kali :");
        prnt.setJmlCetak(scn2.nextInt());
        prnt.getNama();
        
        System.out.println("Hasil Cetak: ");
        prnt.cetak(prnt.getJmlCetak(), prnt.getNama());
        
     
    }
    
}
