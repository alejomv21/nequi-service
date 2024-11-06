package com.example.Nequi_service.adapter.presenter;

import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;
import com.example.Nequi_service.application.nequiService.presenter.IfranchisePresenter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FranchisePresenter implements IfranchisePresenter {
    @Override
    public FranchiseResponseModel prepareFailView(FranchiseCustomeException e) throws FranchiseCustomeException {
        throw e;
    }

    @Override
    public FranchiseResponseModel prepareSuccessView(FranchiseResponseModel responseModel) {
        return responseModel;
    }
}
