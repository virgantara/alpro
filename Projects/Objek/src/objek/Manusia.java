/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objek;

/**
 *
 * @author oddy
 */
public class Manusia {

    private String nama = "";
    private int usia = 17;

    public void setNama(String pNama) {
        this.nama = pNama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setUsia(int pUsia) {
        this.usia = pUsia;
    }

    public int getUsia() {
        return this.usia;
    }

    // Kode sakti
    @Override
    public String toString() {
        return "Nama : " + this.nama + ", usia: " + this.usia;
    }
}
