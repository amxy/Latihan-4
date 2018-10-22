package pbo310117087latihan49biayaemaskawin;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author amxyfa
 * Nama      : Ahmad Maula
 * Kelas     : IF - 3
 * NIM       : 10117087
 * Deskripsi : total penjumlahan emas yg dibeli
 */
public class Pbo310117087latihan49biayaemaskawin {

    public static void main(String[] args) {
    DecimalFormat mataUangIndonesia = (DecimalFormat) 
                      DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();
        
        formatRP.setCurrencySymbol("Rp.");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');
        
        mataUangIndonesia.setDecimalFormatSymbols(formatRP);
        
    emas ems = new emas();
    ems.setBerat(15.7);
    ems.setHarga(570000);
    
        System.out.println("======APLIKASI PERHITUNGAN EMAS========");
        System.out.printf("Total Bayar Emas : %s %n ",
                           mataUangIndonesia.format(
                           ems.Perhitungan(ems.getHarga(), 
                           ems.getHarga())));
    }
    
}
