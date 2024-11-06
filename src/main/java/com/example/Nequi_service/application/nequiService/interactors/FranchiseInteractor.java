package com.example.Nequi_service.application.nequiService.interactors;

import com.example.Nequi_service.application.nequiService.boundaries.input.register.IfranchiseRegisterBoundary;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IfranchiseRegisterGateway;
import com.example.Nequi_service.application.nequiService.exceptions.FranchiseAlredyExistException;
import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.request.FranchiseRequestModel;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;
import com.example.Nequi_service.application.nequiService.presenter.IfranchisePresenter;
import com.example.Nequi_service.domain.Ifranchise;
import com.example.Nequi_service.domain.factories.IfranchiseFactory;

public class FranchiseInteractor implements IfranchiseRegisterBoundary {
    IfranchisePresenter presenter;

    IfranchiseFactory factory;

    IfranchiseRegisterGateway gateway;

    public FranchiseInteractor(IfranchisePresenter presenter, IfranchiseFactory factory, IfranchiseRegisterGateway gateway){
        this.presenter = presenter;
        this.factory = factory;
        this.gateway = gateway;
    }
    @Override
    public FranchiseResponseModel create(FranchiseRequestModel requestModel) throws FranchiseCustomeException{
        if (gateway.existsById(requestModel.getId())) {
            return presenter.prepareFailView(new FranchiseAlredyExistException("Product with id " + requestModel.getId() + " already in database"));
        }
        Ifranchise franchises = factory.create(requestModel.getId(), requestModel.getName(), requestModel.getBranches(),  requestModel.getDescription());

        gateway.save(franchises);

        FranchiseResponseModel responseModel = new FranchiseResponseModel(franchises.getId(), franchises.getName(), franchises.getBranches(), franchises.getDescription());

        return presenter.prepareSuccessView(responseModel);
    }
}
