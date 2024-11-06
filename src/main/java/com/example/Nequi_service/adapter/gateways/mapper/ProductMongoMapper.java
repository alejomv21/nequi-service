package com.example.Nequi_service.adapter.gateways.mapper;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Product")
public class ProductMongoMapper {
    @Id
    private String id;
    private String name;
    private String idBranch;
    private String description;
    private double amount;
    private int quantity;

    public ProductMongoMapper(String id, String name, String idBranch, String description, double amount, int quantity){
        super();
        this.id = id;
        this.name = name;
        this.idBranch = idBranch;
        this.description = description;
        this.amount = amount;
        this.quantity = quantity;
    }
    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIdBranch() {
        return idBranch;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
