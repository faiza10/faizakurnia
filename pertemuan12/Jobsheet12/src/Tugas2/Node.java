/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author entercomp
 */
public class Node {
    String judulBuku;
    Node prev, next;

    Node(Node prev, String judulBuku, Node next) {
        this.prev = prev;
        this.judulBuku = judulBuku;
        this.next = next;

    }
}
