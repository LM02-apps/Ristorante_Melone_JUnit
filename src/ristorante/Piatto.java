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
public class Piatto {

    private String nome;
    private String tipo;
    private Vector<Ingrediente> piatto;

    public Piatto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        piatto = new Vector<Ingrediente>(1, 1);
    }

    public void AggiuntaIngredientte(Ingrediente x) {
        piatto.addElement(x);
    }

    public void RimozioneIngredientte(Ingrediente x) {
        piatto.removeElement(x);
    }

    public double getPre() {
        double d = 0.0;
        Ingrediente i = new Ingrediente("", 0, 0);
        for (int in = 0; in < piatto.size(); in++) {
            i = (Ingrediente) piatto.elementAt(in);
            d += i.getPrezzo();
        }
        return d;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        String s = "Nome: " + nome + " Tipo: " + tipo + " Prezzo: " + getPre();
        return s;
    }

}
