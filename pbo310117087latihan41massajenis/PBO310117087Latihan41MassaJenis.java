package pbo3.pkg10117087.latihan41.massajenis;

/**
 *
 * @author
 * Nama      : Ahmad Maula
 * Kelas     : IF - 3
 * NIM       : 10117087
 * Deskripsi : menampilkan hasil perhitungan volume & massa jenis kubus
 */
public class PBO310117087Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=======Massa Jenis Kubus======");
        kubus objKubus = new kubus();
        objKubus.setSisi(5);
        objKubus.setMassa(250);
        System.out.println("Sisi   : "+objKubus.getSisi());
        System.out.println("Massa  : "+objKubus.getMassa());
        System.out.println("");
        System.out.println("=======Hasil Perhitungan======");
        System.out.println("Volume      : "+objKubus.hitungVolume(0));
        System.out.println("Massa Jenis : "+objKubus.hitungMassaJenis(0));
        
    }
    
}
