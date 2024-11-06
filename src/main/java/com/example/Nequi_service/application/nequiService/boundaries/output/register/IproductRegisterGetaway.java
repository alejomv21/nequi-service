package com.example.Nequi_service.application.nequiService.boundaries.output.register;

import com.example.Nequi_service.application.nequiService.model.request.ProductUpdateQuantityRequest;
import com.example.Nequi_service.domain.Franchise;
import com.example.Nequi_service.domain.Ifranchise;
import com.example.Nequi_service.domain.Iproduct;
import com.example.Nequi_service.domain.Product;

public interface IproductRegisterGetaway {
    void save(Iproduct iproduct);

    Product updateStoke(ProductUpdateQuantityRequest productQuantity);
}
