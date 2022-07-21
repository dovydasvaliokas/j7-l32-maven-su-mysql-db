import java.sql.Connection;
import java.sql.SQLException;

import dbveiksmai.DuombazesVeiksmai;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Connection jungtis = null;
        try {
            jungtis = DuombazesVeiksmai.prisijungtiPrieDuombazes();
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko prisijungti prie duomenų bazės.");
        }
    }
}
