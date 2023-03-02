package com.generation.pruebajava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.pruebajava.models.Clase;
import com.generation.pruebajava.models.Estudiante;
import com.generation.pruebajava.models.Exalumnos;

@SpringBootApplication
public class PruebajavaApplication {

	public static void main(String[] args) {
		Scanner datoScaner = new Scanner(System.in);
		Estudiante datoEstudiante = new Estudiante();
		Exalumnos datoExalumnos = new Exalumnos();
		Clase datoClase = new Clase();

		HashMap<String, ArrayList<Double>> alumnosNotas = new HashMap<String, ArrayList<Double>>();

		/*
		 * solicitar numero estudiantes
		 * solicitar cantidad notas
		 * solicitar estudiantes (nombres)
		 * solicitar notas de cada estudiante
		 * sumar las notas , luego dividirlas por la cantidad de notas y generar el
		 * promedio
		 * mostrar el promedio de cada estudiantes
		 * generar un arreglo de alumnos por curso y que luego muestre las
		 * "caracteristicas"de cada alumno
		 * segun el arreglo de notas de cada alumno generar un filtro que muestre mayor
		 * nota y menor
		 */

		System.out.println("ingrese el curso de sus estudiantes : ");
		datoEstudiante.curso = datoScaner.nextLine();

		System.out.println("ingrese el nombre de la asignatura correspondiente:");
		datoEstudiante.asignaturas = datoScaner.nextLine();

		// esto es una prueba System.out.println("la cantidad de estudiantes es :"+
		// datoClase.cantidadEstudiantes);

		System.out.println("ingrece la cantidad de notas por estudiante:");
		datoEstudiante.notas = datoScaner.nextDouble(); // cantidad notas ,definir las notas

		// System.out.println("ingrece nombre alumno: ");
		// datoEstudiante.nombre = datoScaner.nextLine();

		do {
			System.out.println("ingrese la cantidad de alumnos:");
			datoClase.cantidadEstudiantes = datoScaner.nextInt();
			if (datoClase.cantidadEstudiantes <= 0) {
				System.out.println("la cantidad de alumnos debe ser mayor que 0 , vuelva a intentar ");
			}
		} while (datoClase.cantidadEstudiantes <= 0);

		for (int i = 1; i <= datoClase.cantidadEstudiantes; i++) {
			// datoScaner.next();
			datoScaner.nextLine();// reinicia el scaner 
			System.out.println("ingresa nombre del estudiante " + i + ": ");// ?????? si funciona
			String nombreAlumno = datoScaner.nextLine();
			ArrayList<Double> notasAlumno = new ArrayList<Double>();
			// si cambio i por x funciona
			// ArrayList<Float> array1 = new ArrayList<Float>(); no funciona ???
			for (int x = 1; x <= datoEstudiante.notas; x++) {
				System.out.println("ingrese nota " + x + " del alumno " + nombreAlumno + ": ");
				Double nota = datoScaner.nextDouble();
				notasAlumno.add(nota);

				// no logro entender el error , este es un intento viendo clases
				// no estoy segura si esta bien o mal el error no me deja probar
				// se encontro el error , y aun asi existe un error al correrlo que no encuentro
				// tenia un String mal
			}
			alumnosNotas.put(nombreAlumno, notasAlumno);

		}
		
		// Imprimir los nombres y notas de cada alumno
		for (String alumno : alumnosNotas.keySet()) {
			System.out.print(alumno + ": ");
			ArrayList<Double> notas = alumnosNotas.get(alumno);
			for (Double nota : notas) {
				System.out.print(nota + " ");
			}

		}
	}
}