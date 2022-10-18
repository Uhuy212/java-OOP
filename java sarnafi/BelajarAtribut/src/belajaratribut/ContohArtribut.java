/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaratribut;

/**
 *
 * @author hp
 */
public class ContohArtribut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Orang Sarnafi = new Orang();
       Sarnafi.nama = "Sarnafi";
       Sarnafi.alamat = "Sumedang";
       Sarnafi.umur = 21;
       Sarnafi.menikah = false;
        
        Orang rina  = new Orang();
        rina.nama = "Budi";
        rina.alamat = "Bandung";
        rina.umur = 25;
        rina.menikah = false;
        
        System.out.println(Sarnafi.nama);
    }
    
}
