package mx.unam.fi.poo.g1.p7;

import mx.unam.fi.poo.g1.p7.Empleado;

/**
 * Clase Manager extends Empleado
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Manager extends Empleado {
  /**
   * Metodo Constructor
   * Para construir objetos Manager
   * @param nombre -> Atributo para el nombre del Manager
   * @param direccion -> Atributo para la direccion del Manager
   * @param salario -> Atributo para el salario del Manager
   * @param nombreDeTrabajo -> Atributo para el nombreDeTrabajo del Manager
  **/

  public Manager(String nombre, String direccion, double salario, String nombreDeTrabajo) {
    super(nombre, direccion, salario, nombreDeTrabajo);
  }

  /**
   * Sobrescribe el metodo getBono de la clase Empleado
   * @return bono -> bono del empleado multiplicado por 0.25
  **/

  @Override
  public double getBono() {
    return getSalario() * 0.25; 
  }

  /**
   * Sobrescribe el metodo reporteDesempeño de la clase Empleado
   * @return cadena -> cadena que marca su desempeño
  **/

  @Override
  public String reporteDesempeño(String reporte) {
    return getNombre() + " ha realizado de manera " + reporte + " su trabajo";
  }

  /**
   * Sobrescribe el metodo manejoDeProyectos de la clase Empleado
   * @return cadena -> cadena que muestra los proyectos en los que se encuentra trabajando
  **/

  @Override
  public String manejoDeProyectos(String proyectos) {
    return getNombre() + " se encuentra trabajando en " + proyectos;
  }
}
