package com.example.Nequi_service.application.nequiService.presenter;

import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;

public interface IfranchisePresenter {
    FranchiseResponseModel prepareFailView(FranchiseCustomeException e) throws FranchiseCustomeException;
    FranchiseResponseModel prepareSuccessView(FranchiseResponseModel responseModel);

}
