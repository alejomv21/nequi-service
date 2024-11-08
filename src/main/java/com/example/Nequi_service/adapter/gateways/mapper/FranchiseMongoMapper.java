package com.example.Nequi_service.adapter.gateways.mapper;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("GroceryItem")
public class FranchiseMongoMapper {
    @Id
    private String id;
    private String name;
    private List<String> branches;
    private String description;

    public FranchiseMongoMapper(String id, String name, List<String> branches, String description){
        super();
        this.id = id;
        this.name = name;
        this.branches = branches;
        this.description = description;
    }

    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
