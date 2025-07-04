package FedericoBrunetti.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "articolo")
@Inheritance (strategy = InheritanceType.JOINED)

//TODO: fare le named query

public abstract class Articolo {
    @Id
    protected String isbn;
    protected String titolo;
    @Column (name = "anno_pubblicazione")
    protected String annoPubblicazione;
    @Column (name = "num_pagine")
    protected short numPagine;
    @Column(name = "prestabile")
    protected boolean isPrestabile;

    public Articolo() {
    }

    public Articolo(String isbn, String titolo, String annoPubblicazione, short numPagine, boolean isPrestabile) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numPagine = numPagine;
        this.isPrestabile = isPrestabile;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(String annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public short getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(short numPagine) {
        this.numPagine = numPagine;
    }

    public boolean isPrestabile() {
        return isPrestabile;
    }

    public void setPrestabile(boolean prestabile) {
        isPrestabile = prestabile;
    }
}
