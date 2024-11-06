package com.example.Nequi_service.application.nequiService.interactors;

import com.example.Nequi_service.application.nequiService.boundaries.input.register.IbranchRegisterBoundary;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IbranchRegisterGetaway;
import com.example.Nequi_service.application.nequiService.exceptions.FranchiseAlredyExistException;
import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.request.BranchRequestModel;
import com.example.Nequi_service.application.nequiService.model.response.BranchProductStockResponse;
import com.example.Nequi_service.application.nequiService.model.response.BranchResponseModel;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;
import com.example.Nequi_service.application.nequiService.presenter.IbrachPresenter;
import com.example.Nequi_service.domain.Branch;
import com.example.Nequi_service.domain.Franchise;
import com.example.Nequi_service.domain.Ibranch;
import com.example.Nequi_service.domain.factories.IbranchFactory;

public class BranchInteractor implements IbranchRegisterBoundary {
    IbrachPresenter presenter;

    IbranchFactory factory;

    IbranchRegisterGetaway gateway;

    public BranchInteractor(IbrachPresenter presenter, IbranchFactory factory, IbranchRegisterGetaway gateway){
        this.presenter = presenter;
        this.factory = factory;
        this.gateway = gateway;
    }

    @Override
    public BranchResponseModel createBranch(BranchRequestModel requestModel) throws FranchiseCustomeException {
        if (gateway.existsById(requestModel.getId())) {
            return presenter.prepareFailView(new FranchiseAlredyExistException("Product with id " + requestModel.getId() + " already in database"));
        }
        Ibranch franchises = factory.create(requestModel.getId(), requestModel.getName(), requestModel.getProducts(),  requestModel.getDescription(), requestModel.getAddress());

        gateway.save(franchises);

        BranchResponseModel responseModel = new BranchResponseModel(franchises.getId(), franchises.getName(), franchises.getProducts(), franchises.getDescription(), franchises.getAddress());

        return presenter.prepareSuccessView(responseModel);
    }

    @Override
    public BranchResponseModel createProduct(String idBranch, String idProduct) throws FranchiseCustomeException{
        Branch franchises = gateway.addProduct(idBranch, idProduct);
        BranchResponseModel responseModel = new BranchResponseModel(franchises.getId(), franchises.getName(), franchises.getProducts(), franchises.getDescription(), franchises.getAddress());
        return presenter.prepareSuccessView(responseModel);
    }

    @Override
    public BranchProductStockResponse getProductQuantity(String idBranch, String idProduct) throws FranchiseCustomeException{
        BranchProductStockResponse quantity = gateway.getProductQuantity(idBranch, idProduct);
        return presenter.prepareSuccessViewQuantity(quantity);
    }
}
