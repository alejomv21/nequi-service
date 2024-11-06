package com.example.Nequi_service.adapter.gateways.h2;

import com.example.Nequi_service.adapter.gateways.mapper.BranchMongoMapper;
import com.example.Nequi_service.adapter.gateways.mapper.FranchiseMongoMapper;
import com.example.Nequi_service.adapter.gateways.mapper.ProductMongoMapper;
import com.example.Nequi_service.adapter.repositories.IbranchRepository;
import com.example.Nequi_service.adapter.repositories.IfranchiseRepository;
import com.example.Nequi_service.adapter.repositories.IproductRepository;
import com.example.Nequi_service.application.nequiService.boundaries.output.register.IbranchRegisterGetaway;
import com.example.Nequi_service.application.nequiService.model.response.BranchProductStockResponse;
import com.example.Nequi_service.domain.Branch;
import com.example.Nequi_service.domain.Franchise;
import com.example.Nequi_service.domain.Ibranch;
import com.example.Nequi_service.domain.Ifranchise;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BranchRegisterGateway implements IbranchRegisterGetaway {
    @Autowired
    IbranchRepository _repository;

    @Autowired
    IproductRepository _repositoryProduct;

    public BranchRegisterGateway(){};

    @Override
    public void save(Ibranch ibranch) {
        BranchMongoMapper branchMongoMapper = new BranchMongoMapper(ibranch.getId(), ibranch.getName(), ibranch.getProducts(), ibranch.getDescription(), ibranch.getAddress());
        this._repository.save(branchMongoMapper);
    }

    @Override
    public boolean existsById(String id) {
        return _repository.existsById(id);
    }

    @Override
    public Branch addProduct(String idBranch, String idProduct) {
        if (!_repositoryProduct.existsById(idProduct)) {
            throw new RuntimeException("Branch ID " + idProduct + " no existe en la colección Branch.");
        }
        BranchMongoMapper branch = _repository.findById(idBranch)
                .orElseThrow(() -> new RuntimeException("Franchise con ID " + idBranch + " no encontrado."));

        if (!branch.getProducts().contains(idProduct)) {
            branch.getProducts().add(idProduct);
            _repository.save(branch);
        } else {
            throw new RuntimeException("El branch ya existe en el franchise.");
        }

        Branch branches = new Branch(branch.getId(), branch.getName(), branch.getProducts(), branch.getDescription(), branch.getAddress());

        return branches;
    }

    @Override
    public BranchProductStockResponse getProductQuantity(String idBranch, String idProduct) {
        Optional<ProductMongoMapper> productOptional = _repositoryProduct.findTopByIdAndIdBranchOrderByQuantityDesc(idProduct, idBranch);

        ProductMongoMapper product = productOptional
                .orElseThrow(() -> new RuntimeException("Producto con ID " + idProduct + " y Branch ID " + idBranch + " no encontrado."));

        BranchMongoMapper branch = _repository.findById(product.getIdBranch())
                .orElseThrow(() -> new RuntimeException("Branch con ID " + product.getIdBranch() + " no encontrado."));

        BranchProductStockResponse branchProduct = new BranchProductStockResponse(branch.getId(), branch.getName(), product.getName(), product.getQuantity());
        return branchProduct;
    }
}
