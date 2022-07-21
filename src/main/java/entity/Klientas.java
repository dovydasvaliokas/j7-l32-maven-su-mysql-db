package entity;

public class Klientas {
    private int id;
    private String vardas;
    private String pavarde;
    private String login;
    private String slaptazodis;

    public Klientas(int id, String vardas, String pavarde, String login, String slaptazodis) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.login = login;
        this.slaptazodis = slaptazodis;
    }

    public Klientas() {
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSlaptazodis() {
        return slaptazodis;
    }

    public void setSlaptazodis(String slaptazodis) {
        this.slaptazodis = slaptazodis;
    }

    @Override
    public String toString() {
        return "Klientas{" +
                "id=" + id +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", login='" + login + '\'' +
                ", slaptazodis='" + slaptazodis + '\'' +
                '}';
    }
}
