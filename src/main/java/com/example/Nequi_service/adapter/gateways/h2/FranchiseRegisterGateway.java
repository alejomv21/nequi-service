package com.example.Nequi_service.adapter.gateways.h2;

import com.example.Nequi_service.adapter.gateways.mapper.FranchiseMongoMapper;
import com.example.Nequi_service.adapter.repositories.IfranchiseRepository;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IfranchiseRegisterGateway;
import com.example.Nequi_service.domain.Ifranchise;
import org.springframework.beans.factory.annotation.Autowired;

public class FranchiseRegisterGateway implements IfranchiseRegisterGateway {
    @Autowired
    IfranchiseRepository _repository;

    public FranchiseRegisterGateway(){}

    @Override
    public void save(Ifranchise ifranchise) {
        FranchiseMongoMapper franchiseMongoMapper = new FranchiseMongoMapper(ifranchise.getId(), ifranchise.getName(), ifranchise.getBranches(), ifranchise.getDescription());
        this._repository.save(franchiseMongoMapper);
    }

    @Override
    public boolean existsById(String id) {
        return _repository.existsById(id);
    }
}
