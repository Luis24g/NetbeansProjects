/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picasyfijas;

import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class Juego {
    
    public static int[] GenerarCodigo(){
    
    int[] codigo=new int[4];
    Random rn = new Random();
    
    for(int i=0;i<4;i++){
        
    codigo[i] = rn.nextInt(10);
    }
        for(int i=0;i<codigo.length;i++){
        System.out.print(codigo[i]);}
    return codigo;
    
    
    }
    
    public static int[] PicasOFijas(int[] codigo, String propuesta){
        int newPropuesta[]=new int[4];
        for(int i=0;i<propuesta.length();i++){
            char temp=propuesta.charAt(i);   
            newPropuesta[i]=Integer.parseInt(Character.toString(temp));
        }
        int fijas=0;
        int picas=0;
        
        for(int i=0;i<codigo.length;i++){
         for(int j=0;j<newPropuesta.length;j++){
          if(i==j&&codigo[i]==newPropuesta[j]){
           fijas++;
           continue;
          }else if(codigo[i]==newPropuesta[j]){
           picas++;
          }
         }
        }
      int contador[]=new int[2];
      contador[0]=fijas;
      contador[1]=picas;
      System.out.println(propuesta);
    return contador;
    }
}
