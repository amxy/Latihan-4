package pbo310117087latihan50energikinetik;

import java.text.DecimalFormat;

/**
 *
 * @author amxyfa
 * Nama      : Ahmad Maula
 * Kelas     : IF - 3
 * NIM       : 10117087
 * Deskripsi : menghitung energi kinetik
 */
public class Pbo310117087latihan50energikinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    kinetik kntk =new kinetik ();
    kntk.setMassa(145);
    kntk.setKecepatan(25);
    kntk.setKecepatanAwal(0);
    kntk.setKecepatanAkhir(25);
    
    DecimalFormat df = new DecimalFormat("#.#");
    
    System.out.println("=====PROGRAM MENCARI ENERGI KINETIK=====");
        System.out.println("Energi Kinetik : " + df.format(
                           kntk.hitungEnergi
                          (kntk.getMassa(), kntk.getKecepatan())));
        System.out.println("Usaha : " + df.format (kntk.hitungUsaha
                          (kntk.getKecepatanAwal(), 
                           kntk.getKecepatanAkhir())));
    }
    
}
