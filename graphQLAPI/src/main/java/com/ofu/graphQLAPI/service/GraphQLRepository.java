package com.ofu.graphQLAPI.service;

import com.ofu.graphQLAPI.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GraphQLRepository extends MongoRepository<Author,Long> {

}
