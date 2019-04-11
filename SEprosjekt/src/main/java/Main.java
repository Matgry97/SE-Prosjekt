import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Film> filmListe = new ArrayList<Film>();

    private void lagMateuz() {
        System.out.println("charizard");
    }
    public static void main(String[] args) {
        // write your code here
        Film actionJackson = new Film("Action Jackson slår til igjen","Heftig action",93, LocalDate.of(1988,7,7));
        Film deltaForce = new Film("The Delta Force"," Mega heftig action",125, LocalDate.of(1986,10,2));
        Film escapeFromNewYork = new Film("Escape from New York"," Ultra heftig action",99, LocalDate.of(1981,12,26));

        filmListe.add(actionJackson);
        System.out.println(filmListe.toString());



        Billett billett = new Billett("legofilmen", "Ålesund kino", 2, 3, 12, 150.50, "15:30", LocalDate.of(2014,3,3));

        Person person = new Person("Hi", "of", 18);
        System.out.println(person.toString());

        Admin a = new Admin(person);
        System.out.println(a.toString());

        a.remove(filmListe, actionJackson);
        a.add(filmListe, deltaForce);
        a.add(filmListe, escapeFromNewYork);
        System.out.println(filmListe.toString());


    }

}

