package com.uniovi.InciManager.inciManagerGest.web_service.controllers;

import com.uniovi.InciManager.inciManagerGest.web_service.request.IncidenceREST;
import com.uniovi.InciManager.inciManagerGest.web_service.services.InciReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class inciReceiverController {

    @Autowired
    InciReceiverService inciReceiverService;

    /**
     * Método para añadir una incidencia
     * @param incidenceREST
     * @return
     */
    @RequestMapping(value = "/addIncidence", method = RequestMethod.POST)
    public ResponseEntity addIncidence(@ModelAttribute IncidenceREST incidenceREST){
        // proceso
        return null;
    }
}
