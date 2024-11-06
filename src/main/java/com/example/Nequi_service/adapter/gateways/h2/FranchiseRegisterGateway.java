package com.example.Nequi_service.adapter.gateways.h2;

import com.example.Nequi_service.adapter.gateways.mapper.FranchiseMongoMapper;
import com.example.Nequi_service.adapter.repositories.IbranchRepository;
import com.example.Nequi_service.adapter.repositories.IfranchiseRepository;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IfranchiseRegisterGateway;
import com.example.Nequi_service.domain.Branch;
import com.example.Nequi_service.domain.Franchise;
import com.example.Nequi_service.domain.Ifranchise;
import org.springframework.beans.factory.annotation.Autowired;

public class FranchiseRegisterGateway implements IfranchiseRegisterGateway {
    @Autowired
    IfranchiseRepository _repository;

    @Autowired
    IbranchRepository _repositoryBranch;

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

    @Override
    public Franchise addBranch(String idFranchise, String idBranch) {
        if (!_repositoryBranch.existsById(idBranch)) {
            throw new RuntimeException("Branch ID " + idBranch + " no existe en la colección Branch.");
        }
        FranchiseMongoMapper franchise = _repository.findById(idFranchise)
                .orElseThrow(() -> new RuntimeException("Franchise con ID " + idFranchise + " no encontrado."));

        if (!franchise.getBranches().contains(idBranch)) {
            franchise.getBranches().add(idBranch);
            _repository.save(franchise);
        } else {
            throw new RuntimeException("El branch ya existe en el franchise.");
        }

        Franchise franchises = new Franchise(franchise.getId(), franchise.getName(), franchise.getBranches(), franchise.getDescription());

        return franchises;
    }
}
