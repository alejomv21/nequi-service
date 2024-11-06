package com.example.Nequi_service.domain;

import java.util.List;

public interface Ifranchise {
    String getId();
    String getName();
    List<String> getBranches();
    String getDescription();
}
