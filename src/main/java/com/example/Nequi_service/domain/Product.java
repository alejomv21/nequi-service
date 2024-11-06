package com.example.Nequi_service.domain;

import java.util.List;

public class Product implements Iproduct{
    private String id;
    private String name;
    private String idBranch;
    private String description;
    private double amount;
    private int quantity;

    public Product(String id, String name, String idBranch, String description, double amount, int quantity){
        this.id = id;
        this.name = name;
        this.idBranch = idBranch;
        this.description = description;
        this.amount = amount;
        this.quantity = quantity;
    }

    @Override
    public String getId(){return id;}

    @Override
    public String getName(){return name;}

    @Override
    public String getIdBranch(){return idBranch;}

    @Override
    public String getDescription(){return description;}

    @Override
    public double getAmount(){return amount;}

    @Override
    public int getQuantity(){return quantity;}
}
