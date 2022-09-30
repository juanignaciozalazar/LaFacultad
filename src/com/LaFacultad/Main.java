package com.LaFacultad;

public class Main {
    public static void main(String[] args) {


        Profesor miProfesor = new Profesor("Facundo", "Uferer", "20000");
        Materia miMateria = new Materia("Laboratorio de Computacion II", miProfesor);
        Carrera miCarrera = new Carrera("Tecnicatura Universitaria en Programación");
        Facultad miFacultad = new Facultad("UTN");

        // Requerimiento 1
        System.out.println(miFacultad.listarContenido());
        miFacultad.agregarCarrera(miCarrera);
        System.out.println(miFacultad.listarContenido());

        // Requerimiento 2
        miFacultad.eliminarCarrera("Tecnicatura Universitaria en Programación");
        miFacultad.eliminarCarrera("Ingenieria en Pepe");
        System.out.println(miFacultad.listarContenido());

        // Requerimiento 3: en clase Facultad

        // Requerimiento 4
        miCarrera.agregarMateria(miMateria);
        System.out.println(miCarrera.listarContenido());
        // Requerimiento 5
        miCarrera.eliminarMateria(miMateria.getNombre());

        // Requerimiento 6
        miCarrera.agregarMateria(miMateria);
        miCarrera.encontrarMateria(miMateria.getNombre());

        // Requerimiento 7
        Estudiante miEstudiante = new Estudiante("Pepe", "Paredes", "1234");
        miMateria.agregarEstudiante(miEstudiante);
        System.out.println(miMateria.listarContenido());

        // Requerimiento 8
        miMateria.eliminarEstudiante(miEstudiante);
        System.out.println(miMateria.listarContenido());

        // Requerimiento 9
        miMateria.modificarTitular(new Profesor ("Facundo", "Matoff", "10000"));
        System.out.println(miMateria);
        // Requerimiento 10: en clases Estudiante y Profesor

        // Requerimiento 11: en clase Profesor

        // Requerimiento 12 y 13: en clase Facultad, Carrera, y Materia

        // Requerimiento 14: en el resto de clases

        // Requerimiento 16: Ejemplos en


    }
}
