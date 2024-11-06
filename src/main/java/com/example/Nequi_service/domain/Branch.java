package com.example.Nequi_service.domain;

import java.util.List;

public class Branch implements Ibranch{
    private String id;
    private String name;
    private List<String> products;
    private String description;
    private String address;

    public Branch(String id, String name, List<String> products, String description, String address){
        this.id = id;
        this.name = name;
        this.products = products;
        this.description = description;
        this.address = address;
    }

    @Override
    public String getId(){return id;}

    @Override
    public String getName(){return name;}

    @Override
    public List<String> getProducts(){return products;}

    @Override
    public String getDescription(){return description;}

    @Override
    public String getAddress(){return address;}
}
