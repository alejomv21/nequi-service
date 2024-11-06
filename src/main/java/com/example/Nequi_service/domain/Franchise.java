package com.example.Nequi_service.domain;

import java.util.List;

public class Franchise implements Ifranchise{
    private String id;
    private String name;
    private List<String> branches;
    private String description;

    public Franchise(String id, String name, List<String> branches, String description){
        this.id = id;
        this.name = name;
        this.branches = branches;
        this.description = description;
    }

    @Override
    public String getId(){return id;}

    @Override
    public String getName(){return name;}

    @Override
    public List<String> getBranches(){return branches;}

    @Override
    public String getDescription(){return description;}



}
