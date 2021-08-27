/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahoycapitan;

import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class AhoyCapitan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       String[] criaturas={"Kraken","Sirenas","Ballena","Hipocampo","Macaraprono","Pulpo","Leviatanes","Hidras"};
       String[] direcciones={"a babor","a estribor","por la proa","por la popa"};
       
       Random rand= new Random();
       String criatura= criaturas[rand.nextInt(8)];
       String direccion=direcciones[rand.nextInt(4)];
       
       System.out.println(criatura+" "+direccion);
       
       if (criatura.equals("Kraken")||criatura.equals("Hipocampo")||criatura.equals("Pulpo")){
           
           System.out.println("Ahoy! capitán, Un "+criatura+" "+direccion);
        }
       else if(criatura.equals("Sirenas")||criatura.equals("Hidras")){
       
           System.out.println("Ahoy! capitán, Unas "+criatura+" "+direccion);
       
       }
        else if(criatura.equals("Ballena")||criatura.equals("Macaraprono")){
       
           System.out.println("Ahoy! capitán, Una "+criatura+" "+direccion);
       
       }
       
        else{
       
           System.out.println("Ahoy! capitán, Unos "+criatura+" "+direccion);
       
       }
       
       






    }
    
}
