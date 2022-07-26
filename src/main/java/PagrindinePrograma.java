import java.sql.Connection;
import java.util.ArrayList;

import dbveiksmai.DuombazesVeiksmai;
import dbveiksmai.KnygosVeiksmai;
import entity.Knyga;
import utility.KonsolesVeiksmai;
import utility.PapildomiVeiksmai;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Connection jungtis = DuombazesVeiksmai.prisijungtiPrieDuombazes();
        int pasirinkimas = KonsolesVeiksmai.meniuPasirinkimai();
        ArrayList<Knyga> visosKnygos = new ArrayList<>();

        switch (pasirinkimas) {
            case 1:
                visosKnygos = KnygosVeiksmai.grazintiVisasKnygas(jungtis);
                PapildomiVeiksmai.isvestiKnyguListaEilutemis(visosKnygos);
                break;
            case 2:
                int pslSkaicius = KonsolesVeiksmai.nuskaitytiPsl();
                visosKnygos = KnygosVeiksmai.grazintiVirsPuslapiu(jungtis, pslSkaicius);
                PapildomiVeiksmai.isvestiKnyguListaEilutemis(visosKnygos);
                break;
            case 3:
                Knyga naujaKnyga = KonsolesVeiksmai.nuskaitytiKnygaIsKonsoles();
                KnygosVeiksmai.idetiKnyga(jungtis, naujaKnyga);
                break;
            default:
                System.out.println("Tokio pasirinkimo nėra");
        }


        //--------------------------------------------ANTROS DIENOS PAVYZDŽIAI------------------------------------------


    }
}
