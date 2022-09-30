package com.LaFacultad;

import static com.LaFacultad.Utilidad.stringToInt;

public class Profesor extends Persona {

    // Atributos

    private double basico;
    private int antiguedad;

    // Constructores

    public Profesor(String nombre, String apellido, String legajo) {
        setNombre(nombre);
        setApellido(apellido);
        setLegajo(stringToInt(legajo));
    }

    // Getters y setters

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    // Metodos

    public double calcularSueldo() {
        return basico + basico * 0.10 * (double) antiguedad;
    }

    @Override
    public String toString() {
        return "Nombre profesor: " + super.toString();
    }

    public void modificarDatos(String nombre, String apellido, String legajo) {
        setNombre(nombre);
        setApellido(apellido);

        try {
            super.setLegajo(Integer.parseInt(legajo));
        } catch (Exception e) {
            System.out.println("Los datos no son validos.");
        }
    }
}