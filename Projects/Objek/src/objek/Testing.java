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
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Oddy");
        manusia1.setUsia(19);

        Manusia manusia2 = new Manusia();
        manusia2.setNama("Bejo");
        manusia2.setUsia(33);

        System.out.println(manusia1);
        System.out.println(manusia2);
    }

}
