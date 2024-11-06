package com.example.Nequi_service.adapter.gateways.mapper;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Branch")
public class BranchMongoMapper {
    @Id
    private String id;
    private String name;
    private List<String> products;
    private String description;
    private String address;

    public BranchMongoMapper(String id, String name, List<String> products, String description, String address){
        super();
        this.id = id;
        this.name = name;
        this.products = products;
        this.description = description;
        this.address = address;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getProducts() {
        return products;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
