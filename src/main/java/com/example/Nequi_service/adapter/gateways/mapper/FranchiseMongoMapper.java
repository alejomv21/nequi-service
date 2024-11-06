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
}
