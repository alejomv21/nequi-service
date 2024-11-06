package com.example.Nequi_service.adapter.controller.register;

import com.example.Nequi_service.application.nequiService.boundaries.input.register.IfranchiseRegisterBoundary;
import com.example.Nequi_service.application.nequiService.exceptions.FranchiseCustomeException;
import com.example.Nequi_service.application.nequiService.model.request.FranchiseRequestModel;
import com.example.Nequi_service.application.nequiService.model.response.FranchiseResponseModel;
import org.springframework.web.bind.annotation.*;

@RestController()
public class FranchiseRegisterController {
    IfranchiseRegisterBoundary inputBoundary;

    public FranchiseRegisterController(IfranchiseRegisterBoundary inputBoundary) {
        this.inputBoundary = inputBoundary;
    }

    @PostMapping("/franchise")
    public FranchiseResponseModel create(@RequestBody FranchiseRequestModel requestModel) throws FranchiseCustomeException {
        return this.inputBoundary.create(requestModel);
    }

    @PostMapping("/franchise/branch")
    public FranchiseResponseModel createBranch(@RequestParam String idFranchise, String idBranch) throws FranchiseCustomeException {
        return this.inputBoundary.createBranch(idFranchise, idBranch);
    }
    @GetMapping("hola")
    public String getString(){
        return "hola";
    }
}
