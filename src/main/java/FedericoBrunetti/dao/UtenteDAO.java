package FedericoBrunetti.dao;

import FedericoBrunetti.entities.Articolo;
import FedericoBrunetti.entities.Utente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UtenteDAO {
    private final EntityManager entityManager;

    public UtenteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public void save (Utente newUtente){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newUtente);
        transaction.commit();
        System.out.println("L'utente "+ newUtente.getNome() +  " è stato inserito");

    }

}
