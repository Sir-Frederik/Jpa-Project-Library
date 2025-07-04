package FedericoBrunetti.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "utente")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "num_tessera")
    private int numTessera;
    private String nome;
    private String cognome;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascita")
    private LocalDate dataNascita;

    public Utente() {
    }

    public Utente(int numTessera, String nome, String cognome, LocalDate dataNascita) {
        this.numTessera = numTessera;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "numTessera=" + numTessera +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                '}';
    }

    public int getNumTessera() {
        return numTessera;
    }

    public void setNumTessera(int numTessera) {
        this.numTessera = numTessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
}
