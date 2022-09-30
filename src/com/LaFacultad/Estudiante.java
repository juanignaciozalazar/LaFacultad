package com.LaFacultad;

import static com.LaFacultad.Utilidad.stringToInt;

public class Estudiante extends Persona {
    public Estudiante(String nombre, String apellido, String legajo) {
        setNombre(nombre);
        setApellido(apellido);
        setLegajo(stringToInt(legajo));
    }
}
