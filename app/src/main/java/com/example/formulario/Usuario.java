package com.example.formulario;

import java.io.Serializable;

public class Usuario implements Serializable {
    private long tel;
    private String nombre;
    private String correo;
    private String contra;

    public Usuario(String nombre, long tel, String correo, String contra) {

        this.tel = tel;
        this.nombre = nombre;
        this.correo = correo;
        this.contra = contra;
    }

    public long getTel() {
        return tel;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTel(long tel) {
        this.tel = tel;
    }
    public void setContra(String contra) {
        this.contra = contra;
    }
    public String getCorreo() {
        return correo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContra() {
        return contra;
    }

}
