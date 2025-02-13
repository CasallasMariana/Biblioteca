/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Estudiante
 */
public class Inventario {
    private static final List<Libro> listaLibros = new ArrayList<>();
    
    public static void llenarTabla() {
        
        
        listaLibros.add(new Libro("Aventura", "La isla del tesoro", "Robert Louis Stevenson", 1,1));
        listaLibros.add(new Libro("Biografía", "Steve Jobs", "Walter Isaacson", 2,1));
        listaLibros.add(new Libro("Ciencia Ficción", "1984", "George Orwell", 3,1));
        listaLibros.add(new Libro("Ciencia Ficción", "Dune", "Frank Herbert", 4,1));
        listaLibros.add(new Libro("Ciencia Ficción", "Fahrenheit 451", "Ray Bradbury", 5,1));
        listaLibros.add(new Libro("Fantasía", "El hobbit", "J.R.R. Tolkien", 6,1));
        listaLibros.add(new Libro("Fantasía", "Harry Potter", "J.K. Rowling", 7,1));
        listaLibros.add(new Libro("Fantasía", "La materia oscura", "Philip Pullman", 8,1));
        listaLibros.add(new Libro("Fantasía", "Las crónicas de Narnia", "C.S. Lewis", 9,1));
        listaLibros.add(new Libro("Ficción", "Cien años de soledad", "Gabriel García Márquez", 10,1));
        listaLibros.add(new Libro("Ficción", "El señor de los anillos", "J.R.R. Tolkien", 11,1));
        listaLibros.add(new Libro("Histórico", "El médico", "Noah Gordon", 12,1));
        listaLibros.add(new Libro("Histórico", "Los pilares de la Tierra", "Ken Follett", 13,1));
        listaLibros.add(new Libro("Misterio", "Cumbres Borrascosas", "Emily Brontë", 14,1));
        listaLibros.add(new Libro("Misterio", "Sherlock Holmes", "Arthur Conan Doyle", 15,1));
        listaLibros.add(new Libro("Policial", "Asesinato en el Orient Express", "Agatha Christie", 16,1));
        listaLibros.add(new Libro("Romántico", "Bajo la misma estrella", "John Green", 17,1));
        listaLibros.add(new Libro("Romántico", "Orgullo y prejuicio", "Jane Austen", 18,1));
        listaLibros.add(new Libro("Suspenso", "El código Da Vinci", "Dan Brown", 19,1));
        listaLibros.add(new Libro("Terror", "Drácula", "Bram Stoker", 20,1));
        listaLibros.add(new Libro("Terror", "It", "Stephen King", 21,1));
    }
    
    public static DefaultTableModel getModeloTabla() {
        String[] columnas = {"Género", "Título", "Autor", "ID Libro", "Stock Disponible"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        
        for (Libro libro : listaLibros) {
            modelo.addRow(new Object[]{libro.getGenero(), libro.getTitulo(), libro.getAutor(), libro.getId_Libro(), libro.getStock()});
        }
        return modelo;
    }
    public static boolean prestarLibro(int idLibro) {
        for (Libro libro : listaLibros) {

            if (libro.getId_Libro() == idLibro) {
                return libro.prestar();
            }
        }
    
    return false; 
}

public boolean disponibilidad(){
    return false;   
}

    void AgregarLibro(int idLibro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
