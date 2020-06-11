package com.sportee.sportee.controllers;

import com.sportee.sportee.services.GymEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GymEquipmentController {

    @Autowired
    private GymEquipmentService ges;

    @RequestMapping(path = "feedEquipment")
    public void setDataInDB(){
        ges.saveEquipmentData();
    }
}
