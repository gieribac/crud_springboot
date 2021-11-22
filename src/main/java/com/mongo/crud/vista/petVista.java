package com.mongo.crud.vista;

import com.mongo.crud.modelo.petModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface petVista extends MongoRepository<petModelo, String>{  
}
