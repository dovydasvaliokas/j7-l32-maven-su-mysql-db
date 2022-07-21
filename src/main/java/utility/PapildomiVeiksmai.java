package utility;

import java.util.ArrayList;

import entity.Knyga;

public class PapildomiVeiksmai {
    public PapildomiVeiksmai() {
    }

    public static void isvestiKnyguListaEilutemis(ArrayList<Knyga> knygos) {
        for (Knyga knyga : knygos) {
            System.out.println("knyga = " + knyga);
        }
    }
}
