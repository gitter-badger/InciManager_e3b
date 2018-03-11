package com.uniovi.InciManager.inciManagerGest.web_service.request;

import com.uniovi.InciManager.db_management.model.Incidence;

public class IncidenceREST {
    private Incidence incidence;

    public IncidenceREST(Incidence incidence) {
        this.incidence = incidence;
    }

    public Incidence getIncidence() {
        return incidence;
    }

    public void setIncidence(Incidence incidence) {
        this.incidence = incidence;
    }
}
