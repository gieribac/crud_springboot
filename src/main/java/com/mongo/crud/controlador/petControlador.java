package com.mongo.crud.controlador;

import com.mongo.crud.modelo.petModelo;
import com.mongo.crud.vista.petVista;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("/api/pet")

public class petControlador {
    
    @Autowired
    private petVista user;
    
    ////////Procedimiento guardado general
    @PostMapping("/guardarPet")
    public petModelo savePets(@Validated @RequestBody petModelo varU){
            return user.insert(varU);
    }
    
    ////////Procedimiento consulta general
    @GetMapping("/consultarPet")
    public List<petModelo> colsultPet(){

        return user.findAll();

    }
    
    ////////Procedimiento consulta por id
    @GetMapping("/consultarIdPet/{id}")
    public Optional<petModelo> colsultPetInd(@PathVariable (value="id") String y){

        return user.findById(y);

    }

    //////////Procedimiento actualizar info
    @PutMapping("/actualizarPet/{id}")
    public petModelo actualizarUsuarios(@PathVariable (value="id") String id, @Validated @RequestBody petModelo varU){

        return user.save(varU);

    }

    ///////////Procedimiento eliminar 
    @DeleteMapping("/eliminarPet{id}")
    public void eliminarusuarios(@PathVariable String id){

        user.deleteById(id);

    }
    
}
