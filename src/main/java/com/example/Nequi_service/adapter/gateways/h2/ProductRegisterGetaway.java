package com.example.Nequi_service.adapter.gateways.h2;

import com.example.Nequi_service.adapter.gateways.mapper.FranchiseMongoMapper;
import com.example.Nequi_service.adapter.gateways.mapper.ProductMongoMapper;
import com.example.Nequi_service.adapter.repositories.IfranchiseRepository;
import com.example.Nequi_service.adapter.repositories.IproductRepository;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IproductRegisterGetaway;
import com.example.Nequi_service.application.nequiService.model.request.ProductUpdateQuantityRequest;
import com.example.Nequi_service.domain.Franchise;
import com.example.Nequi_service.domain.Ifranchise;
import com.example.Nequi_service.domain.Iproduct;
import com.example.Nequi_service.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductRegisterGetaway implements IproductRegisterGetaway {
    @Autowired
    IproductRepository _repository;

    public ProductRegisterGetaway(){}

    @Override
    public void save(Iproduct iproduct) {
        ProductMongoMapper productMongoMapper = new ProductMongoMapper(iproduct.getId(), iproduct.getName(), iproduct.getIdBranch(), iproduct.getDescription(), iproduct.getAmount(), iproduct.getQuantity());
        this._repository.save(productMongoMapper);
    }

    @Override
    public Product updateStoke(ProductUpdateQuantityRequest productQuantity) {
        ProductMongoMapper result = _repository.findById(productQuantity.getId()).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        result.setQuantity(productQuantity.getQuantity());
        _repository.save(result);
        Product product = new Product(result.getId(), result.getName(), result.getIdBranch(), result.getDescription(), result.getAmount(), result.getQuantity());
        return product;
    }


}
