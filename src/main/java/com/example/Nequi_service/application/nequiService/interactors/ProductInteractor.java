package com.example.Nequi_service.application.nequiService.interactors;

import com.example.Nequi_service.application.nequiService.boundaries.input.register.IproductRegisterBoundary;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IfranchiseRegisterGateway;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IproductRegisterGetaway;
import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.request.ProductRequestModel;
import com.example.Nequi_service.application.nequiService.model.request.ProductUpdateQuantityRequest;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;
import com.example.Nequi_service.application.nequiService.model.response.ProductResponseModel;
import com.example.Nequi_service.application.nequiService.presenter.IProductPresenter;
import com.example.Nequi_service.application.nequiService.presenter.IfranchisePresenter;
import com.example.Nequi_service.domain.Franchise;
import com.example.Nequi_service.domain.Iproduct;
import com.example.Nequi_service.domain.Product;
import com.example.Nequi_service.domain.factories.IfranchiseFactory;
import com.example.Nequi_service.domain.factories.IproductFactory;

public class ProductInteractor implements IproductRegisterBoundary {
    IProductPresenter presenter;

    IproductFactory factory;

    IproductRegisterGetaway gateway;

    public ProductInteractor(IProductPresenter presenter, IproductFactory factory, IproductRegisterGetaway gateway){
        this.presenter = presenter;
        this.factory = factory;
        this.gateway = gateway;
    }

    @Override
    public ProductResponseModel createProduct(ProductRequestModel requestModel) throws FranchiseCustomeException {
        Iproduct franchises = factory.create(requestModel.getId(), requestModel.getName(), requestModel.getIdBranch(),  requestModel.getDescription(), requestModel.getAmount(), requestModel.getQuantity());

        gateway.save(franchises);

        ProductResponseModel responseModel = new ProductResponseModel(franchises.getId(), franchises.getName(), franchises.getIdBranch(), franchises.getDescription(), franchises.getAmount(), franchises.getQuantity());

        return presenter.prepareSuccessView(responseModel);
    }

    @Override
    public ProductResponseModel updateStoke(ProductUpdateQuantityRequest productQuantityRequest) throws FranchiseCustomeException{
        Product franchises = gateway.updateStoke(productQuantityRequest);
        ProductResponseModel responseModel = new ProductResponseModel(franchises.getId(), franchises.getName(), franchises.getIdBranch(), franchises.getDescription(), franchises.getAmount(), franchises.getQuantity());
        return presenter.prepareSuccessView(responseModel);
    }
}
