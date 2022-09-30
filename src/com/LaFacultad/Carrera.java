package com.LaFacultad;


import java.util.*;

public class Carrera extends Facultad implements Informacion {

    //Atributos
    private List<Materia> coleccionMaterias = new ArrayList<>();

    //Constructores
    public Carrera(String nombre, List<Materia> coleccionDeMaterias) {
        super(nombre);
        this.coleccionMaterias = coleccionDeMaterias;
    }

    public Carrera(String nombre) {
        super(nombre);
    }

    public Carrera() {}

    public List<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    //Metodos

    public void agregarMateria (Materia materias) {
        coleccionMaterias.add(materias);
    }

    public void eliminarMateria (String nombre){
        for (Materia materia: coleccionMaterias) {
            if (materia.getNombre().equals(nombre)) {
                coleccionMaterias.remove(materia);
                System.out.println("Materia eliminada con exito");
                return;
            }
        }
        System.out.println("Materia no encontrada");
    }


    public void encontrarMateria (String nombre){
        Scanner s = new Scanner(System.in);
        Materia materiaEliminar = null;
        for (Materia materia : coleccionMaterias) {
            if (materia.getNombre().equals(nombre)) {
                System.out.println("Encontrado: " + materia.toString());
                System.out.println("Desea eliminar esta materia? S/N");
                String input = s.nextLine();
                if (input.equalsIgnoreCase("S")){
                    materiaEliminar = materia;
                } else return;
            }
        }

        if (materiaEliminar != null) {
            eliminarMateria(materiaEliminar.getNombre());
        } else {
            System.out.println("Materia no encontrada =(");
        }
    }

    @Override
    public String listarContenido() {
        coleccionMaterias.sort(Comparator.comparing(Carrera::getNombre));
        String out = "Carrera['" + getNombre() + "', coleccionMaterias = {";

        for (Materia materia : coleccionMaterias) {
            out = out + materia.getNombre() + ", ";
        }
        out = out + "}]";
        return out;
    }

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + getNombre() + "'" +
                "coleccionMaterias=" + coleccionMaterias +
                '}';
    }
}
