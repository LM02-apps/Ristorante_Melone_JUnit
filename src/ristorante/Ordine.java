/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

import java.util.Vector;

/**
 *
 * @author Melone
 */
public class Ordine {

    private int iden;
    private String nome;
    private Vector<Piatto> ord;
    private double prezzo;

    public Ordine(int iden, String nome) {
        this.iden = iden;
        this.nome = nome;
        ord = new Vector<Piatto>(1, 1);
        prezzo = 0;
    }

    public void addPiatto(Piatto x) {
        prezzo += x.getPre();
        ord.addElement(x);
    }

    public void removePiatto(int x) {
        Piatto p = new Piatto("", "");
        p = (Piatto) ord.elementAt(x);
        prezzo -= p.getPre();
        ord.removeElementAt(x);
    }

    public double getprezzo() {
        return prezzo;
    }

    public int getSize() {
        return ord.size();
    }

}
