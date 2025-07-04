package FedericoBrunetti.entities;

import jakarta.persistence.*;

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
    private Date dataNascita;

    public Utente() {
    }

    public Utente(int numTessera, String nome, String cognome, Date dataNascita) {
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

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }
}
