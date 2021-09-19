/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deden
 */
public class proses_perhitungan {
    double berat_badandoni;
    double tinggi_badandoni;
    double berat_badandudun;
    double tinggi_badandudun;
    
    
    double operasi_hitung_bmi_doni (){
        double hasil_hitung_doni = berat_badandoni/(tinggi_badandoni/100*tinggi_badandoni/100);
        return hasil_hitung_doni;
    }
     double operasi_hitung_bmi_dudun (){
        double hasil_hitung_dudun = berat_badandudun/(tinggi_badandudun/100*tinggi_badandudun/100);
        return hasil_hitung_dudun;
    }
}
