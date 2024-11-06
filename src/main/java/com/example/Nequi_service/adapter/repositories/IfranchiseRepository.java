package com.example.Nequi_service.adapter.repositories;

import com.example.Nequi_service.adapter.gateways.mapper.FranchiseMongoMapper;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IfranchiseRepository extends MongoRepository<FranchiseMongoMapper, String> {
}
