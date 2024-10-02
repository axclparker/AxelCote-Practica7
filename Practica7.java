package mx.unam.fi.poo.g1.p7;

import java.util.Scanner;
import mx.unam.fi.poo.g1.p7.*;

/**
 * Clase principal Practica 7 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Practica7 {
  /**
   * Metodo main
   * Se ejecuta todo el funcionamiento de la aplicacion
   * @param args -> Arreglo por defecto del metodo main
  **/
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Manager manager = new Manager("Rene", "Calle 123", 60000.0, "Gerente de POO");
    System.out.println("El bono del manager " + manager.getNombre() + " es: " + manager.getBono());
    System.out.print("El manager " + manager.getNombre() + " realizo el trabajo de que manera? ");
    String reporte1 = entrada.nextLine();
    System.out.println(manager.reporteDesempeño(reporte1));
    System.out.print("El manager " + manager.getNombre() + " en que proyectos se encuentra trabajando? ");
    String proyectos1 = entrada.nextLine();
    System.out.println(manager.manejoDeProyectos(proyectos1));

    Desarrollador desarrollador = new Desarrollador("Axel", "Calle siempre viva", 40000.0, "Desarrollador de POO");
    System.out.println("El bono del desarrollador " + desarrollador.getNombre() + " es: " + desarrollador.getBono());
    System.out.print("El desarrollador " + desarrollador.getNombre() + " realizo el trabajo de que manera? ");
    String reporte2 = entrada.nextLine();
    System.out.println(desarrollador.reporteDesempeño(reporte2));
    System.out.print("El desarrollador " + desarrollador.getNombre() + " en que proyectos se encuentra trabajando? ");
    String proyectos2 = entrada.nextLine();
    System.out.println(desarrollador.manejoDeProyectos(proyectos2));

    Programador programadora = new Programador("Alejandra", "Calle muy muy lejana", 45000.0, "Desarrollador de POO");
    System.out.println("El bono de la programadora " + programadora.getNombre() + " es: " + programadora.getBono());
    System.out.print("La programadora " + programadora.getNombre() + " realizo el trabajo de que manera? ");
    String reporte3 = entrada.nextLine();
    System.out.println(programadora.reporteDesempeño(reporte3));
    System.out.print("La programadora " + programadora.getNombre() + " en que proyectos se encuentra trabajando? ");
    String proyectos3 = entrada.nextLine();
    System.out.println(programadora.manejoDeProyectos(proyectos3));
  }
}
