package com.example.Nequi_service.application.nequiService.boundaries.output.register;

import com.example.Nequi_service.application.nequiService.model.response.BranchProductStockResponse;
import com.example.Nequi_service.application.nequiService.model.response.BranchResponseModel;
import com.example.Nequi_service.domain.Branch;
import com.example.Nequi_service.domain.Franchise;
import com.example.Nequi_service.domain.Ibranch;
import com.example.Nequi_service.domain.Ifranchise;

public interface IbranchRegisterGetaway extends IbranchExistGateway{
    void save(Ibranch iBranch);
    Branch addProduct(String idBranch, String idProduct);
    BranchProductStockResponse getProductQuantity(String idBranch, String idProduct);
}
