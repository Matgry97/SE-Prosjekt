import java.time.LocalDate;

public class Film {

    private String tittel;
    private String beskrivelse;
    private int spilletid;
    private LocalDate utgivDato;

    //public Person regissør;
    // public Person skuespiller;


    public Film(String tittel, String beskrivelse, int spilletid, LocalDate utgivDato) {
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.spilletid = spilletid;
        this.utgivDato = utgivDato;
    }


    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public int getSpilletid() {
        return spilletid;
    }

    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }

    public LocalDate getUtgivDato() {
        return utgivDato;
    }

    public void setUtgivDato(LocalDate utgivDato) {
        this.utgivDato = utgivDato;
    }
}