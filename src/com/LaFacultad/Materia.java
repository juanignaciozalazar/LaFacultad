package com.LaFacultad;

import java.util.*;

public class Materia extends Carrera implements Informacion {
    private String nombre;
    private Profesor titular;
    private List<Estudiante> coleccionEstudiantes;

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new ArrayList<>();
    }

    @Override
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

    public List<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(List<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante){
        coleccionEstudiantes.add(estudiante);
    }

    // AVISO: Este metodo elimina todos los estudiantes que tengan el nombre del parametro.
    public void eliminarEstudiante(String nombre){
        Iterator<Estudiante> i = coleccionEstudiantes.iterator();
        while(i.hasNext()) {
            Estudiante auxEstudiante = i.next();
            if (auxEstudiante.getNombre().equals(nombre)) {
                coleccionEstudiantes.remove(auxEstudiante);
                break;
            }
        }
        coleccionEstudiantes.remove(nombre);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        coleccionEstudiantes.remove(estudiante);
    }

    public void modificarTitular(Profesor profesor){
        this.titular = profesor;
    }

    public String listarContenido() {
        coleccionEstudiantes.sort(Comparator.comparing(Estudiante::getNombre));
        String out = "Materia['" + getNombre() + "', coleccionMaterias = {";
        for (Estudiante estudiante: coleccionEstudiantes) {
            out = out + estudiante.getNombre() + ", ";
        }
        out = out + "}]";
        return out;
    }

    @Override
    public int verCantidad() {
        return coleccionEstudiantes.size();
    }




}
