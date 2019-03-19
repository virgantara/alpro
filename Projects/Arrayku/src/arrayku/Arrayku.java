/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayku;

/**
 *
 * @author oddy
 */
public class Arrayku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] daftarNama = new String[3];
        daftarNama[0] = "Budi";
        daftarNama[1] = "Susi";
        daftarNama[2] = "Anto";

        for (int i = 0; i < daftarNama.length; i++) {
            System.out.println("Data ke " + i + " : " + daftarNama[i]);
        }

        for (String nama : daftarNama) {
            System.out.println("Nama : " + nama);
        }

        int[] bilangan = {1, 2, 3, 4, 5};
        for (int bil : bilangan) {
            double hasilPangkat = Math.pow(bil, 2);
            System.out.println("Kuadrat dari " + bil + " adalah " + String.valueOf(hasilPangkat));
        }
    }

}
