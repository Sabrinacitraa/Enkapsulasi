/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetterSetter;

/**
 *
 * @author ACER
 */
public class Running {
    public static void main(String[] args) {
        User a = new User();
        
        //menggunakan method setter
        a.setUsername("Sabrina");
        a.setPassword("X RPL 4");
        
        //menggunakan method getter
        System.out.println("Username: " + a.getUsername());
        System.out.println("Password: " + a.getPassword());
    }
    
}
