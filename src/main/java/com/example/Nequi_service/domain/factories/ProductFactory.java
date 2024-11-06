package com.example.Nequi_service.domain.factories;

import com.example.Nequi_service.domain.Branch;
import com.example.Nequi_service.domain.Product;

import java.util.List;

public class ProductFactory implements IproductFactory{
    @Override
    public Product create(String id, String name, String idBranch, String description, double amount, int quantity){
        return new Product(id, name, idBranch, description, amount, quantity);
    }
}
