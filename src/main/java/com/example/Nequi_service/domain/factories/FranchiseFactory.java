package com.example.Nequi_service.domain.factories;

import com.example.Nequi_service.domain.Franchise;

import java.util.List;

public class FranchiseFactory implements IfranchiseFactory{
    @Override
    public Franchise create(String id, String name, List<String> branches, String description){
        return new Franchise(id, name, branches, description);
    }

}
