/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class Multa{ 
    private static final double multa = 10.000; 

    public static int calcularDiasRetraso(Date fechaDevolucion, Date fechaReal) {
        if (fechaDevolucion == null || fechaReal == null) {
            JOptionPane.showMessageDialog(null, "Ingrese ambas fechas", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
        long diff = fechaReal.getTime() - fechaDevolucion.getTime();
        int diasRetraso = (int) (diff / (1000 * 60 * 60 * 24));
        return Math.max(diasRetraso, 0); 
    }
    public static double calcularMulta(Date fechaDevolucion, Date fechaReal) {
        int diasRetraso = calcularDiasRetraso(fechaDevolucion, fechaReal);
        return diasRetraso * multa;
    }
}

