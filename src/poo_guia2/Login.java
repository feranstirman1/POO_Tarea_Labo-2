/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_guia2;
import java.util.Scanner;

/**
 *
 * @author LVS
 */
public class Login {
    private String password="default";
    
    public Login(){
        
    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Verifica si la contraseña escrita es correcta
     * @return Una expresion booleana
     */
    public boolean Entrar(){
        
        String contra;
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese la contraseña para acceder al programa");
        contra= input.nextLine();
        if(contra.compareTo(password)==0){
            return true;
        }
        else{
            return false;
        }
    }
}
