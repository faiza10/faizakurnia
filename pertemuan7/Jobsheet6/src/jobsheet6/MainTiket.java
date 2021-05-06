/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

/**
 *
 * @author entercomp
 */
public class MainTiket {
    public static void main(String[] args) {
        
        TiketService ts = new TiketService();
        Tiket t1=new Tiket("Lion Air",1000000,"Gresik","Surabaya");
        Tiket t2=new Tiket("Air Asia",2000000,"Ambon","Maluku");
        Tiket t3=new Tiket("Garuda Air",3000000,"Jakarta","Semarang");
        Tiket t4=new Tiket("Sriwijaya Air",1500000,"Malang","Solo");
        Tiket t5=new Tiket("Batik Air",2500000,"Surabaya","Bandung");
        
        ts.tambah(t1);
        ts.tambah(t2);
        ts.tambah(t3);
        ts.tambah(t4);
        ts.tambah(t5);
        
        System.out.println("Data Maskapai sebelum sorting : ");
        ts.tampilAll();
        System.out.println("");
        System.out.println("Data Maskapai setelah sorting desc berdasarkan harga");
        ts.bubblesort();
        ts.tampilAll();
    }
}
