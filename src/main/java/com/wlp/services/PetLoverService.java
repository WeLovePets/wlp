package com.wlp.services;


import com.wlp.domain.PetLover;
import com.wlp.persistence.PetLoverPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class PetLoverService implements ICrudService<PetLover, Long>{

    @Autowired
    private PetLoverPersistence petLoverPersistence;

    @Override
    public List<PetLover> getAll() {
        Iterable<PetLover> iterator = petLoverPersistence.findAll();
        Iterator<PetLover> i = iterator.iterator();
        List<PetLover> list = new ArrayList<PetLover>();
        while(i.hasNext()){
            list.add(i.next());
        }
        return list;
    }

    @Override
    public PetLover getById(Long id) {
        return petLoverPersistence.findOne(id);
    }



    @Override
    public PetLover create(PetLover entity) {
        petLoverPersistence.save(entity);

        return entity;
    }

    @Override
    public PetLover remove(PetLover entity) {

        petLoverPersistence.delete(entity);
        return entity;
    }

    @Override
    public PetLover update(PetLover entity) {
        petLoverPersistence.save(entity);
        return entity;
    }
}
