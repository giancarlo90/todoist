
/**
 * Write a description of class Todoist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

/**
 * Clase que permite almacenar las tareas pendientes que tenemos por hacer.
 */
public class Todoist
{

    // Almacena nuestras tareas
    private ArrayList<Tarea> tareas; 

    /**
     * Constructor de la clase Todoist. Crea un gestor con las 3 tareas vacías.
     */
    public Todoist()
    {
        tareas = new ArrayList<Tarea>();
    }

    /**
     * Inserta una nueva tarea
     */
    public void addTarea(String nombreTarea)
    {
        tareas.add(nombreTarea);
    }

    /** 
     * Metodo que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea. Si la tarea esta completada se muestra un
     * "[X]" antes de la tarea y si no esta completada se muestra un
     * "[ ]".
     */
    public void mostrarTareasNumeradas()
    {
        int numeroPosicion = 1;
        for (String tarea : tareas){
            if (tarea.substring(0,1).equals("$")) {
                System.out.println(numeroPosicion + ". [X] " + tarea.substring(1, tarea.length()));                
            }
            else {
                System.out.println(numeroPosicion + ". [ ] " + tarea);                 
            }

            numeroPosicion = numeroPosicion + 1;
        }
    }

    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
        String tarea = "$ ";
        tarea = tarea +  tareas.get(indiceTarea);
        tareas.set(indiceTarea,tarea);
    }

}
