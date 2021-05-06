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
public class TiketService {
    Tiket[] tikets = new Tiket[5];
    int idx;

    void tambah(Tiket t) {
        if (idx < tikets.length) {
            tikets[idx] = t;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampilAll() {
        for (Tiket t : tikets) {
            System.out.println("Maskapai : " + t.maskapai);
            System.out.println("Harga    : " + t.harga);
            System.out.println("Asal     : " + t.asal);
            System.out.println("Tujuan   : " + t.tujuan);
            System.out.println("");
        }
    }

    void bubblesort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            for (int j = 1; j < tikets.length - i; j++) {
                if (tikets[j].harga > tikets[j - 1].harga) {
                    Tiket tmp = tikets[j];
                    tikets[j] = tikets[j - 1];
                    tikets[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            int idxMin = i;
            for (int j = 0; j < tikets.length; j++) {
                if (tikets[j].harga < tikets[idxMin].harga) {
                    idxMin = j;
                }
            }
            Tiket tmp = tikets[idxMin];
            tikets[idxMin] = tikets[i];
            tikets[i] = tmp;
        }
    }
}
