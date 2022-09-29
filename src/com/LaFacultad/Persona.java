package com.LaFacultad;

abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public int getLegajo() {
        return legajo;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+ "+" + "Apellido: "+apellido+ " " + "Legajo: "+legajo;
    }
