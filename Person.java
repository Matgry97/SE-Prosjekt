public class Person {

    private String fornavn;
    private String etternavn;
    private int alder;
    private billett billett;

    public Person(String fornavn, String etternavn, int alder, billett billett) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
        this.billett = billett;
    }


    public String getFornavn() {
        return this.fornavn;
    }

    public String getEtternavn() {
        return this.etternavn;
    }

    public int getAlder() {
        return this.alder;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String Etternavn) {
        this.etternavn = etternavn;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String toString() {
        return " Fornavn: " + this.fornavn  + " \n Etternavn: " + this.etternavn + " \n Alder: " + this.alder + " \n ---: Billett :---" + this.billett;
    }

}
