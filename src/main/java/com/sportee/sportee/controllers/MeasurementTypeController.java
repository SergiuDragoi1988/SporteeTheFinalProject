package com.sportee.sportee.controllers;

import com.sportee.sportee.services.MeasurementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/measurementTypes")
public class MeasurementTypeController {
    private MeasurementTypeService measurementTypeService;

    @Autowired
    public MeasurementTypeController(MeasurementTypeService measurementTypeService) {
        this.measurementTypeService = measurementTypeService;
    }

    @GetMapping({"/measurementTypes/showAll"})
    public ModelAndView showAllMeasurementTypes() {
        ModelAndView mv = new ModelAndView("measurementTypes");
        mv.addObject("measurementTypes", measurementTypeService.getAllMeasurementTypes());
        return mv;
    }

    //    @GetMapping("/{id}/editMeasurementType")
//    public ModelAndView editMeasurementType(@PathVariable Integer id) {
//        ModelAndView mv = new ModelAndView("editMeasurementType");
//        mv.addObject("editMeasurementType", measurementTypeService.getMeasurementType(id));
//        return mv;
//    }
//    @GetMapping("/{id}/editMeasurementType")
//    public String editMeasurementType(@PathVariable Integer id,Model model) {
//        Optional<MeasurementType> measurementType = measurementTypeService.findMeasurementTypeById(id);
//        model.addAttribute("measurementType", measurementType);
//        return "editMeasurementType";
//
//    }

//    @PostMapping("/{id}/editMeasurementType")
//    public ModelAndView editMeasurementType(@PathVariable Integer id, Optional<String> name, Optional<String> unit) {
//        measurementTypeService.editMeasurementType(id, name, unit);
//        return showAllMeasurementTypes();
//    }



    @GetMapping("/insertMeasurementType")
    public String insertMeasurementType() {
        return "insertMeasurementType";

    }

    @PostMapping("/insertMeasurementType")
    public ModelAndView insertMeasurementType(String name, String unit) {
        measurementTypeService.insertMeasurementType(name, unit);
        return showAllMeasurementTypes();
    }


//    @RequestMapping("/{id}/delete")
//    public ModelAndView deleteMember(@PathVariable Integer id) {
//        measurementTypeService.deleteMeasurementType(id);
//        return showAllMeasurementTypes();

    }


