
package pbo3.pkg10117087.latihan41.massajenis;

/**
 *
 * @author amxyfa
 */
public class kubus {
    private int sisi,massa;
    
    public int getSisi(){
        return sisi;
    }
    
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public int getMassa(){
        return massa;
    }
    
    public void setMassa(int massa){
        this.massa = massa;
    }
    
    public int hitungVolume (int hitungVolume){
        return sisi*sisi*sisi;
    }
    
    public int hitungMassaJenis (int hitungMassaJenis){
        return massa * (sisi*sisi*sisi);
    }
}
