package pbo310117087latihan49biayaemaskawin;

/**
 *
 * @author amxyfa
 */
public class emas {
private double berat;
private int harga;
  
public double getBerat (){
return berat;
}

public void setBerat(double berat){
this.berat = berat;
}

public int getHarga(){
return harga;
}

public void setHarga(int harga){
this.harga = harga;
}

public double Perhitungan(double berat, int harga){
return berat * harga;
}
}
