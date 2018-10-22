package pbo310117087latihan50energikinetik;

/**
 *
 * @author amxyfa
 */
public class kinetik {
    private double massa, kecepatan, kecepatanAwal, kecepatanAkhir;
    
    public double getMassa(){
    return massa;
    }
    
    public void setMassa(double massa){
    this.massa = massa;
    }
    
    public double getKecepatan(){
    return kecepatan;
    }
    
    public void setKecepatan(double kecepatan){
    this.kecepatan = kecepatan;
    }
    
    public double getKecepatanAwal(){
    return kecepatanAwal;
    }
    
    public void setKecepatanAwal(double kecepatanAwal){
    this.kecepatanAwal = kecepatanAwal;
    }
    
    public double getKecepatanAkhir (){
    return kecepatanAkhir;
    }
    
    public void setKecepatanAkhir(double kecepatanAkhir){
    this.kecepatanAkhir = kecepatanAkhir;
    }
    
    public double hitungEnergi(double massa, double kecepatan){
            return 0.5 * massa * kecepatan * kecepatan;
    }
    
    public double hitungUsaha (double kecepatanAwal, double kecepatanAkhir){
            double ekAwal, ekAkhir,hasil;
            
            ekAwal = 0.5 * massa * kecepatanAwal * kecepatanAwal  ;
            ekAkhir = 0.5 * massa * kecepatanAkhir * kecepatanAkhir  ;
            hasil = ekAkhir - ekAwal;
            
            return hasil;
    }
    
}
