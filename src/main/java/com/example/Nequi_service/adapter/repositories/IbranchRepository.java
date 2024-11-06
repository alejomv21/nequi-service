package com.example.Nequi_service.adapter.repositories;

import com.example.Nequi_service.adapter.gateways.mapper.BranchMongoMapper;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IbranchRepository extends MongoRepository<BranchMongoMapper, String> {
}
