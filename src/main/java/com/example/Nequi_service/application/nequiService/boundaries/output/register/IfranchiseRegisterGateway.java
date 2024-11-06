package com.example.Nequi_service.application.nequiService.boundaries.output.register;

import com.example.Nequi_service.adapter.gateways.mapper.FranchiseMongoMapper;
import com.example.Nequi_service.domain.Franchise;
import com.example.Nequi_service.domain.Ifranchise;

public interface IfranchiseRegisterGateway extends IfranchiseExistGateway {
    void save(Ifranchise iFranchise);
    Franchise addBranch(String idFranchise, String idBranch);
}
