package com.example.Nequi_service.application.nequiService.presenter;

import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;
import com.example.Nequi_service.application.nequiService.model.response.ProductResponseModel;

public interface IProductPresenter {
    ProductResponseModel prepareFailView(FranchiseCustomeException e) throws FranchiseCustomeException;
    ProductResponseModel prepareSuccessView(ProductResponseModel responseModel);
}
