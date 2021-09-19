
public class hasil_perhitungan_BMI {
    public static void main(String[] args) {
      
        proses_perhitungan bmi = new proses_perhitungan();
        bmi.berat_badandoni= 75;
        bmi.tinggi_badandoni= 175;
        bmi.berat_badandudun= 75;
        bmi.tinggi_badandudun= 172;
        System.out.println("===================================================="); 
        System.out.println("PERHITUNGAN BMI (BODY MASS INDEX)/ INDEKS MASA TUBUH");
        System.out.println("====================================================");
        
        double hasil_hitung_doni = bmi.operasi_hitung_bmi_doni();
        System.out.println("NAMA                : DONI BAMBANG PAMUNGKAS");
        System.out.println("JENIS KELAMIN       : LAKI-LAKI");
        System.out.println("ALAMAT              : SUMEDANG ");
        System.out.println("PEKERJAAN           : MODEL ");
        System.out.println("UMUR                : 20 ");
        System.out.println("BERAT BADAN         : " +bmi.berat_badandoni  + "kg");
        System.out.println("TINGGI BADAN        : " +bmi.tinggi_badandoni + "cm");
        System.out.println("NILAI BMI           : " +hasil_hitung_doni);
        
        if(hasil_hitung_doni<18){
        System.out.println("KRITERIA BADAN      : Kurus ");
        }
        else if(hasil_hitung_doni>=18 && hasil_hitung_doni<=25) {
        System.out.println("KRITERIA BADAN      : Ideal ");
        }
         else if(hasil_hitung_doni> 25 && hasil_hitung_doni<=27) {
        System.out.println("KRITERIA BADAN      : Gemuk ");
        }
        
        System.out.println("===============================================");
        double hasil_hitung_dudun = bmi.operasi_hitung_bmi_dudun();
        System.out.println("NAMA                : DUDUN EKO SATRIA ");
        System.out.println("JENIS KELAMIN       : LAKI-LAKI");
        System.out.println("ALAMAT              : BANDUNG ");
        System.out.println("PEKERJAAN           : MODEL ");
        System.out.println("UMUR                : 20 ");
        System.out.println("BERAT BADAN         : " +bmi.berat_badandudun + "kg");
        System.out.println("TINGGI BADAN        : " +bmi.tinggi_badandudun+ "cm");
        System.out.println("NILAI BMI           : " +hasil_hitung_dudun);
        
        if(hasil_hitung_dudun<18){
        System.out.println("KRITERIA BADAN      : Kurus ");
        }
        else if(hasil_hitung_dudun>=18 && hasil_hitung_dudun<=25) {
        System.out.println("KRITERIA BADAN      : Ideal ");
        }
         else if(hasil_hitung_dudun >25 && hasil_hitung_dudun<=27) {
        System.out.println("KRITERIA BADAN      : Gemuk ");
        }
        System.out.println("===============================================");
    }
    
}
