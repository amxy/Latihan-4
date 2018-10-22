package pbo310117087latihan44hukumohm;

/**
 *
 * @author amxyfa
 */
public class baterai {
    private double kuatArus=3 , hambatan=12.0;
    
    
    public baterai(){
    }
    
    public double getKuatArus(){
        System.out.println("Kuat Arus :"+kuatArus+" ampere");
        return kuatArus;
    }
    
    public double getHambatan(){
        System.out.println("Hambatan :"+hambatan+" ohm");
        return hambatan;
    }
    
    public double hitungTegangan(){
        return kuatArus*hambatan;
    }
    
    
}
