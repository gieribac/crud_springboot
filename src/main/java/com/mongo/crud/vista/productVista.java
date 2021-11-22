package com.mongo.crud.vista;

import com.mongo.crud.modelo.productModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productVista extends MongoRepository<productModelo, String>{  
}

