package com.generation.pruebajava.models;

public class Clase {
    //nombre del curso  , lista de estudiantes  y promedio de la clase
    
    public Integer cantidadEstudiantes; //listo
    public Float promedioCurso;
    
    public Clase() {
    }

    public Clase(Integer cantidadEstudiantes, Float promedioCurso) {
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.promedioCurso = promedioCurso;
    }

    public Integer getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(Integer cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public Float getPromedioCurso() {
        return promedioCurso;
    }

    public void setPromedioCurso(Float promedioCurso) {
        this.promedioCurso = promedioCurso;
    }

    @Override
    public String toString() {
        return "Clase [cantidadEstudiantes=" + cantidadEstudiantes + ", promedioCurso=" + promedioCurso + "]";
    }

   
}
