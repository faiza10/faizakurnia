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
public class MainLeague {
     public static void main(String[] args) {
        PremierLeagueService pl=new PremierLeagueService();
        PremierLeague p1=new PremierLeague("Chelsea",29,9,48);
        PremierLeague p2=new PremierLeague("Liverpool",29,45,82);
        PremierLeague p3=new PremierLeague("Manchester United",28,12,42);
        PremierLeague p4=new PremierLeague("Manchester City",27,39,57);
        PremierLeague p5=new PremierLeague("Arsenal",28,4,40);
        
        pl.tambah(p1);
        pl.tambah(p2);
        pl.tambah(p3);
        pl.tambah(p4);
        pl.tambah(p5);
        
        System.out.println("Data Klasemen sebelum Sorting : ");
        pl.tampilAll();
        System.out.println("");
        System.out.println("Data Klasemen setelah sorting desc berdasarkan point");
        pl.insertionSort(false);
        pl.tampilAll();
        System.out.println("");
        System.out.println("Data Klasemen setelah sorting asc berdasarkan point");
        pl.insertionSort(true);
        pl.tampilAll();
    }
}
