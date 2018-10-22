package pbo310117087latihan47nilaimahasiswa;

/**
 *
 * @author amxyfa
 */
public class mahasiswa {
   private double quiz;
   private double uts;
   private double uas;
   private double nilaiAkhir;
   private double hasil;
   private String index;
   
   public double getQuiz(){
   return quiz;
   }
   
   public void setQuiz(double quiz){
   this.quiz = quiz;
   }
   
   public double getUts(){
   return uts;
   }
   
   public void setUts (double uts){
   this.uts = uts;
   }
   
   public double getUas(){
   return uas;
   }
   
   public void setUas (double uas){
   this.uas = uas;
   }
   
   public double NA(double quiz, double uts, double uas){
   
       hasil = ((0.2 * quiz)+(0.3 * uts)+(0.5 * uas));
       return hasil;
   }
   
   public String aturanIndex (String index){
   if ((hasil>80 ) && (hasil <=100)) {
           index = "A";
        }
        else if ((hasil>68 ) && (hasil <=80)) {
           index = "B";
        }
        else if ((hasil>56 ) && (hasil <=68)) {
           index = "C";
        }
        else if ((hasil>45 ) && (hasil <=56)) {
           index = "D";
        }
        else if ((hasil>0 ) && (hasil <=45)) {
           index = "E";
      
        } 
   
   return index;
   
   }
   
   public String aturanKeterangan (String keterangan){
   if ("A".equals(aturanIndex(index))) {
           keterangan = "Sangat Baik";
        }
        else if ("B".equals(aturanIndex(index))) {
           keterangan = "Baik";
        }
        else if ("C".equals(aturanIndex(index))) {
           keterangan = "Cukup";
        }
        else if ("D".equals(aturanIndex(index))) {
           keterangan = "Kurang";
        }
        else { 
           keterangan = "Sangat Kurang";
        }     
       
        System.out.println("Keterangan = " + keterangan);
       
       return keterangan;
       
       }
   }
