package com.mongo.crud.vista;

import com.mongo.crud.modelo.ownerModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ownerVista extends MongoRepository<ownerModelo, String>{  
}
