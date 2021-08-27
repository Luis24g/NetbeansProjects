package utils.db;

import java.sql.Connection;


public abstract class Perseverance {
    private DB db;
    
    public Perseverance() {
        db = new DB();
    }
    
    public abstract Object get(Integer id) throws Exception;
    public abstract Integer save() throws Exception;
    public abstract Integer delete() throws Exception;
    public abstract void createUser(String nombre,String titulo, String descripcion, String tipo, String texto);
    
    public Connection createConnection(){
        return this.db.conectar();
    }
    
}
