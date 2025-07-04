package FedericoBrunetti.entities;

import FedericoBrunetti.enums.Genere;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Libro extends Articolo {
 private String autore;

 @Enumerated(EnumType.STRING)
    private Genere genere;

    public Libro() {
    }

    public Libro(String autore, Genere genere) {
        this.autore = autore;
        this.genere = genere;
    }







    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere=" + genere +
                ", isbn='" + isbn + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione='" + annoPubblicazione + '\'' +
                ", numPagine=" + numPagine +
                ", isPrestabile=" + isPrestabile +
                '}';
    }
}

