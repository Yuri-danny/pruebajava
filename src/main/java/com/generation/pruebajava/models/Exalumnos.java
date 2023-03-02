package com.generation.pruebajava.models;

public class Exalumnos extends Persona {
  
    public Integer anioEgreso; 

    public Exalumnos(){
        super();
        
    }

    public Exalumnos(String nombre, Integer edad, char sexo, String tipoSangre, String enfermedades, Float promedio,
            Integer anioEgreso) {
        super(nombre, edad, sexo, tipoSangre, enfermedades, promedio);
        this.anioEgreso = anioEgreso;
    }

    public Integer getAnioEgreso() {
        return anioEgreso;
    }

    public void setAnioEgreso(Integer anioEgreso) {
        this.anioEgreso = anioEgreso;
    }

    @Override
    public String toString() {
        return super.toString() + "Exalumnos [anioEgreso=" + anioEgreso + "]";
    }

   


    
}
