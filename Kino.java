public class Kino {
    String navn;
    int antallSaler;

    public Kino(String navn, int antallSaler) {
        this.navn = navn;
        this.antallSaler = antallSaler;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntallSaler() {
        return antallSaler;
    }

    public void setAntallSaler(int antallSaler) {
        this.antallSaler = antallSaler;
    }
}
