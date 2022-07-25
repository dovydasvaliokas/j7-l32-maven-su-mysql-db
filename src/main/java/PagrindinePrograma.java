import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import dbveiksmai.DuombazesVeiksmai;
import entity.Knyga;
import utility.PapildomiVeiksmai;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Connection jungtis = null;
        try {
            jungtis = DuombazesVeiksmai.prisijungtiPrieDuombazes();
            ArrayList<Knyga> visosKnygos = DuombazesVeiksmai.grazintiVisasKnygas(jungtis);
            PapildomiVeiksmai.isvestiKnyguListaEilutemis(visosKnygos);
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko prisijungti prie duomenų bazės.");
        }

        ArrayList<Knyga> knygosDaugiauPsl300 = DuombazesVeiksmai.grazintiVirsPuslapiu(jungtis, 300);
        System.out.println("Knygos, kurios daugiau už 300");
        PapildomiVeiksmai.isvestiKnyguListaEilutemis(knygosDaugiauPsl300);


        // Susikuriu knygos objektą kode (idealiausia būtų nuskaityti jį iš kažkur, pvz. konsolės) ir įdedu į duombazę
        Knyga idedamaKnyga = new Knyga("Grybų karas", "ASjfdj akf kjdfaks", 5.99, 28);
        DuombazesVeiksmai.idetiKnyga(jungtis, idedamaKnyga);

        // Išbandome: išvedu visas knygas
        try {
            ArrayList<Knyga> visosKnygos = DuombazesVeiksmai.grazintiVisasKnygas(jungtis);
            PapildomiVeiksmai.isvestiKnyguListaEilutemis(visosKnygos);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


        //--------------------------------------------ANTROS DIENOS PAVYZDŽIAI------------------------------------------
        PapildomiVeiksmai.nuskaitytiKnygaIsKonsoles();
    }
}
