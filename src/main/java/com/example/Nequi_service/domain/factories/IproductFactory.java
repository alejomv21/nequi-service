package com.example.Nequi_service.domain.factories;

import com.example.Nequi_service.domain.Iproduct;

public interface IproductFactory {
    Iproduct create(String id, String name, String idBranch, String description, double amount, int quantity);
}
