/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public interface Fecha_Prestamo {
    static Date convertirFecha(String fechaT) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false); 
        
        try {
            return formato.parse(fechaT);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Use dd/MM/yyyy", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
