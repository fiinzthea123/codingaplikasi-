/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author A'finarizkia
 */
public class Buku {
    private String kodebuku;
    private String judulbuku;
    private String pengarang;
    private String penerbit;
    
    public Buku() {
}
    public Buku (String kodebuku, String judulbuku, String pengarang, String penerbit) {
        this.kodebuku = kodebuku;
        this.judulbuku = judulbuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit; 
    }
    
    public String getkodebuku () {
        return kodebuku;
    }
    
    public void setkodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }
    
    public String getjudulbuku () {
        return judulbuku;
    }
    
    public void setjudulbuku(String judulbuku) {
        this.judulbuku = judulbuku;
    }
    
    public String getpengarang () {
        return pengarang;
    }
    
    public void setpengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    
    public String getpenerbit () {
        return penerbit;
    }
    
    public void setpenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
}