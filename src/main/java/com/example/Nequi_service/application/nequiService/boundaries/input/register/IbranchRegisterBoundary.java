package com.example.Nequi_service.application.nequiService.boundaries.input.register;

import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.request.BranchRequestModel;
import com.example.Nequi_service.application.nequiService.model.request.FranchiseRequestModel;
import com.example.Nequi_service.application.nequiService.model.response.BranchProductStockResponse;
import com.example.Nequi_service.application.nequiService.model.response.BranchResponseModel;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;

public interface IbranchRegisterBoundary {
    BranchResponseModel createBranch(BranchRequestModel requestModel) throws FranchiseCustomeException;
    BranchResponseModel createProduct(String idBranch, String idProduct) throws FranchiseCustomeException;
    BranchProductStockResponse getProductQuantity(String idBranch, String idProduct) throws FranchiseCustomeException;

}
