package org.lessons.java.shop;

import java.lang.*;

public class Prodotto {

    private int codice;
    private String nome, descrizione;
    private double prezzo, iva;

    public Prodotto(){

        codice = (int) (Math.random()*(99999999-1+1)+1);

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    public void setIva(double iva){
        this.iva = iva;
    }

    public int getCodice(){
        return codice;
    }

    public String getNome(){
        return nome;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public double getIva(){
        return iva;
    }

    public double prezzoIva(){
        return getPrezzo() + getIva();
    }

    public double prezzoNoIva(){
        return getPrezzo();
    }

    private static String padLeft(String s, int n) {
        return String.format("%0" + n + "d", Integer.parseInt(s));
    }

    public String display(){

        String code = String.valueOf(codice);
        int size = 8;

        String afterPad = padLeft(code, size);

        return afterPad + "-" +getNome();
    }

}
