package com.example.Nequi_service.domain.factories;

import com.example.Nequi_service.domain.Ifranchise;

import java.util.List;

public interface IfranchiseFactory {
    Ifranchise create(String id, String name, List<String> branches, String description);
}
