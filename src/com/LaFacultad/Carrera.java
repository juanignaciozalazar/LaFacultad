package com.LaFacultad;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
    public class Carrera extends Facultad{

        //Atributos
        private String nombre;
        private Set<Materia> ColeccionDeMaterias;

        //Constructor

        public Carrera(Set<Materia> coleccionDeMaterias, String nombre) {
            this.ColeccionDeMaterias = coleccionDeMaterias;
            this.nombre = nombre;
        }

        public Carrera(String nombre) {
            this.nombre = nombre;
            this.ColeccionDeMaterias = new HashSet<>();
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

        public void EliminarMateria (String nombre){
            Iterator<Materia> i = ColeccionDeMaterias.iterator();
            while(i.hasNext()) {
                Materia auxMateria = i.next();
                if (auxMateria.getNombre().equals(nombre)) {
                    ColeccionDeMaterias.remove(auxMateria);
                    break;
                }
            }
            ColeccionDeMaterias.remove(nombre);
        }


        public void encontrarMateria (String nombre){
            for (Materia materia : ColeccionDeMaterias) {
                if (materia.getNombre().equals(nombre)) {
                    System.out.println(materia.toString());
                    return;
                }
            }
            System.out.println("Materia no encontrada =(");
        }
    }
