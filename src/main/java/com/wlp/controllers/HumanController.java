package com.wlp.controllers;


import com.wlp.domain.Human;
import com.wlp.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/human")
public class HumanController extends ICrudController<HumanService, Human, Long>{

    @Autowired
    private HumanService humanService;

    public HumanController(){

    }

    /**
     * injeta o serviço na classe pai
     */
    @PostConstruct
    public void init(){
       setService(humanService);

    }




}
