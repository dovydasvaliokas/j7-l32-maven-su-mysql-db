package entity;

public class Knyga {
    private int id;
    private String pavadinimas;
    private String aprasymas;
    private double kaina;
    private int puslapiuSkaicius;

    public Knyga(int id, String pavadinimas, String aprasymas, double kaina, int puslapiuSkaicius) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.aprasymas = aprasymas;
        this.kaina = kaina;
        this.puslapiuSkaicius = puslapiuSkaicius;
    }

    public Knyga() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public int getPuslapiuSkaicius() {
        return puslapiuSkaicius;
    }

    public void setPuslapiuSkaicius(int puslapiuSkaicius) {
        this.puslapiuSkaicius = puslapiuSkaicius;
    }

    @Override
    public String toString() {
        return "Knyga{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", aprasymas='" + aprasymas + '\'' +
                ", kaina=" + kaina +
                ", puslapiuSkaicius=" + puslapiuSkaicius +
                '}';
    }
}
