package com.example.Nequi_service.domain.factories;

import com.example.Nequi_service.domain.Ibranch;

import java.util.List;

public interface IbranchFactory {
    Ibranch create(String id, String name, List<String> products, String description, String address);
}
