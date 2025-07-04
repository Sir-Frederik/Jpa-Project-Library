package FedericoBrunetti.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="prestito")
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "data_inizio", nullable = false)
    private Date dataInizio;

    @Column(name = "data_rest_prev", nullable = false)
    private Date dataRestPrev;

    @Column(name = "data_rest_eff")
    private Date dataRestEff;

    @ManyToOne
    @JoinColumn (name ="utente", nullable = false)
    private Utente utente;

     @ManyToOne
    @JoinColumn (name ="articolo", nullable = false)
    private Articolo articolo;

    public Prestito() {
    }

    public Prestito(int id, Date dataInizio, Date dataRestPrev, Date dataRestEff, Utente utente, Articolo articolo) {
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

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Date getDataRestPrev() {
        return dataRestPrev;
    }

    public void setDataRestPrev(Date dataRestPrev) {
        this.dataRestPrev = dataRestPrev;
    }

    public Date getDataRestEff() {
        return dataRestEff;
    }

    public void setDataRestEff(Date dataRestEff) {
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
