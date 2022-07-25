package dbveiksmai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Knyga;

public class DuombazesVeiksmai {
    public static final String DB_NUORODA = "jdbc:mysql://localhost:3306/java7_biblioteka?serverTimezone=UTC&characterEncoding=utf8";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "";

    public DuombazesVeiksmai() {
    }

    public static Connection prisijungtiPrieDuombazes() throws SQLException {
        return DriverManager.getConnection(DB_NUORODA, DB_USER, DB_PASSWORD);
    }

    public static ArrayList<Knyga> grazintiVisasKnygas(Connection jungtis) throws SQLException {
        ArrayList<Knyga> visosKnygos = new ArrayList<>();
        String sqlUzklausa = "SELECT * FROM knyga";

        PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
        ResultSet rezultatas = paruostukas.executeQuery();
        while (rezultatas.next()) {
            int id = rezultatas.getInt("id");
            String pavadinimas = rezultatas.getString("pavadinimas");
            String aprasymas = rezultatas.getString("aprasymas");
            double kaina = rezultatas.getDouble("kaina");
            int puslapiuSkaicius = rezultatas.getInt("puslapiu_skaicius");
            Knyga laikinaKnyga = new Knyga(id, pavadinimas, aprasymas, kaina, puslapiuSkaicius);
            visosKnygos.add(laikinaKnyga);
        }
        return visosKnygos;
    }

    public static ArrayList<Knyga> grazintiVirsPuslapiu(Connection jungtis, int x) {
        ArrayList<Knyga> knygos = new ArrayList<>();
        String sqlUzklausa = "SELECT * FROM knyga WHERE puslapiu_skaicius > ?";
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            paruostukas.setInt(1, x);
            ResultSet rezultatas = paruostukas.executeQuery();
            while (rezultatas.next()) {
                knygos.add(new Knyga(rezultatas.getInt("id"), rezultatas.getString("pavadinimas"), rezultatas.getString("aprasymas"), rezultatas.getDouble("kaina"), rezultatas.getInt("puslapiu_skaicius")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko pasiekti duomenų.");
        }
        return knygos;
    }

    public static void idetiKnyga(Connection jungtis, Knyga knyga) {
        String sqlUzklausa = "INSERT INTO knyga(pavadinimas, aprasymas, kaina, puslapiu_skaicius) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            paruostukas.setString(1, knyga.getPavadinimas());
            paruostukas.setString(2, knyga.getAprasymas());
            paruostukas.setDouble(3, knyga.getKaina());
            paruostukas.setInt(4, knyga.getPuslapiuSkaicius());
            paruostukas.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko įdėti duomenų į duomenų bazę");
        }
    }
}