package FedericoBrunetti.dao;

import FedericoBrunetti.entities.Articolo;
import FedericoBrunetti.entities.Libro;
import FedericoBrunetti.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ArticoloDAO {
    private final EntityManager entityManager;

    public ArticoloDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save (Articolo newArticolo){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newArticolo);
        transaction.commit();
        System.out.println("L'articolo "+ newArticolo.getTitolo() +  " è stato inserito");

    }

    public Articolo findByIsbn(String isbn) {
        Articolo found = entityManager.find(Articolo.class, isbn);
        if (found == null) throw new NotFoundException(isbn);
        return found;
    }

    public List <Articolo> findAll(){
        TypedQuery<Articolo> query =entityManager.createQuery("SELECT A FROM Articolo a", Articolo.class);
        return query.getResultList();
    }

    public List<Articolo> findByAnnoPubblicazione(String anno) {
        TypedQuery<Articolo> query = entityManager.createQuery(
                "SELECT a FROM Articolo a WHERE a.annoPubblicazione = :anno",
                Articolo.class
        );
        query.setParameter("anno", anno);
        return query.getResultList();
    }

    public List<Libro> findByAutore(String autore) {
        TypedQuery<Libro> query = entityManager.createQuery(
                "SELECT l FROM Libro l WHERE l.autore = :autore",
                Libro.class
        );
        query.setParameter("autore", autore);
        return query.getResultList();
    }
}
