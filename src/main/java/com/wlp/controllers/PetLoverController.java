package com.wlp.controllers;


import com.wlp.domain.PetLover;
import com.wlp.services.PetLoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/petlover")
public class PetLoverController extends ICrudController<PetLoverService,PetLover,Long> {

    @Autowired
    private PetLoverService petLoverService;

    public PetLoverController(){}

    @PostConstruct
    public void init(){
        setService(petLoverService);
    }



}
