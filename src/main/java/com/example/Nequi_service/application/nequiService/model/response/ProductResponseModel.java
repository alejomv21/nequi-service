package com.example.Nequi_service.application.nequiService.model.response;

public class ProductResponseModel {
    private String id;
    private String name;
    private String idBranch;
    private String description;
    private double amount;
    private int quantity;

    public ProductResponseModel(String id, String name, String idBranch, String description, double amount, int quantity) {
        this.id = id;
        this.name = name;
        this.idBranch = idBranch;
        this.description = description;
        this.amount = amount;
        this.quantity = quantity;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdBranch() {
        return idBranch;
    }

    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAddress(double amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
