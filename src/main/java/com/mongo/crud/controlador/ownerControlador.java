package com.mongo.crud.controlador;

import com.mongo.crud.modelo.ownerModelo;
import com.mongo.crud.vista.ownerVista;
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
@RequestMapping("/api/owner")

public class ownerControlador {
    
    @Autowired
    private ownerVista user;
    
    ////////Procedimiento guardado general
    @PostMapping("/guardarOwner")
    public ownerModelo saveOwners(@Validated @RequestBody ownerModelo varU){
            return user.insert(varU);
    }
    
    ////////Procedimiento consulta general
    @GetMapping("/consultarOwner")
    public List<ownerModelo> colsultOwner(){

        return user.findAll();

    }
    
    ////////Procedimiento consulta por id
    @GetMapping("/consultarIdOwner/{id}")
    public Optional<ownerModelo> colsultOwnerInd(@PathVariable (value="id") String y){

        return user.findById(y);

    }

    //////////Procedimiento actualizar info
    @PutMapping("/actualizarOwner/{id}")
    public ownerModelo actualizarUsuarios(@PathVariable (value="id") String o, @Validated @RequestBody ownerModelo varU){

        return user.save(varU);

    }

    ///////////Procedimiento eliminar usuario
    @DeleteMapping("/eliminarOwner{id}")
    public void eliminarusuarios(@PathVariable String id){

        user.deleteById(id);

    }
    
}
