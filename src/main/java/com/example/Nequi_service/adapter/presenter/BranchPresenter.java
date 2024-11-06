package com.example.Nequi_service.adapter.presenter;

import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.response.BranchProductStockResponse;
import com.example.Nequi_service.application.nequiService.model.response.BranchResponseModel;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;
import com.example.Nequi_service.application.nequiService.presenter.IbrachPresenter;

public class BranchPresenter implements IbrachPresenter {
    @Override
    public BranchResponseModel prepareFailView(FranchiseCustomeException e) throws FranchiseCustomeException {
        throw e;
    }

    @Override
    public BranchResponseModel prepareSuccessView(BranchResponseModel responseModel) {
        return responseModel;
    }

    @Override
    public BranchProductStockResponse prepareSuccessViewQuantity(BranchProductStockResponse responseModel) {
        return responseModel;
    }
}
