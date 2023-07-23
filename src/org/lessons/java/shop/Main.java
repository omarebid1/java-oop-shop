package org.lessons.java.shop;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Prodotto p1 = new Prodotto();

        System.out.print("inserisci il nome del prodotto : ");
        p1.setNome(scan.nextLine());

        System.out.print("inserisci la descrizione : ");
        p1.setDescrizione(scan.nextLine());

        System.out.print("inserisci il prezzo : ");
        p1.setPrezzo(scan.nextDouble());

        System.out.print("inserisci l'iva : ");
        p1.setIva(scan.nextDouble());

        System.out.println("____________________________________________________________________________");

        System.out.println("Prodotto : " + p1.display() + " : ");
        System.out.println("Codice del prodotto : " + p1.getCodice());
        System.out.println("Nome del prodotto : " + p1.getNome());
        System.out.println("Descrizione del prodotto : " + p1.getDescrizione());
        System.out.println("Prezzo con IVA : " + p1.prezzoIva());
        System.out.println("Prezzo senza IVA : " + p1.prezzoNoIva());
        System.out.println(" ");
        System.out.println("valuta IVA : " + p1.getIva());


    }

}
