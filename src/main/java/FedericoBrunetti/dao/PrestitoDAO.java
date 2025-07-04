package FedericoBrunetti.dao;

import FedericoBrunetti.entities.Articolo;
import FedericoBrunetti.entities.Libro;
import FedericoBrunetti.entities.Prestito;
import FedericoBrunetti.entities.Utente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.time.LocalDate;

public class PrestitoDAO {
    private final EntityManager em;
    private final ArticoloDAO ad;

    public PrestitoDAO(EntityManager entityManager) {
        this.em = entityManager;
        this.ad = new ArticoloDAO(entityManager);
    }

    public Prestito newPrestito(String isbn, Utente utente) {
        Articolo articolo = ad.findByIsbn(isbn);

        if (!articolo.isPrestabile()) {
            throw new IllegalStateException("L'articolo " + articolo.getTitolo() + " non è disponibile per il prestito.");
        }
        Prestito prestito = new Prestito();
        prestito.setArticolo(articolo);
        prestito.setUtente(utente);
        prestito.setDataInizio(LocalDate.now());
        prestito.setDataRestPrev(LocalDate.now().plusDays(30));

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(prestito);
        articolo.setPrestabile(false);
        em.merge(articolo);
        tx.commit();

        return prestito;

    }

}
