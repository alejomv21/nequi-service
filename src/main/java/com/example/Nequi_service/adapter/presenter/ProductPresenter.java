package com.example.Nequi_service.adapter.presenter;

import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;
import com.example.Nequi_service.application.nequiService.model.response.ProductResponseModel;
import com.example.Nequi_service.application.nequiService.presenter.IProductPresenter;

public class ProductPresenter implements IProductPresenter {
    @Override
    public ProductResponseModel prepareFailView(FranchiseCustomeException e) throws FranchiseCustomeException {
        throw e;
    }

    @Override
    public ProductResponseModel prepareSuccessView(ProductResponseModel responseModel) {
        return responseModel;
    }
}
