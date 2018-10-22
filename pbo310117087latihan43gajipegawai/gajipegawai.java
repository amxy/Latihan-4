package pbo310117087latihan43gajipegawai;

public class gajipegawai {
private String nama,alamat;
private int uangTransport,uangTunjangan,gajiPokok,totalGaji;

public String getNama(){
    return nama;
}

public void setNama(String nama){
    this.nama = nama;
}

public String getAlamat(){
    return alamat;
}

public void setAlamat(String alamat){
    this.alamat = alamat;
}

public int getUangTransport(){
    return uangTransport;
}

public void setUangTransport(int uangTransport){
    this.uangTransport = uangTransport;
}

public int getUangTunjangan(){
    return uangTunjangan;
}

public void setUangTunjangan(int uangTunjangan){
    this.uangTunjangan = uangTunjangan;
}

public int getGajiPokok(){
    return gajiPokok;
}

public void setGajiPokok (int gajiPokok){
    this.gajiPokok = gajiPokok;
}

public int getTotalGaji (){
    return totalGaji;
}

public void setTotalGaji (int totalGaji){
    this.totalGaji = totalGaji;
}

public int totalGaji (){
    totalGaji = uangTunjangan + uangTransport + gajiPokok;
    return totalGaji;
}

public void tampilData (String nama, String alamat, int uangTunjangan,
        int uangTransport, int gajiPokok, int totalGaji){
    
                    
    System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
    System.out.println("-------------------------------------");
    
    gajipegawai gjp = new gajipegawai();
    gjp.setNama("Rizki Adam Kurniawan");
    gjp.setAlamat("Jalan Semar 4 No 72/66");
    gjp.setUangTransport(250000);
    gjp.setUangTunjangan(300000);
    gjp.setGajiPokok(4500000);
    
    System.out.println("Nama Karyawan  : "+gjp.getNama());
    System.out.println("Alamat         : "+gjp.getAlamat());
    System.out.println("Uang Transport : Rp. "+gjp.getUangTransport());
    System.out.println("Uang Tunjangan : Rp. "+gjp.getUangTunjangan());
    System.out.println("Gaji Pokok     : Rp. "+gjp.getGajiPokok());
    System.out.println("Total Gaji     : Rp. "+gjp.totalGaji());
}


}
