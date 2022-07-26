package dbveiksmai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class KnyguAutoriuVeiksmai {
    public static void sujungtiKnygaSuAutorium(Connection jungtis, int knygosId, int autoriausId) {
        String sqlUzklausa = "INSERT INTO knygu_autoriai(knygos_id, autoriaus_id) VALUES (?, ?)";

        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            paruostukas.setInt(1, knygosId);
            paruostukas.setInt(2, autoriausId);
            paruostukas.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
