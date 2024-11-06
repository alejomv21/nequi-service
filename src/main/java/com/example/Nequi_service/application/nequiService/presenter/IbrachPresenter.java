package com.example.Nequi_service.application.nequiService.presenter;

import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.response.BranchProductStockResponse;
import com.example.Nequi_service.application.nequiService.model.response.BranchResponseModel;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;

public interface IbrachPresenter {
    BranchResponseModel prepareFailView(FranchiseCustomeException e) throws FranchiseCustomeException;
    BranchResponseModel prepareSuccessView(BranchResponseModel responseModel);
    BranchProductStockResponse prepareSuccessViewQuantity(BranchProductStockResponse responseModel);
}
