package com.example.Nequi_service.application.nequiService.model.request;

import java.util.List;

public class BranchRequestModel {
    private String id;
    private String name;
    private List<String> products;
    private String description;
    private String address;

    public BranchRequestModel(String id, String name, List<String> products, String description, String address){
        this.id = id;
        this.name = name;
        this.products = products;
        this.description = description;
        this.address = address;
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

    public List<String> getProducts() {
        return products;
    }

    public void setBranches(List<String> products) {
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
