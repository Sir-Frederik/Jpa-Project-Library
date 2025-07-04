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

}
