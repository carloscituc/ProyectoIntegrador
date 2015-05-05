//Clase que gestiona la conexion con la base de datos
//contiene tres objetos
//1)Connection
//2)Statement
//3)ResultSet
package clases;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexionBD {
    private Connection conexion=null;

    //Conectar
    private void Conectar(){
        try{
            //Cargaremos el driver y realizamos la conexion.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection("jdbc:sqlserver://ernestovalent:1433;databaseName=Biblioteca", "userJava","1234");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion con SQL Server:\n"+e.toString());
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Clase de conexion no encontrada:\n"+ex.toString());
        }catch(Exception excep){
            JOptionPane.showMessageDialog(null, "Error en la conexion encontrado:\n"+excep.toString());            
        }
    }
    
    //Metodo consultaa()
    public ResultSet Consultar(String SQL){
        //Establecer la conexion
        this.Conectar();
        ResultSet rs = null;
        Statement sentencia = null;
        try{
            sentencia = conexion.createStatement();
            rs = sentencia.executeQuery(SQL);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en SQL:\n"+e.toString());
        }catch(Exception excep){
            JOptionPane.showMessageDialog(null, "Error en la conexion encontrado:\n"+excep.toString());            
        }
        return rs;
    }
}