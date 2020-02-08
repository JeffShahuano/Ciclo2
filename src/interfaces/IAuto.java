/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Auto;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l07m01
 */
public interface IAuto {
    
    public void agregar (Auto auto);
    public DefaultTableModel mostrar ();
    public DefaultTableModel mostrarNissanSentra();
    public int cantidadMazda3();
      
}

