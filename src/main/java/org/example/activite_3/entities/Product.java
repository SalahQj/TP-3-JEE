package org.example.activite_3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Product {

    @Id @GeneratedValue
    private int id;

    private String name;
    private double price;
    private int quantity;
}

