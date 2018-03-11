package com.uniovi.InciManager.inciManagerGest.web_service;

import com.uniovi.InciManager.db_management.model.Incidence;

public interface InciReceiver {

    /*
    * Recibe la información de las incidencias por parte de los agentes
    * */
    public void getInciReceiver(Incidence incidence);
}
