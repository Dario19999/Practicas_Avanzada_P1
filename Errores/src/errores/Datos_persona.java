/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errores;

/**
 *
 * @author dario
 */
public class Datos_persona {
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private int edad;
    
    public Datos_persona(){}

    public Datos_persona(String nombre, String apellido_p, String apellido_m, int edad) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Mi_error_exception {
      
        if(edad > 150){
            throw new Mi_error_exception("La edad es mayor al maximo permitido por las leyes naturales de la vida (>150)");
        }else if(edad < 0){
            throw new Mi_error_exception("La edad es menor al minimo permitido por las leyes naturales de la vida (< 0)");
        }else{
            this.edad = edad;
        }
        
        
    }
    
    
}
