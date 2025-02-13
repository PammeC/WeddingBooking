package com.weddingBooking.photography_service.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "photography")

public class Photography {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_photography")
    private Long idPhotography;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    public Long getIdPhotography() {
        return idPhotography;
    }

    public void setIdPhotography(Long idPhotography) {
        this.idPhotography = idPhotography;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Photography() {
    }

    public Photography(Long idPhotography, String name, BigDecimal price) {
        this.idPhotography = idPhotography;
        this.name = name;
        this.price = price;
    }
}
