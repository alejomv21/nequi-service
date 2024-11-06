package com.example.Nequi_service.adapter.controller.register;

import com.example.Nequi_service.application.nequiService.boundaries.input.register.IbranchRegisterBoundary;
import com.example.Nequi_service.application.nequiService.boundaries.input.register.IfranchiseRegisterBoundary;
import com.example.Nequi_service.application.nequiService.boundaries.input.register.IproductRegisterBoundary;
import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.request.BranchRequestModel;
import com.example.Nequi_service.application.nequiService.model.request.FranchiseRequestModel;
import com.example.Nequi_service.application.nequiService.model.request.ProductRequestModel;
import com.example.Nequi_service.application.nequiService.model.request.ProductUpdateQuantityRequest;
import com.example.Nequi_service.application.nequiService.model.response.BranchResponseModel;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;
import com.example.Nequi_service.application.nequiService.model.response.ProductResponseModel;
import org.springframework.web.bind.annotation.*;

@RestController()
public class ProductRegisterController {
    IproductRegisterBoundary inputBoundary;

    public ProductRegisterController(IproductRegisterBoundary inputBoundary) {
        this.inputBoundary = inputBoundary;
    }

    @PostMapping("/product")
    public ProductResponseModel createProduct(@RequestBody ProductRequestModel requestModel) throws FranchiseCustomeException {
        return this.inputBoundary.createProduct(requestModel);
    }

    @PutMapping("/product/quantity")
    public ProductResponseModel createBranch(@RequestBody ProductUpdateQuantityRequest productQuantityRequest) throws FranchiseCustomeException {
        return this.inputBoundary.updateStoke(productQuantityRequest);
    }
}
