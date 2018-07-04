package com.wlp.services;


import com.wlp.domain.Human;
import com.wlp.persistence.HumanPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class HumanService implements ICrudService<Human,Long>{


    @Autowired
    private HumanPersistence humanPersistence;


    @Override
    public List<Human> getAll() {
        Iterable<Human> iterator = humanPersistence.findAll();
        Iterator<Human> i = iterator.iterator();
        List<Human> list = new ArrayList<Human>();
        while(i.hasNext()){
            list.add(i.next());
        }
        return list;
    }

    @Override
    public Human getById(Long id) {

        return humanPersistence.findOne(id);
    }



    @Override
    public Human create(Human entity) {

        humanPersistence.save(entity);
        return entity;
    }

    @Override
    public Human remove(Human entity) {
        humanPersistence.delete(entity);

        return entity;
    }

    @Override
    public Human update(Human entity) {
        entity = humanPersistence.save(entity);
        return entity;
    }
}
