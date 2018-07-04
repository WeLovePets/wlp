package com.wlp.controllers;

import com.wlp.services.ICrudService;
import org.hibernate.id.IdentifierGenerationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

/**
 * Contém os mapeametos genericos que os controles ProfessionalController e ClientController possuem
 *
 * @param <Service> - Instancia do serviço adequado
 * @param <T> - instancia do tipo adequado
 * @param <S> - qualquer serializable
 */
public class ICrudController<Service extends ICrudService,T, S extends Serializable> {
    private static Logger LOG = Logger.getLogger(ICrudController.class.getName());

    private Service service;


    public ICrudController(){}


    @GetMapping("/all")
    public List<T> getAll(){

        return service.getAll();
    }

    @GetMapping("/getById/{id}")
    public T getById(@PathVariable String id){

        return (T) service.getById(id);
    }



    @PostMapping("/create")
    public ResponseEntity<T> create(@RequestBody  T entity){

        T response = (T) service.create(entity);

      if(response == null){
        return ResponseEntity.notFound().build();
      }else{
         return ResponseEntity.ok(response);
      }


    }

    @PostMapping("/remove")
    public  ResponseEntity<T> remove(@RequestBody T entity){



        try{
            T response = (T) service.remove(entity);
            return ResponseEntity.ok(response);

        }catch(IdentifierGenerationException e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }


    }

    @PostMapping("/update")
    public ResponseEntity<T> update(@RequestBody T entity){
        T response = (T) service.update(entity);

        if(response == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(response);
        }
    }


    public void setService(Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }
}
