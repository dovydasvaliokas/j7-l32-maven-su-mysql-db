package utility;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Knyga;

public class PapildomiVeiksmai {
    public PapildomiVeiksmai() {
    }

    public static void isvestiKnyguListaEilutemis(ArrayList<Knyga> knygos) {
        for (Knyga knyga : knygos) {
            System.out.println("knyga = " + knyga);
        }
    }


    public static Knyga nuskaitytiKnygaIsKonsoles() {
        Scanner skait = new Scanner(System.in);
        System.out.println("Įveskite knygos pavadinimą: ");
        String pavadinimas = skait.nextLine();
        System.out.println("Įveskite knygos aprašymą: ");
        String aprasymas = skait.nextLine();
        System.out.println("Įveskite knygos kainą: ");
        double kaina = skait.nextDouble();
        System.out.println("Įveskite knygos puslapių skaičių: ");
        int pslSk = skait.nextInt();

        System.out.println("pslSk = " + pslSk);
        System.out.println("kaina = " + kaina);
        System.out.println("aprasymas = " + aprasymas);
        System.out.println("pavadinimas = " + pavadinimas);

        return new Knyga();
    }
}
