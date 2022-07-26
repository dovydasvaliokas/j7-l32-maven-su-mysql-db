package dbveiksmai;

import entity.Autorius;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AutoriausVeiksmai {
    public static ArrayList<Autorius> gautiVisusAutorius(Connection jungtis) {
        ArrayList<Autorius> visiAutoriai = new ArrayList<>();
        String sqlUzklausa = "SELECT * FROM autoriai";

        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            ResultSet rezultatas = paruostukas.executeQuery();
            while (rezultatas.next()) {
                visiAutoriai.add(new Autorius(rezultatas.getInt("id"), rezultatas.getString("vardas"), rezultatas.getString("pavarde"), rezultatas.getString("šalis")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return visiAutoriai;
    }

    public static void idetiAutoriu(Connection jungtis, Autorius autorius) {
        String sqlUzklausa = "INSERT INTO autoriai(vardas, pavarde, šalis) VALUES (?, ?, ?)";

        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            paruostukas.setString(1, autorius.getVardas());
            paruostukas.setString(2, autorius.getPavarde());
            paruostukas.setString(3, autorius.getSalis());

            paruostukas.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
