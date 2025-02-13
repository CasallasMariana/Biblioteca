/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author maria
 */
public class CalcularRetraso {
 public static long calcularDiasRetraso(String fechaFin) {
    DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Extraer solo la segunda fecha del rango (después del "-")
    String[] fechas = fechaFin.split(" - ");
    if (fechas.length < 2) {
        return 0; // Si el formato no es el esperado, asumimos que no hay retraso
    }

    String fechaDevolucionStr = fechas[1].trim(); // Obtener la fecha final y eliminar espacios
    LocalDate fechaDevolucion = LocalDate.parse(fechaDevolucionStr, FORMATTER);
    LocalDate fechaActual = LocalDate.now();

    // Calcular días de retraso
    if (fechaActual.isAfter(fechaDevolucion)) {
        return ChronoUnit.DAYS.between(fechaDevolucion, fechaActual);
    } else {
        return 0; // No hay retraso
    }
}
    
}
