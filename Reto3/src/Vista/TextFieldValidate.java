/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class TextFieldValidate extends InputVerifier {

    @Override
    public boolean verify(JComponent jc) {
        boolean estado= true;
        if(jc instanceof JTextField){
        
        String texto=((JTextField)jc).getText();
        
        try{
        Long.parseLong(texto);
        estado=true;
        return estado;
        }catch (Exception e){
            System.out.println("Digite un numero");
            estado= false;
            return estado;
            }
        }
        return estado;
    }
    
}
