package com.generation.pruebajava.models;



public class Estudiante extends Persona{
    //publico = no dato sensible 
    public String curso;//listo
    public String asignaturas; //listo
    public Double notas;// listo (define cantidad de notas)

    public Estudiante(){
        super();
    }

    public Estudiante(String nombre, Integer edad, char sexo, String tipoSangre, String enfermedades, Float promedio,
            String curso, String asignaturas, Double notas) {
        super(nombre, edad, sexo, tipoSangre, enfermedades, promedio);
        this.curso = curso;
        this.asignaturas = asignaturas;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Double getNotas() {
        return notas;
    }

    public void setNotas(Double notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante [curso=" + curso + ", asignaturas=" + asignaturas + ", notas=" + notas + "]";
    }

    





}



