package com.mongo.crud.controlador;

import com.mongo.crud.modelo.consultationModelo;
import com.mongo.crud.vista.consultationVista;
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
@RequestMapping("/api/consultation")

public class consultationControlador{
    @Autowired
    private consultationVista user;
    
    ////////Procedimiento guardado general
    @PostMapping("/guardarConsultation")
    public consultationModelo saveConsultation(@Validated @RequestBody consultationModelo varU){
            return user.insert(varU);
    }
    
    ////////Procedimiento consulta general
    @GetMapping("/consultarConsultation")
    public List<consultationModelo> colsultconsultation(){

        return user.findAll();

    }
    
    ////////Procedimiento consulta por id
    @GetMapping("/consultarIdConsultation/{id}")
    public Optional<consultationModelo> colsultOwnerInd(@PathVariable (value="id") String y){

        return user.findById(y);

    }

    //////////Procedimiento actualizar info
    @PutMapping("/actualizarConsultation/{id}")
    public consultationModelo actualizarUsuarios(@PathVariable (value="id") String id, @Validated @RequestBody consultationModelo varU){

        return user.save(varU);

    }

    ///////////Procedimiento eliminar 
    @DeleteMapping("/eliminarConsultation{id}")
    public void eliminarusuarios(@PathVariable String id){

        user.deleteById(id);

    }
    
}
