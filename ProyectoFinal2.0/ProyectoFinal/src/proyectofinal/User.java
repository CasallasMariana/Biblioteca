/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class User {
    String name;
    String id_user;
    
    public void User (String name, String id_user){
    this.name=name;
    this.id_user=id_user;
    

    }
    public void RegisterUser(ArrayList<User> listUsers, String name, String id_user, String text2){
    User newUser = new User();
    listUsers.add(newUser);
    JOptionPane.showMessageDialog(null, "Usuario registrado: "+name, "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
    
    //System.out.println("Usuario registrado con éxito: " + name);
    }
}
