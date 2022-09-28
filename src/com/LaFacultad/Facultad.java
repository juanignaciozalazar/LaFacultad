package com.LaFacultad;

import java.util.ArrayList;

public class Facultad implements Informacion {

    private String nombre;

    private ArrayList<Carrera> coleccionCarreras;

    public void agregarCarrera(Carrera carrera) {

    }

    public void eliminarCarrera(String nombre) {

    }

    public void eliminarEstudiante(Estudiante estudiante) {

    }

    @Override
    public int verCantidad() {
        return 0;
    }

    @Override
    public String listarContenido() {
        return null;
    }
}
