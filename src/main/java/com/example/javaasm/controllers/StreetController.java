package com.example.javaasm.controllers;

import com.example.javaasm.dto.StreetDTO;
import com.example.javaasm.entity.Street;
import com.example.javaasm.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/streets")
public class StreetController {

    @Autowired
    private StreetService streetService;

//    @RequestMapping(method = RequestMethod.GET)
//    public Iterable<StreetDTO> findAllEmployees (){
//        return streetService.findAll();
//    }

    @RequestMapping(method = RequestMethod.POST)
    public StreetDTO saveStreet (@RequestBody StreetDTO streetDTO){

        return streetService.save(streetDTO);
    }
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<StreetDTO> findAllByDistrictIdAndName(@RequestParam(defaultValue = "") String streetName, @RequestParam(defaultValue = "") String districtName) {

        return streetService.findStreetByNameContainsAndDistrictName(streetName,districtName);
    }
}
