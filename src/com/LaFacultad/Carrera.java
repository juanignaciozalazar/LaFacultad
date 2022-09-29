
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
    public class Carrera extends Facultad{

        //Atributos
        String nombre;
        Set<Materia> ColeccionDeMaterias = new HashSet<Materia>();//Coleccion

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

        public void AgregarMateria (Materia materias) {
            Scanner sc = new Scanner(System.in);
            Materia aux;
            System.out.println("Nombre de materia a agregar: ");
            string nombreMateria = sc.next();

            aux = new Materia();
            aux.setNombre(nombreMateria);

            ColeccionDeMaterias.add(aux);
        }

        public void EliminarMateria (String nombreMateria ){

            ColeccionDeMaterias.remove(nombreMateria);
        }


        public void encontrarMateria (String nombre){
            for (Materia materia : ColeccionDeMaterias) {
                System.out.println(materia.toString());
            }
        }
    }
}
