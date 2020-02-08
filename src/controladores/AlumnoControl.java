/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import clases.Alumno;
import interfaces.IAlumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l03m10
 */
public class AlumnoControl implements IAlumno {
    
    ArrayList <Alumno>lstAlumno = new ArrayList();
    DefaultTableModel mdlAlumno = new  DefaultTableModel();
  
  public AlumnoControl(){
     mdlAlumno.addColumn("Nombre"); 
     mdlAlumno.addColumn("Curso");
     mdlAlumno.addColumn("Promedio");
     mdlAlumno.addColumn("Estado");
  }

    @Override
    public void agregar(Alumno alumno) {
      lstAlumno.add(alumno);
        JOptionPane.showMessageDialog(null, "Agregado");
    }

    @Override
    public DefaultTableModel mostrar() {
        
        mdlAlumno.setNumRows(0);
        
        for (int i = 0; i<=lstAlumno.size()- 1; i++){
            Alumno alu = lstAlumno.get(i);
            
            Object [] fila = {alu.getNombre(),alu.getCurso(),alu.getPromedio(),alu.hallarEstado()};
            
            mdlAlumno.addRow(fila);
        }
       return mdlAlumno;
        
    }
  
 
    
}
