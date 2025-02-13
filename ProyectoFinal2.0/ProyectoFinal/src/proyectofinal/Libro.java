/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author admin
 */
public class Libro {
    private String genero;
    private String titulo;
    private String autor;
    private int id_Libro;
    private int Stock;
            
      public Libro(String genero, String titulo, String autor, int id_Libro, int Stock){
          this.genero = genero;
          this.titulo = titulo;
          this.autor = autor;
          this.id_Libro = id_Libro;
          this.Stock = Stock;
      }      

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId_Libro() {
        return id_Libro;
    }

    public void setId_Libro(int id_Libro) {
        this.id_Libro = id_Libro;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
       
    public boolean prestar() {
        if (Stock > 0) {
            Stock--;
        return true;
    }
        return false;
            
}
}
