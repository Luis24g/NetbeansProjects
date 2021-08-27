/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saltandoel5;

/**
 *
 * @author LENOVO
 */
public  class CSI {
    
    public static String CodificarMensaje(String numero){
    final int[] codificar={5,9,8,7,6,0,4,3,2,1};
    String [] mensajeOriginal= new String[numero.length()];
    
     for(int i=0; i<numero.length();i++){
     mensajeOriginal[i]=Character.toString(numero.charAt(i));
     }
     
     int[] mensajeCodificado= new int[mensajeOriginal.length];
     StringBuilder sb = new StringBuilder();
     
    for(int i=0;i<mensajeOriginal.length;i++){
        
     for(int j=0;j<codificar.length;j++){
         
             int valor=Integer.parseInt(mensajeOriginal[i]);
              if(valor==j){
                  
              mensajeCodificado[i]=codificar[j];
              
             }
          }
        sb.append(mensajeCodificado[i]);
     }
     

    String mensajeFinal = sb.toString();
   
    
    return mensajeFinal;
    }
            
    public static String DecodificarMensaje(String numero){
    
    final int[] codificar={5,9,8,7,6,0,4,3,2,1};
    String [] mensajeOriginal= new String[numero.length()];
    
     for(int i=0; i<numero.length();i++){
     mensajeOriginal[i]=Character.toString(numero.charAt(i));
     }
     
     int[] mensajeCodificado= new int[mensajeOriginal.length];
     StringBuilder sb = new StringBuilder();
     
    for(int i=0;i<mensajeOriginal.length;i++){
        
     for(int j=0;j<codificar.length;j++){
         
             int valor=Integer.parseInt(mensajeOriginal[i]);
              if(valor==j){
                  
              mensajeCodificado[i]=codificar[j];
              
             }
          }
        sb.append(mensajeCodificado[i]);
     }
     

    String mensajeFinal = sb.toString();
   
    
    return mensajeFinal;
    
        
    
    }
            
            }
