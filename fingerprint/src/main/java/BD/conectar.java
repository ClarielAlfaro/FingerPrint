package BD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clari
 */
public class conectar {
    
    Connection con = null;
    
    public Connection conexion (){
    try {
        String url = "jdbc:mysql//localhost;3306/unab";
        String user = "root";
        String pass = "Gorge0us";
        
        con = DriverManager.getConnection(url,user,pass);
        
        
    }catch(Exception e){
        
        System.out.println("error de conexion");
        JOptionPane.showMessageDialog(null, "Error de Conexion " + e);
    }
    
    return con;
    }
    
    
    public Connection cerrarConexion(){
        
        try {
            con.close();
            System.out.println("Cerrando conexion a");
            
        }catch(SQLException ex){
            System.out.println(ex);
            
        }
        
        con = null;
        return con;
    }
}
