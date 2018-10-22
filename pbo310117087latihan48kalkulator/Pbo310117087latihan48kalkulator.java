package pbo310117087latihan48kalkulator;

/**
 *
 * @author amxyfa
 * Nama      : Ahmad Maula
 * Kelas     : IF - 3
 * NIM       : 10117087
 * Deskripsi : perhitungan kalkulator
 */
public class Pbo310117087latihan48kalkulator {

    public static void main(String[] args) {
    kalkulator klk = new kalkulator();
    klk.setValue1(7.0);
    klk.setValue2(5.0);
        System.out.println("VALUE 1 = "+klk.getValue1());
        System.out.println("VALUE 2 = "+klk.getValue2());
    
    klk.setNameProject("");
    klk.setNoteProject("");
        System.out.println("Result Add is      = "+klk.add());
        System.out.println("Result Minus is    = "+klk.minus());
        System.out.println("Result Multiple is = "+klk.multiple());
        System.out.println("Result Division is = "+klk.division());
        
                
    }
    
}
