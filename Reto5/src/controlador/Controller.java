/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import modelo.Historia;
import modelo.Usuario;

import utils.db.Models;

/**
 *
 * @author LENOVO
 */
public class Controller extends Models {
    
     Usuario usuario= new Usuario();
     Historia historia= new Historia();
     
     
  
    

    @Override
    public Object find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createUser(String nombre,String titulo, String descripcion, String tipo, String texto) {
        
       usuario.setNombre(nombre);
       historia.setAutor(nombre);
       historia.setTitulo(titulo);
       historia.setDescripcion(descripcion);
       historia.setTipo(tipo);
       historia.setTexto(texto);
       
       try(Connection con =super.conectar()){
       
       String query= "INSERT INTO usuario (autor) "
                    + "  VALUES (?);";
      // String query2="INSERT INTO historia"+"(Titulo,Descripcion,Tipo,Autor,Texto)VALUES (?,?,?,?,?);";
       
       //Connection con= db.createConnection();
       PreparedStatement statement = con.prepareStatement(query);
            
       statement.setString(1, nombre);
       
       
       System.out.println(usuario.getNombre());
       
     /*pst=con.prepareStatement(query2,Statement.RETURN_GENERATED_KEYS);
       pst.setString(1,historia.getTitulo());
       pst.setString(2,historia.getDescripcion());
       pst.setString(3,historia.getTipo());
       pst.setString(4,historia.getAutor());
       pst.setString(5,historia.getTexto());
       */
    
       
       }catch(Exception e){
       System.out.println("Error al guardar datos");}
        
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
    
}
