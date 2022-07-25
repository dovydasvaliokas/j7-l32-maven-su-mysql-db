import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import dbveiksmai.DuombazesVeiksmai;
import entity.Knyga;
import utility.PapildomiVeiksmai;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Connection jungtis = DuombazesVeiksmai.prisijungtiPrieDuombazes();
        ArrayList<Knyga> visosKnygos = DuombazesVeiksmai.grazintiVisasKnygas(jungtis);
        PapildomiVeiksmai.isvestiKnyguListaEilutemis(visosKnygos);


        ArrayList<Knyga> knygosDaugiauPsl300 = DuombazesVeiksmai.grazintiVirsPuslapiu(jungtis, 300);
        System.out.println("Knygos, kurios daugiau už 300");
        PapildomiVeiksmai.isvestiKnyguListaEilutemis(knygosDaugiauPsl300);


        // Susikuriu knygos objektą kode (idealiausia būtų nuskaityti jį iš kažkur, pvz. konsolės) ir įdedu į duombazę
     //   Knyga idedamaKnyga = new Knyga("Grybų karas", "ASjfdj akf kjdfaks", 5.99, 28);
     //   DuombazesVeiksmai.idetiKnyga(jungtis, idedamaKnyga);


        //--------------------------------------------ANTROS DIENOS PAVYZDŽIAI------------------------------------------
        Knyga naujaKnyga = PapildomiVeiksmai.nuskaitytiKnygaIsKonsoles();
        DuombazesVeiksmai.idetiKnyga(jungtis, naujaKnyga);

        // Išbandome: išvedu visas knygas
        visosKnygos = DuombazesVeiksmai.grazintiVisasKnygas(jungtis);
        PapildomiVeiksmai.isvestiKnyguListaEilutemis(visosKnygos);
    }
}
