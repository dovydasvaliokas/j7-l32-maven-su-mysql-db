import java.sql.Connection;
import java.util.ArrayList;

import dbveiksmai.AutoriausVeiksmai;
import dbveiksmai.DuombazesVeiksmai;
import dbveiksmai.KnygosVeiksmai;
import entity.Autorius;
import entity.Knyga;
import utility.KonsolesVeiksmai;
import utility.PapildomiVeiksmai;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Connection jungtis = DuombazesVeiksmai.prisijungtiPrieDuombazes();
        ArrayList<Knyga> visosKnygos = new ArrayList<>();
        ArrayList<Autorius> autoriai = new ArrayList<>();

        autoriai = AutoriausVeiksmai.gautiVisusAutorius(jungtis);
        PapildomiVeiksmai.isvestiListaEilutemis(autoriai);

        int pasirinkimas = KonsolesVeiksmai.meniuPasirinkimai();


        switch (pasirinkimas) {
            case 1:
                visosKnygos = KnygosVeiksmai.grazintiVisasKnygas(jungtis);
                PapildomiVeiksmai.isvestiListaEilutemis(visosKnygos);
                break;
            case 2:
                int pslSkaicius = KonsolesVeiksmai.nuskaitytiPsl();
                visosKnygos = KnygosVeiksmai.grazintiVirsPuslapiu(jungtis, pslSkaicius);
                PapildomiVeiksmai.isvestiListaEilutemis(visosKnygos);
                break;
            case 3:
                Knyga naujaKnyga = KonsolesVeiksmai.nuskaitytiKnygaIsKonsoles();
                KnygosVeiksmai.idetiKnyga(jungtis, naujaKnyga);
                break;
            default:
                System.out.println("Tokio pasirinkimo nėra");
        }
    }
}
