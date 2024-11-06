package com.example.Nequi_service.application.nequiService.boundaries.output.register;

import com.example.Nequi_service.domain.Ifranchise;

public interface IfranchiseRegisterGateway extends IfranchiseExistGateway {
    void save(Ifranchise iFranchise);
}
