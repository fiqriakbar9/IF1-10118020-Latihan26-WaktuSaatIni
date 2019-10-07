/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waktusaatini;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan data waktu
 * saat anda merunning program ini / waktu saat ini
 */

import java.text.SimpleDateFormat;
import java.util.Date;
public class Waktusaatini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date hariSekarang = new Date();
        SimpleDateFormat ft = new 
        SimpleDateFormat("EEEE, d MMM yyyy " + "hh:mm:ss");
         System.out.println("Hari ini adalah hari : " 
                 + ft.format(hariSekarang));
        System.out.println ("\nDevelop by : Fiqri Akbar Pratama");
    }
    
}
