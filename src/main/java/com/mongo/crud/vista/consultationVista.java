package com.mongo.crud.vista;

import com.mongo.crud.modelo.consultationModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface consultationVista extends MongoRepository<consultationModelo, String>{  
}
