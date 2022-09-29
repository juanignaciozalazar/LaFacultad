package com.LaFacultad;

public class Materia {
    private String nombre;
    private String titular;
    private String coleccionEstudiantes;

    public Materia(String nombre, String titular, String coleccionEstudiantes) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    @java.lang.Override
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

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(String coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public void agregarEstudiante(String coleccionEstudiantes){
        ArrayList<Estudiante> List = new ArrayList<Estudiante>();
        do {
            List = reader.next();
        if (List.equals("ADD") {
            list.add("Estudiante");
        }

        } while (!List.equals("End"));
    }
    public void eliminarEstudiantes(){
        ArrayList<Estudiante> List = new ArrayList<Estudiante>();
        do {
            List = reader.next();
            if (!List.isEmpty()){
                List.remove(List.size()-1);
            }else {
                System.out.println("La lista de Estudiantes esta vacia. No se puede eliminar mas estudiantes");
                System.out.println("Hay " + List.size() + " Estudiantes en la lista");
            }
        }
    }
    public void modificarTitular(){
        ArrayList<Profesor> List = new ArrayList<Profesor>();
        do {
            List = reader.next();

            if (List.equals("ADD")) {
                List.add("Profesor");
                System.out.println("Agregue un nuevo profesor a la materia: " );
            }
            else if {
                (List.equals("DEL"))
            }
                if (!List.isEmpty()) {
                    List.remove(List.size() - 1);
                }
                else

            System.out.println("Elimine el profesor de la materia");
        } while(!sTexto.equals("END"));

    }
}
