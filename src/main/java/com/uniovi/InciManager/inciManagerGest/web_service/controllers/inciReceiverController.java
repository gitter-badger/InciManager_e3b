package com.uniovi.InciManager.inciManagerGest.web_service.controllers;

import com.uniovi.InciManager.db_management.model.Incidence;
import com.uniovi.InciManager.inciManagerGest.web_service.InciReceiver;
import com.uniovi.InciManager.inciManagerGest.web_service.request.IncidenceREST;
import com.uniovi.InciManager.inciManagerGest.web_service.responses.RespuestaAddIncidenceREST;
import com.uniovi.InciManager.inciManagerGest.web_service.services.InciReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class inciReceiverController implements InciReceiver {

    @Autowired
    InciReceiverService inciReceiverService;

    /**
     * Método para añadir una incidencia que un agente envía.
     *
     * @param incidenceREST
     * @return  respuesta, con fomato "id",
     */
    @RequestMapping(value = "/addIncidence", method = RequestMethod.POST)
    public ResponseEntity<RespuestaAddIncidenceREST> addIncidence(@ModelAttribute IncidenceREST incidenceREST) {
        // TODO: procesar la incidencia que se recibe
        RespuestaAddIncidenceREST res = new RespuestaAddIncidenceREST("id",incidenceREST.getIncidenceName(),"no añadida.");
        return new ResponseEntity<RespuestaAddIncidenceREST>(res, HttpStatus.OK);
    }

}
