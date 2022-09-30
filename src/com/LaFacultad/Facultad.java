package com.LaFacultad;

import java.util.*;

public class Facultad implements Informacion {

    // Atributos
    private String nombre;
    private List<Carrera> coleccionCarreras = new ArrayList<>();

    //Constructores
    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    public Facultad() {
        this.nombre = null;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }
    public void setColeccionCarreras(List<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    public void agregarCarrera(Carrera carrera) {
        coleccionCarreras.add(carrera);
    }

    public void eliminarCarrera(String nombre) {
        Iterator<Carrera> i = coleccionCarreras.iterator();
        while(i.hasNext()) {
            Carrera auxCarrera = i.next();
            if (auxCarrera.getNombre().equals(nombre)) {
                coleccionCarreras.remove(auxCarrera);
                System.out.println("Carrera eliminada con exito");
                break;
            }
        }
        System.out.println("Carrera no encontrada");
    }


    // Requerimiento 3
    public void eliminarEstudiante(Estudiante estudiante) {
        Iterator<Carrera> iCarrera = coleccionCarreras.iterator();
        Iterator<Materia> iMateria;
        Iterator<Estudiante> iEstudiante;
        Carrera auxCarrera;
        Materia auxMateria;
        Estudiante auxEstudiante;

        // Este choclo itera por todas la coleccion de carreras, de materias y de estudiantes
        // buscando todas las apariciones del estudiante.
        while (iCarrera.hasNext()) {
            auxCarrera = iCarrera.next();
            iMateria = auxCarrera.getColeccionMaterias().iterator();
            while (iMateria.hasNext()) {
                auxMateria = iMateria.next();
                iEstudiante = auxMateria.getColeccionEstudiantes().iterator();
                while (iEstudiante.hasNext()) {
                    auxEstudiante = iEstudiante.next();
                    if (auxEstudiante.equals(estudiante)) {
                        auxMateria.eliminarEstudiante(estudiante);
                    }
                }
            }
        }

    }

    @Override
    public String listarContenido() {
        coleccionCarreras.sort(Comparator.comparing(Carrera::getNombre));
        String out = "Facultad['" + this.nombre + "', coleccionCarreras = {";
        Iterator<Carrera> i = coleccionCarreras.iterator();
        Carrera auxCarrera;
        while (i.hasNext()) {
            auxCarrera = i.next();
            out = out + auxCarrera.getNombre() + ", ";
        }
        out = out + "}]";
        return out;
    }

    @Override
    public int verCantidad() {
        return coleccionCarreras.size();
    }
}
