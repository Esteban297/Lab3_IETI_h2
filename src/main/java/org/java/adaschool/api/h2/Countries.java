package org.java.adaschool.api.h2;

import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}