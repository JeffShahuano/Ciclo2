/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Alumno;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l03m10
 */
public interface IAlumno {
    
   public void agregar(Alumno alumno);
   
   public DefaultTableModel mostrar();
    
    
    
    
}
