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
public class Ristorante {

    private Vector<Piatto> menu;
    private Vector<Ordine> ordin;

    public Ristorante() {
        menu = new Vector<Piatto>();
        ordin = new Vector<Ordine>();
    }

    public Vector<Piatto> Tipopiatti(String tipopiatto) {
        Vector<Piatto> ordinetipo;
        ordinetipo = new Vector<Piatto>();
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getTipo().equals(tipopiatto)) {
                ordinetipo.addElement(menu.get(i));
            }
        }

        return ordinetipo;
    }

    public void AggiuntaPiatto(Piatto x) {
        menu.addElement(x);
    }

    public void RimozionePiatto(Piatto x) {
        menu.removeElement(x);
    }

    public int Importomax() {
        double in = 0.0;
        int v = 0;
        Ordine o = new Ordine(0, "");
        for (int j = 0; j < ordin.size(); j++) {
            o = ordin.get(j);

            if (in < o.getprezzo()) {
                in = o.getprezzo();
                v = j;
            }
        }

        return v;
    }

    public double IncassoGiornaliero() {
        double in = 0.0;
        Ordine o = new Ordine(0, "");
        for (int j = 0; j < ordin.size(); j++) {
            o = ordin.get(j);
            for (int i = 0; i < o.getSize(); i++) {
                in += o.getprezzo();
            }
        }
        return in;
    }

    public String toString(int i) {
        Piatto p = new Piatto("", "");
        p = (Piatto) menu.elementAt(i);
        String s = p.toString();
        System.out.println(s);
        return s;
    }

    public void AggiuntaOrdine(Ordine x) {
        ordin.addElement(x);
    }

    public void RimozioneOrdine(int x) {
        ordin.removeElementAt(x);
    }

    public int getSizemenu() {
        return menu.size();
    }

}
