package utility;

import entity.Knyga;

import java.util.Scanner;

public class KonsolesVeiksmai {
    private static final Scanner skait = new Scanner(System.in);

    public static Knyga nuskaitytiKnygaIsKonsoles() {
        System.out.println("Įveskite knygos pavadinimą: ");
        String pavadinimas = skait.nextLine();
        System.out.println("Įveskite knygos aprašymą: ");
        String aprasymas = skait.nextLine();
        System.out.println("Įveskite knygos kainą: ");
        double kaina = skait.nextDouble();
        System.out.println("Įveskite knygos puslapių skaičių: ");
        int pslSk = skait.nextInt();

        //   Knyga knyga = new Knyga(pavadinimas, aprasymas, kaina, pslSk);
        //  return knyga;

        return new Knyga(pavadinimas, aprasymas, kaina, pslSk);
    }



}
