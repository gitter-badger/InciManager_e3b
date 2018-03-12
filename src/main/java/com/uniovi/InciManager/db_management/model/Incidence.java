package com.uniovi.InciManager.db_management.model;

import com.uniovi.InciManager.util.Estado;
import sun.management.Agent;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Incidence {

    String username;                    // nombre de usuario del agente
    String incidenceName;
    String description;
    String location;                    // formato de la localización: "45.67, 32.86"
    List<String> labels;                // etiquetas de la incidencia
    HashMap<String, String> campos;     // campos con propiedad valor
    Estado status;                      // Ver Enum: "Estado". Ej: ABIERTA, EN_PROCESO, CERRADA, ANULADA
    Date expiration;                    // fecha de caducidad, ej: en caso de los sensores de temperatura

    /**
     * Constructor con todos los parametros
     *
     * @param username
     * @param incidenceName
     * @param description
     * @param location
     * @param labels
     * @param campos
     * @param status
     * @param expiration
     */
    public Incidence(String username, String incidenceName, String description, String location, List<String> labels, HashMap<String, String> campos, Estado status, Date expiration) {
        this.username = username;
        this.incidenceName = incidenceName;
        this.description = description;
        this.location = location;
        this.labels = labels;
        this.campos = campos;
        this.status = status;
        this.expiration = expiration;
    }

    /**
     * Constructor con los parámetros obligatorios
     *
     * @param username
     * @param incidenceName
     * @param description
     * @param location
     * @param labels
     */
    public Incidence(String username, String incidenceName, String description, String location, List<String> labels) {
        this.username = username;
        this.incidenceName = incidenceName;
        this.description = description;
        this.location = location;
        this.labels = labels;
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
