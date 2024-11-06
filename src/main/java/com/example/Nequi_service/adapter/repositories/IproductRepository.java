package com.example.Nequi_service.adapter.repositories;

import com.example.Nequi_service.adapter.gateways.mapper.ProductMongoMapper;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface IproductRepository extends MongoRepository<ProductMongoMapper, String> {
    @Query("{ 'id': ?0, 'idBranch': ?1 }")
    Optional<ProductMongoMapper> findTopByIdAndIdBranchOrderByQuantityDesc(String id, String idBranch);
}
