package com.generation.pruebajava.models;

public class Persona {
    public String nombre;
    public Integer edad;
    public char sexo;
    private String tipoSangre;
    private String enfermedades;
    public Float promedio;
    
    public Persona() {
    }

    public Persona(String nombre, Integer edad, char sexo, String tipoSangre, String enfermedades, Float promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.tipoSangre = tipoSangre;
        this.enfermedades = enfermedades;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", tipoSangre=" + tipoSangre
                + ", enfermedades=" + enfermedades + ", promedio=" + promedio + "]";
    }


    
    
}
