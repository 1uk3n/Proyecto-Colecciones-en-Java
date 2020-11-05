package proyecto.colecciones.en.java;

import java.io.IOException; 
import java.util.HashMap;
import java.util.Scanner;

public class ProyectoColeccionesEnJava { 
    
    public static void main(String[] args) throws IOException {
        
        //Hashtable key = #cuenta, value = alumno || clave, asignatura
        HashMap<Long,Alumno> alumnos = new HashMap<>();
        HashMap<Long,Profesor> profesores = new HashMap<>();
        
        HashMap<Integer,Asignatura> asignaturas = new HashMap<>(); 
        HashMap<String, Grupo> grupos = new HashMap<>();
        
        int selector = 0;
        do{

          
            switch(selector){
               
                case 0->{
                
                    System.out.println("###  Utilerias Principal  ###");

                    System.out.println("Actualmente cuento con: ");
                    System.out.println("\t " + alumnos.size() + " alumnos");
                    System.out.println("\t " + profesores.size() + " profesores");
                    System.out.println("\t " + asignaturas.size() + " asignaturas");
                    System.out.println("\t " + grupos.size() + " grupos");
                    
                    System.out.println("\nIndicame por favor, sobre que entidad deseas trabajar?");
                    
                    String[] opciones = {"Alumnos", "Profesores", "Asignaturas", "Grupos", "Sácame de aqui"};
                    selector = Utilerias.menu(opciones);
                    
                }
                
                case 1->{
                    selector = Utilerias.menuAlumno(alumnos, grupos);
                    break;
                }
                
                case 2 -> {
                     selector = Utilerias.menuProfesores(profesores, grupos);
                    break;
                }
                
                case 3 -> {
                     selector = Utilerias.menuAsignaturas(asignaturas, grupos);
                    break;
                }
                
                case 4 -> {
                     selector = Utilerias.menuGrupos(grupos, asignaturas, profesores, alumnos);
                    break;
                }
                
                default ->{ System.out.println("Opción no válida"); break;}

                }
            
        }while(selector != 5);
    }
    
}