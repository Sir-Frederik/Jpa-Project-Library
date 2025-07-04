package FedericoBrunetti.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="prestito")
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "data_inizio", nullable = false)
    private LocalDate dataInizio;

    @Column(name = "data_rest_prev", nullable = false)
    private LocalDate dataRestPrev;

    @Column(name = "data_rest_eff")
    private LocalDate dataRestEff;

    @ManyToOne
    @JoinColumn (name ="utente", nullable = false)
    private Utente utente;

     @ManyToOne
    @JoinColumn (name ="articolo", nullable = false)
    private Articolo articolo;

    public Prestito() {
    }

    public Prestito(int id, LocalDate dataInizio, LocalDate dataRestPrev, LocalDate dataRestEff, Utente utente, Articolo articolo) {
        this.id = id;
        this.dataInizio = dataInizio;
        this.dataRestPrev = dataRestPrev;
        this.dataRestEff = dataRestEff;
        this.utente = utente;
        this.articolo = articolo;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "id=" + id +
                ", dataInizio=" + dataInizio +
                ", dataRestPrev=" + dataRestPrev +
                ", dataRestEff=" + dataRestEff +
                ", utente=" + utente +
                ", articolo=" + articolo +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataRestPrev() {
        return dataRestPrev;
    }

    public void setDataRestPrev(LocalDate dataRestPrev) {
        this.dataRestPrev = dataRestPrev;
    }

    public LocalDate getDataRestEff() {
        return dataRestEff;
    }

    public void setDataRestEff(LocalDate dataRestEff) {
        this.dataRestEff = dataRestEff;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Articolo getArticolo() {
        return articolo;
    }

    public void setArticolo(Articolo articolo) {
        this.articolo = articolo;
    }
}
