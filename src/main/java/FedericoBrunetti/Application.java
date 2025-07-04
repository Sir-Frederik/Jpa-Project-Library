package FedericoBrunetti;

import FedericoBrunetti.dao.ArticoloDAO;
import FedericoBrunetti.entities.Libro;
import FedericoBrunetti.entities.Rivista;
import FedericoBrunetti.enums.Genere;
import FedericoBrunetti.enums.Periodicita;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        ArticoloDAO ad = new ArticoloDAO(em);

        Libro libro1 = new Libro("978-88-123460", "Fondazione", "1951",
                (short) 255, true, "Asimov", Genere.FANTASCIENZA);

        Libro libro2 = new Libro("978-88-123457", "Il Signore degli Anelli", "1954", (short) 1216, true, "J.R.R. Tolkien", Genere.FANTASY);
        Libro libro3 = new Libro("978-88-123458", "1984", "1949", (short) 328, true, "George Orwell", Genere.FANTASCIENZA);
        Libro libro4 = new Libro("978-88-123459", "Il nome della rosa", "1980", (short) 512, true, "Umberto Eco", Genere.GIALLO);
        Libro libro5 = new Libro("978-88-123460", "Harry Potter e la pietra filosofale", "1997", (short) 223, true, "J.K. Rowling", Genere.FANTASY);


        Rivista rivista1 = new Rivista("ISSN-1234-5678", "National Geographic", "2024", (short) 120, true, Periodicita.MENSILE);
        Rivista rivista2 = new Rivista("ISSN-1234-5679", "Focus", "2024", (short) 100, true, Periodicita.MENSILE);
        Rivista rivista3 = new Rivista("ISSN-1234-5680", "L'Espresso", "2024", (short) 80, true, Periodicita.SETTIMANALE);
        Rivista rivista4 = new Rivista("ISSN-1234-5681", "Scientific American", "2024", (short) 90, true, Periodicita.MENSILE);
        Rivista rivista5 = new Rivista("ISSN-1234-5682", "Quattroruote", "2024", (short) 150, true, Periodicita.MENSILE);



ad.save(libro1);
ad.save(libro2);
ad.save(libro3);
ad.save(libro4);
ad.save(libro5);
ad.save(rivista1);
ad.save(rivista2);
ad.save(rivista3);
ad.save(rivista4);
ad.save(rivista5);

//        ad.findAll().forEach(System.out::println);


        em.close();
        emf.close();


    }
}
