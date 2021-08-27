/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Toma de datos
        try{
        String nombreEmpresa=JOptionPane.showInputDialog("Digite el nombre de la empresa");
        int nit=Integer.parseInt(JOptionPane.showInputDialog("Digite el nit de la empresa"));
        String direccionEmpresa=JOptionPane.showInputDialog("Digite la dirección de la empresa");

        int numeroDeEmpleados=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de empleados de la empresa"));
        int numeroDeClientes=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de clientes de la empresa"));
        
        ArrayList<Cliente> clientes= new ArrayList();
        if(numeroDeClientes>0){
          
            for(int i=1;i<=numeroDeClientes;i++){
            String direccion=JOptionPane.showInputDialog("Ingrese dirección del cliente "+i); 
            String telefono=JOptionPane.showInputDialog("Ingrese telefono del cliente "+i); 
            String nombre=JOptionPane.showInputDialog("Ingrese nombre del cliente "+i); 
            String apellido=JOptionPane.showInputDialog("Ingrese apellido del cliente "+i); 
            String correo=JOptionPane.showInputDialog("Ingrese correo del cliente "+i); 
            String identificacion=JOptionPane.showInputDialog("Ingrese identificación del cliente "+i); 
            
            try{
            Cliente cliente=new Cliente(direccion, telefono, nombre, apellido, correo, identificacion);
            clientes.add(cliente);
            }catch(Exception e){System.out.println("No se pudó guardar los clientes");}
            
            }
        }
       
        
        
        
        ArrayList<Empleado> listaEmpleados= new ArrayList();
        ArrayList<Administrativo> listaAdministradores= new ArrayList();
        
        int contAdmin=0;
        for(int i=0; i<numeroDeEmpleados;i++){
        //salario, String nombre, String apellido, String correo, String identificacion, Cargo cargo
        int j=i+1;
        double salario=Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del empleado "+j));
        String nombreEmpleado=JOptionPane.showInputDialog("Digite el nombre del empleado "+j);
        String apellidoEmpleado=JOptionPane.showInputDialog("Digite el apellido del empleado "+j);
        String correoEmpleado=JOptionPane.showInputDialog("Digite el correo electronico del empleado "+j);
        String identificacionEmpleado=JOptionPane.showInputDialog("Digite la identificación del empleado "+j);
        String cargoEmpleado=JOptionPane.showInputDialog("Digite el cargo del empleado "+j);
        String nivelEmpleado=JOptionPane.showInputDialog("Digite el nivel del empleado "+j);
        Cargo cargo= new Cargo(cargoEmpleado,nivelEmpleado);
        String tipo=JOptionPane.showInputDialog("El empleado "+j+" es administrativo? digite si o no");
        
        if(tipo.toLowerCase().charAt(0)=='n'){
        Empleado empleado= new Empleado(salario,nombreEmpleado,apellidoEmpleado,correoEmpleado,identificacionEmpleado,cargo);
        listaEmpleados.add(empleado);
            }
        
        else if(tipo.toLowerCase().charAt(0)=='s'){
        String categoria=JOptionPane.showInputDialog("Digite la categoria del empleado administrativo");    
        Administrativo administrador= new Administrativo(categoria,salario,nombreEmpleado,apellidoEmpleado,correoEmpleado,identificacionEmpleado,cargo);
        administrador.setCheck(1);
        listaAdministradores.add(administrador);
        contAdmin++;
            }
        
       }
        if(listaAdministradores.size()>0){
            for (int i=0;i<listaAdministradores.size();i++){
             boolean flag=true;
              ArrayList<Empleado> selection= new ArrayList();
             while(flag){   
                    System.out.println("******Empleados disponibles******");
                    ArrayList<Empleado> pool= new ArrayList();
                    int indice=1;    
                    for(Empleado e:listaEmpleados){
                        
                        if(e.getCheck()==0&&e.getAsignado()==0){
                        
                        System.out.println(indice+". "+e.getNombre()+" "+e.getApellido());
                        pool.add(e);
                        indice++;
                                }
                        
                            }
                        System.out.println("*********************************");
                            if (indice>=2){
                            try{
                        int x=Integer.parseInt(JOptionPane.showInputDialog("Seleccione un empleado a asignar al administrador "+i));
                        pool.get(x-1).setAsignado(1);
                        selection.add(pool.get(x-1));
                        for(int k=0;k<listaEmpleados.size();k++){
                            if (listaEmpleados.get(k).getIdentificacion().equals(pool.get(x-1).getIdentificacion())){
                                listaEmpleados.get(k).setAsignado(1);
                            }
                        }
                        String continuar=JOptionPane.showInputDialog("Quiere añadir otro empleado? Digite si o no");
                        if(continuar.toLowerCase().charAt(0)=='s'){
                            continue;
                        }else if(continuar.toLowerCase().charAt(0)=='n'){
                            listaAdministradores.get(i).setEmpleados(selection);
                            flag=false;
                        
                        }
                        }catch (Exception f){
                        JOptionPane.showMessageDialog(null,"Opción no valida");
                        continue;
                        
                        }
                            }else{
                            flag=false;}
                        
             
             
              
                }
            }
           
        }
        
        // Empresa(String nombre, int nit, String direccion, ArrayList<Empleado> empleado)
        Empresa empresa= new Empresa(nombreEmpresa,nit,direccionEmpresa,listaEmpleados,listaAdministradores);
        empresa.setCliente(clientes);
        //Impresión de los datos
        JOptionPane.showMessageDialog(null,"Nombre de la empresa: "+empresa.getNombre()+"\nNit de la empresa: "+empresa.getNit()+"\nDireccion de la empresa: "+empresa.getDireccion()+"\nNumero de empleados: "+empresa.getEmpleado().size());
        for(Empleado e: empresa.getEmpleado()){
            System.out.println("****************");
            System.out.println(e.getNombre()+" "+e.getApellido());
            System.out.println("ID: "+e.getIdentificacion());
            System.out.println("Cargo: "+e.getCargo());
            System.out.println("Salario: "+ e.getSalario());
            System.out.println("****************");
            
        }if(empresa.getAdministrativo().size()>0){
            
            for(Administrativo e: empresa.getAdministrativo()){
            System.out.println("****************");
            System.out.println(e.getNombre()+" "+e.getApellido());
            System.out.println("ID: "+e.getIdentificacion());
            System.out.println("Cargo: "+e.getCargo());
            System.out.println("Salario: "+ e.getSalario());
            System.out.println("Categoria: "+ e.getCategoria());
            
                if(e.getEmpleados().size()>0){
                  System.out.println("Empleados asignados: ");   
                    for(int i=0;i<e.getEmpleados().size();i++){
                   System.out.println( e.getEmpleados().get(i).getNombre()+" "+e.getEmpleados().get(i).getApellido());
                    }
                }
            System.out.println("****************");        
            }
        
        }if(empresa.getCliente().size()>0){
            System.out.println("******CLIENTES********");
              for(Cliente c: empresa.getCliente()){
            
            System.out.println(c.getNombre()+" "+c.getApellido());
            System.out.println("Dirección: "+c.getDireccion());
            System.out.println("Telefono: "+c.getTelefono());
            System.out.println("ID: "+ c.getIdentificacion());
            System.out.println("Correo: "+ c.getCorreo());
            
               
            System.out.println("****************");        
            }
            
        
        }
        
        
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Digite un formato valido");
        
        }
        
        
    
    }
}
