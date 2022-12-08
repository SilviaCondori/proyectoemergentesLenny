/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

/**
 *
 * @author Administrador
 */
public class listaclientes {

   private String codigo;
   private String nombres;
   private String apellidos;
   private String dni;
   private String ruc;

    public listaclientes(String codigo, String nombres, String apellidos, String dni, String ruc) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.ruc = ruc;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
   
           
   
    
    
}
