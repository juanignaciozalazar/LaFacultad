package com.LaFacultad;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
    public class Carrera extends Facultad{

        //Atributos
        private String nombre;
        private Set<Materia> ColeccionDeMaterias = new HashSet<Materia>();//Coleccion

        //Constructor

        public Carrera(Set<Materia> coleccionDeMaterias, String nombre) {
            this.ColeccionDeMaterias = coleccionDeMaterias;
            this.nombre = nombre;
        }


        //setters getters

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        //Metodos

        public void agregarMateria (Materia materias) {
            ColeccionDeMaterias.add(materias);
        }

        public void EliminarMateria (String nombreMateria){
            Iterator<Materia> i = ColeccionDeMaterias.iterator();
            while(i.hasNext()) {
                Materia auxMateria = i.next();
                if (auxMateria.getNombre().equals(nombreMateria)) {
                    ColeccionDeMaterias.remove(auxMateria);
                    break;
                }
            }
            ColeccionDeMaterias.remove(nombreMateria);
        }


        public void encontrarMateria (String nombre){
            for (Materia materia : ColeccionDeMaterias) {
                if (materia.getNombre.equals(nombre)) {
                    System.out.println(materia.toString());
                    return;
                }
            }
            System.out.println("Materia no encontrada =(");
        }
    }
