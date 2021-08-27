package utils.db;

import java.sql.Connection;


public abstract class Models {
    private DB db = new DB();

    public Models() {
    }
    
    public abstract Object find(Integer id);
    public abstract Integer save();
    public abstract void createUser(String nombre,String titulo, String descripcion, String tipo, String texto);
    public abstract void delete();
    
    
    public Connection conectar(){
        return this.db.conectar();
    }
    
    
}
