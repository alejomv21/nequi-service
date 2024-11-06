package com.example.Nequi_service.adapter.controller.register;

import com.example.Nequi_service.application.nequiService.boundaries.input.register.IbranchRegisterBoundary;
import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.request.BranchRequestModel;
import com.example.Nequi_service.application.nequiService.model.response.BranchProductStockResponse;
import com.example.Nequi_service.application.nequiService.model.response.BranchResponseModel;
import org.springframework.web.bind.annotation.*;

@RestController()
public class BranchRegisterController {
    IbranchRegisterBoundary inputsBoundary;

    public BranchRegisterController(IbranchRegisterBoundary inputBoundary) {
        this.inputsBoundary = inputBoundary;
    }

    @PostMapping("/branch")
    public BranchResponseModel create(@RequestBody BranchRequestModel requestModel) throws FranchiseCustomeException {
        return this.inputsBoundary.createBranch(requestModel);
    }

    @PostMapping("/branch/product")
    public BranchResponseModel createBranch(@RequestParam String idBranch, String idProduct) throws FranchiseCustomeException {
        return this.inputsBoundary.createProduct(idBranch, idProduct);
    }

    @GetMapping("/branch/product")
    public BranchProductStockResponse getProductQuantity(@RequestParam String idBranch, String idProduct) throws FranchiseCustomeException {
        return this.inputsBoundary.getProductQuantity(idBranch, idProduct);
    }
}
