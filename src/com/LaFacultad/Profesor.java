package com.LaFacultad;

public class Profesor extends Persona{
    public Profesor(String nombre, String apellido, String legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(Integer.parseInt(legajo));
    }

    @Override
    public String toString(){
        return "Nombre profesor: "+super.toString();
    }

    public void modificarDatos(String nombre, String apellido, String legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);

        try {
            super.setLegajo(Integer.parseInt(legajo));
        }catch (Exception e){
            System.out.println("Los datos no son validos.");
        }
    }
