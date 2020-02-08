/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author l03m10
 */
public class Alumno {
    
    private String nombre;
    private String curso;
    private double promedio;
    private String estado;

    public Alumno() {
    }

    public Alumno(String nombre, String curso, double promedio, String estado) {
        this.nombre = nombre;
        this.curso = curso;
        this.promedio = promedio;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    

    public String hallarEstado(){
        
        String estado = "";
        
        if(promedio >= 12.5){
            estado = "Aprobado";
        }else{
            estado = "Desaprobado";
        }
       return estado; 
    }
   
    
}
