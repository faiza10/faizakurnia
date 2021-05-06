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
public class PremierLeagueService {
    PremierLeague[] leagues = new PremierLeague[5];
    int idx;

    void tambah(PremierLeague t) {
        if (idx < leagues.length) {
            leagues[idx] = t;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampilAll() {
        for (PremierLeague t : leagues) {
            System.out.println("Team " + t.team);
            System.out.println("Play : " + t.play);
            System.out.println("Goal : " + t.goal);
            System.out.println("Points : " + t.points);
            System.out.println("");
        }
    }

    void insertionSort(boolean asc) {
        for (int i = 0; i < leagues.length; i++) {
            PremierLeague temp = leagues[i];
            int j = i;
            if (asc == true) {
                while (j > 0 && leagues[j - 1].points > temp.points) {
                    leagues[j] = leagues[j - 1];
                    j--;
                }
                leagues[j] = temp;
            } else {
                while (j > 0 && leagues[j - 1].points < temp.points) {
                    leagues[j] = leagues[j - 1];
                    j--;
                }
                leagues[j] = temp;
            }
        }
    }
}
