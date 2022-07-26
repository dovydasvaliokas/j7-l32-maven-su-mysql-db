package entity;

public class Autorius {
    private int id;
    private String vardas;
    private String pavarde;
    private String salis;

    public Autorius(int id, String vardas, String pavarde, String salis) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.salis = salis;
    }

    public Autorius(String vardas, String pavarde, String salis) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.salis = salis;
    }

    public Autorius() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getSalis() {
        return salis;
    }

    public void setSalis(String salis) {
        this.salis = salis;
    }

    @Override
    public String toString() {
        return "Autorius{" +
                "id=" + id +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", salis='" + salis + '\'' +
                '}';
    }
}
