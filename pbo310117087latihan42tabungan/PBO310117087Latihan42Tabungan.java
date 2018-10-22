
package pbo310117087latihan42tabungan;

/**
 *
 * @author amxyfa
 * Nama      : Ahmad Maula
 * Kelas     : IF - 3
 * NIM       : 10117087
 * Deskripsi : menampilkan perintah sisa saldo dari hasil penarikan uang
 */
import java.util.Scanner;
public class PBO310117087Latihan42Tabungan {

    public static void main(String[] args) {
        Scanner scn   = new Scanner (System.in);
        tabungan tbgn = new tabungan();
                              
        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan Saldo Awal      : ");
        int x = tbgn.tabungan(scn.nextInt());
        System.out.print("Jumlah Uang yang diambil : ");
        int y = tbgn.tabungan(scn.nextInt());
        System.out.println("Saldo Anda Sekarang : "+(tbgn.tabungan(x)- tbgn.ambilUang(y)));
}

}