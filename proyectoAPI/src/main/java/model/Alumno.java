package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize
public class Alumno implements Serializable {
    @JsonProperty("id")
    private long id;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("apellido")
    private String apellido;
    @JsonProperty("ocupacion")
    private String ocupacion;
    @JsonProperty("perfil")
    private String perfil;
    @JsonProperty("telefono")
    private String telefono;
    @JsonProperty("email")
    private String email;
    @JsonProperty("habilidad_1")
    private String habilidad_1;
    @JsonProperty("habilidad_2")
    private String habilidad_2;
    @JsonProperty("habilidad_3")
    private String habilidad_3;
    @JsonProperty("habilidad_4")
    private String habilidad_4;
    @JsonProperty("habilidad_5")
    private String habilidad_5;
    @JsonProperty("nombreempresa")
    private String nombreempresa;
    @JsonProperty("descripcionempresa")
    private String descripcionempresa;
    @JsonProperty("nombreempresa_2")
    private String nombreempresa_2;
    @JsonProperty("descripcionempresa_2")
    private String descripcionempresa_2;

    @JsonProperty("nombreempresa_3")
    private String nombreempresa_3;
    @JsonProperty("descripcionempresa_3")
    private String descripcionempresa_3;
    @JsonProperty("escuela")
    private String escuela;
    @JsonProperty("tiempo_escuela")
    private String tiempo_escuela;
    @JsonProperty("titulo_ejemplo")
    private String titulo_ejemplo;



    public Alumno(){}
    public Alumno(long id, String nombre,String apellido, String ocupacion, String perfil, String telefono,
                  String email,String habilidad_1,String habilidad_2,String habilidad_3,String habilidad_4,String habilidad_5,  String nombreempresa, String descripcionempresa ,
                  String nombreempresa_2, String descripcionempresa_2 , String nombreempresa_3,
                  String descripcionempresa_3, String escuela, String tiempo_escuela, String titulo_ejemplo)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion= ocupacion;
        this.perfil = perfil;
        this.telefono = telefono;
        this.email = email;
        this.habilidad_1 = habilidad_1;
        this.habilidad_2 = habilidad_2;
        this.habilidad_3 = habilidad_3;
        this.habilidad_4 = habilidad_4;
        this.habilidad_5 = habilidad_5;
        this.nombreempresa = nombreempresa;
        this.descripcionempresa = descripcionempresa;
        this.nombreempresa_2 = nombreempresa_2;
        this.descripcionempresa_2 = descripcionempresa_2;
        this.nombreempresa_3= nombreempresa_3;
        this.descripcionempresa_3 = descripcionempresa_3;
        this.escuela = escuela;
        this.tiempo_escuela = tiempo_escuela;
        this.titulo_ejemplo = titulo_ejemplo;
    }


    public long getId() {
        return this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}



