package com.mongo.crud.controlador;

import com.mongo.crud.modelo.productModelo;
import com.mongo.crud.vista.productVista;
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
@RequestMapping("/api/product")

public class productControlador {
    
    @Autowired
    private productVista user;
    
    ////////Procedimiento guardado general
    @PostMapping("/guardarProduct")
    public productModelo saveProducts(@Validated @RequestBody productModelo varU){
            return user.insert(varU);
    }
    
    ////////Procedimiento consulta general
    @GetMapping("/consultarProduct")
    public List<productModelo> colsultProduct(){

        return user.findAll();

    }
    
    ////////Procedimiento consulta por id
    @GetMapping("/consultarIdProduct/{id}")
    public Optional<productModelo> colsultProductInd(@PathVariable (value="id") String y){

        return user.findById(y);

    }

    //////////Procedimiento actualizar info
    @PutMapping("/actualizarProduct/{id}")
    public productModelo actualizarUsuarios(@PathVariable (value="id") String id, @Validated @RequestBody productModelo varU){

        return user.save(varU);

    }

    ///////////Procedimiento eliminar 
    @DeleteMapping("/eliminarProduct{id}")
    public void eliminarusuarios(@PathVariable String id){

        user.deleteById(id);

    }
    
}
