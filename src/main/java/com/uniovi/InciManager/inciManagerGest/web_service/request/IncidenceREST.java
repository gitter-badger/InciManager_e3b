package com.uniovi.InciManager.inciManagerGest.web_service.request;

import com.uniovi.InciManager.db_management.model.Incidence;
import com.uniovi.InciManager.util.Estado;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class IncidenceREST {

    String username;                    // nombre de usuario del agente
    String password;                    // para autenticación en la petición REST
    String incidenceName;
    String description;
    String location;                    // formato de la localización: "45.67, 32.86"
    List<String> labels;                // etiquetas de la incidencia
    HashMap<String, String> campos;     // campos con propiedad valor
    Estado status;                      // Ver Enum: "Estado". Ej: ABIERTA, EN_PROCESO, CERRADA, ANULADA
    Date expiration;                    // fecha de caducidad, ej: en caso de los sensores de temperatura

    public IncidenceREST() {
    }

    public IncidenceREST(String username, String password, String incidenceName, String description, String location, List<String> labels, HashMap<String, String> campos, Estado status, Date expiration) {
        this.username = username;
        this.password = password;
        this.incidenceName = incidenceName;
        this.description = description;
        this.location = location;
        this.labels = labels;
        this.campos = campos;
        this.status = status;
        this.expiration = expiration;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIncidenceName() {
        return incidenceName;
    }

    public void setIncidenceName(String incidenceName) {
        this.incidenceName = incidenceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public HashMap<String, String> getCampos() {
        return campos;
    }

    public void setCampos(HashMap<String, String> campos) {
        this.campos = campos;
    }

    public Estado getStatus() {
        return status;
    }

    public void setStatus(Estado status) {
        this.status = status;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
}
