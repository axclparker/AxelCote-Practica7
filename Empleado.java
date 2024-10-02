package mx.unam.fi.poo.g1.p7;

/**
 * Clase padre Empleado 
 * @author Axel Cote 
 * @version Septiembre-2024
 **/

public class Empleado {
    private String nombre;           
    private String direccion;        
    private String nombreDeTrabajo;  
    private double salario;          

    /**
     * Constructor de la clase Empleado
     * Para construir objetos Empleado.
     * @param nombre -> Atributo para el nombre del Empleado
     * @param direccion -> Atributo para la direccion del Empleado
     * @param salario -> Atributo para el salario del Empleado
     * @param nombreDeTrabajo -> Atributo para el nombreDeTrabajo del Empleado
     **/

    public Empleado(String nombre, String direccion, double salario, String nombreDeTrabajo) {
        setNombre(nombre);
        setDireccion(direccion);
        setSalario(salario);
        setNombreDeTrabajo(nombreDeTrabajo);
    }

    /**
     * Metodo getNombre
     * @return nombre -> Regresa el atributo nombre
     **/

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setNombre
     * @param nombre -> Para cambiar el dato de nombre del Empleado
     **/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo getDireccion
     * @return direccion -> Regresa el atributo direccion
     **/

    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo setDireccion
     * @param direccion -> Para cambiar el dato de direccion del Empleado
     **/

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo getSalario
     * @return salario -> Regresa el atributo salario
     **/

    public double getSalario() {
        return salario;
    }

    /**
     * Metodo setSalario
     * @param salario -> Para cambiar el dato de salario del Empleado
     **/

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Metodo getNombreDeTrabajo
     * @return nombreDeTrabajo -> Regresa el atributo nombreDeTrabajo
     **/

    public String getNombreDeTrabajo() {
        return nombreDeTrabajo;
    }

    /**
     * Metodo setNombreDeTrabajo
     * @param nombreDeTrabajo -> Para cambiar el dato de nombreDeTrabajo del Empleado
     **/

    public void setNombreDeTrabajo(String nombreDeTrabajo) {
        this.nombreDeTrabajo = nombreDeTrabajo;
    }

    /**
     * Metodo getBono
     * @return 0.0 
     **/

    public double getBono() {
        return 0.0;
    }

    /**
     * Metodo reporteDesempeño
     * @param reporte 
     * @return Devuelve una cadena 
     **/

    public String reporteDesempeño(String reporte) {
        return "";
    }

    /**
     * Metodo manejoDeProyectos
     * @param proyectos 
     * @return Devuelve una cadena 
     **/

    public String manejoDeProyectos(String proyectos) {
        return "";
    }
}
