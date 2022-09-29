package com.LaFacultad;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Materia {
    private String nombre;
    private Profesor titular;
    private Set<Estudiante> coleccionEstudiantes;

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new HashSet<>();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular='" + titular + '\'' +
                ", coleccionEstudiantes='" + coleccionEstudiantes + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public Set<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(Set<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante){
        coleccionEstudiantes.add(estudiante);
    }
    public void eliminarEstudiantes(String nombre){
        Iterator<Estudiante> i = coleccionEstudiantes.iterator();
        while(i.hasNext()) {
            Estudiante auxEstudiante= i.next();
            if (auxEstudiante.getNombre().equals(nombre)) {
                coleccionEstudiantes.remove(auxEstudiante);
                break;
            }
        }
        coleccionEstudiantes.remove(nombre);
    }
    public void modificarTitular(Profesor profesor){
        this.titular = profesor;
    }
}
