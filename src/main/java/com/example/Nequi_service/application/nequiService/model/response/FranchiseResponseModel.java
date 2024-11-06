package com.example.Nequi_service.application.nequiService.model.response;

import java.util.List;

public class FranchiseResponseModel {
    private String id;
    private String name;
    private List<String> branches;
    private String description;

    public FranchiseResponseModel(String id, String name, List<String> branches, String description){
        this.id = id;
        this.name = name;
        this.branches = branches;
        this.description = description;
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

    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
