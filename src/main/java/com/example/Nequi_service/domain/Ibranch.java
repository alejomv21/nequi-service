package com.example.Nequi_service.domain;

import java.util.List;

public interface Ibranch {
    String getId();
    String getName();
    List<String> getProducts();
    String getDescription();
    String getAddress();
}
