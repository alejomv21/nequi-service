package com.example.Nequi_service.domain.factories;

import com.example.Nequi_service.domain.Branch;

import java.util.List;

public class BranchFactory implements IbranchFactory {
    @Override
    public Branch create(String id, String name, List<String> products, String description, String address){
        return new Branch(id, name, products, description, address);
    }
}
