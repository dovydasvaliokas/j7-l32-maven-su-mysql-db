package utility;

import entity.Knyga;

import java.util.Scanner;

public class KonsolesVeiksmai {
    private static final Scanner skait = new Scanner(System.in);

    public static Knyga nuskaitytiKnygaIsKonsoles() {
        skait.nextLine();
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

    public static int meniuPasirinkimai() {
        System.out.println("Meniu pasirinkimai:");
        System.out.println("1 - išvesti visas knygas");
        System.out.println("2 - išvesti visas knygas, kurios ten turi daugiau nei X psl.");
        System.out.println("3 - įdėti knygą");
        System.out.println("4 - išvessti visus autorius");

        return skait.nextInt();
    }


    public static int nuskaitytiPsl() {
        System.out.println("Įveksite už kiek puslapių daugiau turi turėti knyga: ");
        return skait.nextInt();
    }
}
