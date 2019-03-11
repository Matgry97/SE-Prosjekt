package pakke.FromScratch;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Film actionJackson = new Film("Action Jackson slår til igjen","Heftig action",93, LocalDate.of(1988,7,7));
        Film deltaForce = new Film("The Delta Force"," Mega heftig action",125, LocalDate.of(1986,10,2));
        Film escapeFromNewYork = new Film("Escape from New York"," Ultra heftig action",99, LocalDate.of(1981,12,26));
	    
	billett billett = new billett("legofilmen", "Ålesund kino", 2, 3, 12, 150.50, "15:30", LocalDate.of(2014,3,3));    


    }

}
