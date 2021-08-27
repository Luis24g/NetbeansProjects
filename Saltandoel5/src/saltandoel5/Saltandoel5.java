/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saltandoel5;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Saltandoel5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        String numero=JOptionPane.showInputDialog("Digite el numero a codificar");
        String mensajeCodificado=CSI.CodificarMensaje(numero);
        JOptionPane.showMessageDialog(null,"El mensaje codificado es: "+mensajeCodificado);
        
        String mensajeDecodificado=CSI.DecodificarMensaje(mensajeCodificado);
        JOptionPane.showMessageDialog(null,"El mensaje decodificado es: "+mensajeDecodificado);
        }catch(Exception e){
            
           JOptionPane.showMessageDialog(null,"Por favor ingrese un número"); 
        
        }
        
    }
    
}
