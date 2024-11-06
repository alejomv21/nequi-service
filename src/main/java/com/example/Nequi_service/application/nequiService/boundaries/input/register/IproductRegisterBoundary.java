package com.example.Nequi_service.application.nequiService.boundaries.input.register;

import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.request.ProductRequestModel;
import com.example.Nequi_service.application.nequiService.model.request.ProductUpdateQuantityRequest;
import com.example.Nequi_service.application.nequiService.model.response.ProductResponseModel;

public interface IproductRegisterBoundary {
    ProductResponseModel createProduct(ProductRequestModel requestModel) throws FranchiseCustomeException;
    ProductResponseModel updateStoke(ProductUpdateQuantityRequest productQuantityRequest) throws FranchiseCustomeException;
}
