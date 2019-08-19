package com.rest.testes.result.restResult.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tarefa {

    private int id;

    private String  titulo;


      private int usuarioId;

      private boolean  completo;
//    public Tarefa(int id, String titulo, int usuarioId, boolean completo) {
//        this.id = id;
//        this.titulo = titulo;
//        this.usuarioId = usuarioId;
//        this.completo = completo;
//    }
//    public Tarefa() {
//    }

    //@JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setCompleto(boolean completo) {
        completo = completo;
    }
    @JsonProperty("id")
    public int getId() {
        return id;
    }
    @JsonProperty("titulo")
    public String getTitulo() {
        return titulo;
    }
    @JsonProperty("usuarioId")
    public int getUsuarioId() {
        return usuarioId;
    }
    @JsonProperty("completo")
    public boolean isCompleto() {
        return completo;
    }


}
