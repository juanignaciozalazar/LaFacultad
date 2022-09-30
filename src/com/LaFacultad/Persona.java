package com.LaFacultad;

abstract class Persona {

    // Atributos
    private String nombre;
    private String apellido;
    private int legajo;

    // Getters y setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "+" + "Apellido: " + apellido + " " + "Legajo: " + legajo;
    }
}
