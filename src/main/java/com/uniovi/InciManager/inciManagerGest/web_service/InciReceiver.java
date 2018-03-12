package com.uniovi.InciManager.inciManagerGest.web_service;

import com.uniovi.InciManager.inciManagerGest.web_service.request.IncidenceREST;
import com.uniovi.InciManager.inciManagerGest.web_service.responses.RespuestaAddIncidenceREST;
import org.springframework.http.ResponseEntity;

public interface InciReceiver {

    public ResponseEntity<RespuestaAddIncidenceREST> addIncidence(IncidenceREST incidenceREST);
}
