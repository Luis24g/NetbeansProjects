/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot;

/**
 *
 * @author LENOVO
 */
public class Contar {
   

   public int[] Contador(String newLista[]){
      
       String listaFinal[];
       int contadorOn=0;
       int contadorOff=0;
       int contador[]=new int[2];
       for(int i=0;i<newLista.length;i++){
        String[] temp= newLista[i].split(",");
        
           for(int j=0;j<temp.length;j++){
           if(temp[j].toLowerCase().equals("on")){
           contadorOn++;    
                }
           else if(temp[j].toLowerCase().equals("off")){
           contadorOff++;
                }
           }
       }
         contador[0]=contadorOn;
         contador[1]=contadorOff;
   return contador;
   }
    
    
}
