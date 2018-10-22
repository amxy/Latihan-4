package pbo310117087latihan44hukumohm;

/**
 *
 * @author amxyfa
 * Nama      : Ahmad Maula
 * Kelas     : IF - 3
 * NIM       : 10117087
 * Deskripsi : menghitung tegangan
 */
public class Pbo310117087latihan44hukumohm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    baterai btr = new baterai();
    
        System.out.println("Kuat arus yang mengalir pada suatu kawat pengantar"
        +"akan berbanding lurus dengan beda potensial"
        +"pada ujung-ujung kawar penghantar tersebut"
        +"asalkan suhu kawat dijaga konstan");
        
    btr.getKuatArus();
    btr.getHambatan();
        System.out.println("Hasil Tegangan : "+btr.hitungTegangan());
    }
    
}
