package FedericoBrunetti;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        //aggiungi dao

        em.close();
        emf.close();
        System.out.println("let's start doodoo doo doodoo");

    }
}
