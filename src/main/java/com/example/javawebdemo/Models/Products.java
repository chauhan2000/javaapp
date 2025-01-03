package com.example.javawebdemo.Models;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "products") // This tells Hibernate to name the table "products"
public class Products {

    public Products() {

    }


    @Column(name = "id") // This tells Hibernate to name the column "id"
    @Id // This tells Hibernate to make this column the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This tells Hibernate to auto-generate the id
    private Long id;

    @Column(name = "imageLink") // This tells Hibernate to name the column "imageLink"
    private String imageLink;

    @Column(name = "name") // This tells Hibernate to name the column "name"
    private String name;

    @Column(name = "price") // This tells Hibernate to name the column "price"
    private String price;

    @Column(name = "description") // This tells Hibernate to name the column "description"
    private String description;

    @Column(name = "display") // This tells Hibernate to name the column "display"
    private String display;

    @Column(name = "ram") // This tells Hibernate to name the column "ram"
    private String ram;

    @Column(name = "memory") // This tells Hibernate to name the column "memory"
    private String memory;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
