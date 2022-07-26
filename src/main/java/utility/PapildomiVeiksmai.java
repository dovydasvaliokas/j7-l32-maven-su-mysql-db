package utility;

import java.util.ArrayList;

public class PapildomiVeiksmai {
    public PapildomiVeiksmai() {
    }

    public static <T> void isvestiListaEilutemis(ArrayList<T> knygos) {
        for (T t : knygos) {
            System.out.println("knyga = " + t);
        }
    }
}
