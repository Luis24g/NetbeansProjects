/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextArea;


/**
 *
 * @author LENOVO
 */
public class ValidarTextArea extends InputVerifier {
    
    
    @Override
    public boolean verify(JComponent jc) {
        boolean estado= true;
        if(jc instanceof JTextArea){
         String texto=((JTextArea)jc).getText();
         
        
         if(texto.matches("^\\s*$")){
         estado= false;
         System.out.println("Campo no puede estar vacio");
       
         return estado;}
         
         else{
        
         estado=true;
         
         return estado;
            }
        }
        return estado;
    }
}
