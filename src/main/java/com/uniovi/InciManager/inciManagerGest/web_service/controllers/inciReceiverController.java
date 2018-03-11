package com.uniovi.InciManager.inciManagerGest.web_service.controllers;

import com.uniovi.InciManager.inciManagerGest.web_service.request.IncidenceREST;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class inciReceiverController {

    @RequestMapping(value = "/addIncidence", method = RequestMethod.POST)
    public void addIncidencePOST(@RequestParam("incidence") IncidenceREST datosIncidence){
        // código para
    }
}
