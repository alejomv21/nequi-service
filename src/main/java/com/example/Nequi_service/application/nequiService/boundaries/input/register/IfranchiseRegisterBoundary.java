package com.example.Nequi_service.application.nequiService.boundaries.input.register;

import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.request.FranchiseRequestModel;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;

public interface IfranchiseRegisterBoundary {
    FranchiseResponseModel create(FranchiseRequestModel requestModel) throws FranchiseCustomeException;
}
