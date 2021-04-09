/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.consultasBaseDeDatos;
import Entidades.CarroCompras;
import Entidades.Plato;
import Entidades.Restaurante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author samyf
 */
public class BaseDeDatos implements consultasBaseDeDatos {
    String host= "jdbc:postgresql://by7snyowz8hpiul0czun-postgresql.services.clever-cloud.com:5432/by7snyowz8hpiul0czun";
    String usuario ="ukq1feptpfh0wdl7wm7b";
    String contrasena="k1A1ESjjj11G0Ti9aCma";

    public BaseDeDatos() {
    }
    
    //Implementación de la interface consultasBaseDeDatos

    @Override
    public boolean ValidarInicioSesion(String pUsuario, String pContrasena, String pTipo) 
    {
        boolean resultado=false;
        try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta =
                      "SELECT usuario,contrasena,tipo FROM lenttiusuario ";
                  ResultSet result = st.executeQuery(consulta);
                  while(result.next()) 
                  {
                       
                      if(pUsuario.equals(result.getString("usuario")) && pContrasena.equals(result.getString("contrasena")) && pTipo.equals(result.getString("tipo")))
                      {
                          resultado=true;
                      }
                      
                  }
                  result.close();
                  st.close();
                  conexion.close();
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean CrearUsuario(String pUsuario, String pContrasena, String pTipo) 
    {
       boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "insert into lenttiUsuario values ( '"+ pUsuario + "' , '"+pContrasena + "', '" + pTipo + "');";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }

    @Override
    public boolean ModificarUsuario(String anteriorUsuario, String nuevoUsuario) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE lenttiusuario  SET usuario= '"+ nuevoUsuario + "' WHERE usuario='"+anteriorUsuario+"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }

    @Override
    public boolean ModificarContrasena(String pUsuario, String nuevaContrasena) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE lenttiusuario  SET contrasena= '"+ nuevaContrasena + "' WHERE usuario='"+pUsuario+"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }
    
    @Override
    public boolean CrearPlato( String restaurante, String nombrePlato, String descripcion, float precio, String imagen) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "INSERT INTO plato VALUES ('"+ restaurante +"','"+ nombrePlato + "',"+ precio +", '" + descripcion +"', '"+ imagen +"');";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }
    
    
    
   @Override
    public boolean CrearDomiciliario( String restaurante, String documento, String nombre, String telefono, String placaVehiculo , Float puntuacion, Float domiciliosEntregados) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "INSERT INTO domiciliario VALUES ('"+ restaurante +"','"+ documento + "','"+ nombre +"', '" + telefono +"', '"+ placaVehiculo +"', "+ puntuacion + ","+ domiciliosEntregados +");";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }
    @Override
    public boolean EliminarPlato( String nombrePlato) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "DELETE FROM plato WHERE nombrePlato = '"+ nombrePlato +"'; ";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }
    @Override
    public boolean EliminarDomiciliario( String documento) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "DELETE FROM domiciliario WHERE documento = '"+ documento +"'; ";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }
    @Override
    public boolean ModificarNombrePlato(String nombrePlato, String nuevoNombre) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE plato SET nombrePlato = '"+ nuevoNombre + "' WHERE nombrePlato = '"+ nombrePlato +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }
    @Override
    public boolean ModificarPrecioPlato(String nombrePlato, String nuevoPrecio) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  Float precio = Float.parseFloat(nuevoPrecio);
                  String consulta = "UPDATE plato SET precio = "+ nuevoPrecio + " WHERE nombrePlato = '"+ nombrePlato +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }
    @Override
    public boolean ModificarDescripcionPlato(String nombrePlato, String nuevaDescripcion) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE plato SET descripcion = '"+ nuevaDescripcion + "' WHERE nombrePlato = '"+ nombrePlato +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }
    @Override
    public boolean ModificarImagenPlato(String nombrePlato, String nuevaImagen) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE plato SET imagen = '"+ nuevaImagen + "' WHERE nombrePlato = '"+ nombrePlato +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }

    @Override
    public boolean EliminarCuenta(String pUsuario, String pTipo) {
       boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "DELETE FROM lenttiusuario WHERE usuario='"+ pUsuario + "'AND tipo='" + pTipo +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }

    @Override
    public boolean CrearRestaurante (String nombreRestaurante, String password, String NIT, String direccion, String descripcion, float costoDeEnvio, String imagen) 
    {
       boolean resultado = false;
       boolean cuenta = CrearUsuario(nombreRestaurante, password, "R");
      
       try 
       {
           Class.forName("org.postgresql.Driver");
           Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
           java.sql.Statement st = conexion.createStatement();
           String consulta = "INSERT INTO restaurante VALUES ('"+ nombreRestaurante +"', '"+ NIT +"', '"+ direccion +"', '"+ descripcion +"', '"+ costoDeEnvio +"', '"+ imagen +"');";
           st.execute(consulta);
           st.close();
           conexion.close();
           resultado = true;
       }
       catch (Exception exc)
       {
           System.out.println("Errorx:"+exc.getMessage());
           resultado = false;
       }
       
       return resultado;
    }
    
    @Override
    public boolean EliminarRestaurante (String nombreRestaurante) 
    {
        boolean resultado = false;
        
        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
            java.sql.Statement st = conexion.createStatement();
            String consulta = "DELETE FROM restaurante WHERE nombreRestaurante = '"+ nombreRestaurante +"';";
            //Tal vez toque eliminar cada plato del restaurante a eliminar.
            st.execute(consulta);
            st.close();
            conexion.close();
            resultado = true;
            boolean eliminado = EliminarCuenta(nombreRestaurante, "R");
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado = false;
        }
        
        return resultado;
    } 
    
    @Override
    public DefaultListModel BuscarRestaurante (String pTipo, String pUsurioActual) 
    {
        DefaultListModel lista = new DefaultListModel();
        
        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
            java.sql.Statement st = conexion.createStatement();
            String consulta = "SELECT usuario FROM lenttiusuario WHERE tipo = '" + pTipo + "'";
            ResultSet result = st.executeQuery(consulta);
                  
            while(result.next()) 
            {
                lista.addElement(result.getString("usuario")); 
            }
            
            result.close();
            st.close();
            conexion.close();
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
        }
        
        return lista;
    }
    
    @Override
    public boolean ModificarNombreRestaurante (String nombreRestaurante, String nuevoNombre) 
    {
        boolean resultado = false;
        boolean modificado = ModificarUsuario(nombreRestaurante, nuevoNombre);
        
        try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE restaurante SET nombreRestaurante = '"+ nuevoNombre + "' WHERE nombreRestaurante = '"+ nombreRestaurante +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado = true;
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado = false;
        }
        
        return resultado;
    }
    
    @Override
    public boolean ModificarDireccionRestaurante (String nombreRestaurante, String nuevaDireccion) 
    {
        boolean resultado = false;
        
        try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE restaurante SET direccion = '"+ nuevaDireccion + "' WHERE nombreRestaurante = '"+ nombreRestaurante +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado = true;
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado = false;
        }
        
        return resultado;
    }
    
    @Override
    public boolean ModificarDescripcionRestaurante (String nombreRestaurante, String nuevaDescripcion) 
    {
        boolean resultado = false;
        
        try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE restaurante SET descripcion = '"+ nuevaDescripcion + "' WHERE nombreRestaurante = '"+ nombreRestaurante +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado = true;
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado = false;
        }
        
        return resultado;
    }
    
    @Override
    public boolean ModificarCostoDeEnvioRestaurante (String nombreRestaurante, String nuevoCostoDeEnvio) 
    {
        boolean resultado = false;
        
        try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  Float costoDeEnvio = Float.parseFloat(nuevoCostoDeEnvio);
                  String consulta = "UPDATE restaurante SET costoDeEnvio = "+ nuevoCostoDeEnvio + " WHERE nombreRestaurante = '"+ nombreRestaurante +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado = true;
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado = false;
        }
        
        return resultado;
    }
    
    @Override
    public boolean ModificarImagenRestaurante (String nombreRestaurante, String nuevaImagen) 
    {
        boolean resultado = false;
        
        try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE restaurante SET imagen = '"+ nuevaImagen + "' WHERE nombreRestaurante = '"+ nombreRestaurante +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado = true;
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado = false;
        }
        
        return resultado;
    }
    @Override
    public boolean ModificarDocumentoDomiciliario(String documento, String nuevoDocumento){
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE domiciliario SET documento = '"+ nuevoDocumento + "' WHERE documento = '"+ documento +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }
    @Override
    public boolean ModificarNombreDomiciliario(String documento, String nuevoNombre) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE domiciliario SET Nombre = '"+ nuevoNombre + "' WHERE documento = '"+ documento +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }
    @Override
    public boolean ModificarTelefonoDomiciliario(String documento, String nuevoTelefono) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE domiciliario SET telefono = '"+ nuevoTelefono + "' WHERE documento = '"+ documento +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }
    @Override
    public boolean ModificarPlacaVehiculoDomiciliario(String documento, String nuevaPlacaVehiculo) {
        boolean resultado= false;
       try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE domiciliario SET placaVehiculo = '"+ nuevaPlacaVehiculo + "' WHERE documento = '"+ documento +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  resultado=true;
        }
        catch(Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
            resultado=false;
        }
       return resultado;
    }    
    public boolean ValidarExistenciaRestaurante (String nombreRestaurante)
    {
        boolean resultado = false;
        
        try 
        {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "SELECT nombreRestaurante FROM restaurante";
                  ResultSet result = st.executeQuery(consulta);
                  
                  while(result.next()) 
                  {
                      if(nombreRestaurante.equals(result.getString("nombreRestaurante")))
                      {
                          resultado = true;
                      }  
                  }
                  
                  result.close();
                  st.close();
                  conexion.close();
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
        }
        
        return resultado;
    }
    
    public boolean CrearCliente(String pUsuario, String pNombre, String pApellido, String pDireccion)
    {
        boolean sePudo = false;
        try {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "INSERT INTO cliente VALUES ('"+ pUsuario +"','"+ pNombre + "','"+ pApellido +"', '" + pDireccion +"');";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  sePudo=true;
            
        } 
        catch (Exception e) {
             System.out.println("Errorx:"+e.getMessage());
            sePudo = false;
        }
        
        
        return sePudo;
    }
    
    public boolean ModificarNombreCliente(String pUsuario, String pNombre)
    {
        boolean sePudo = false;
        try {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(host,usuario,contrasena);
                  java.sql.Statement st = conexion.createStatement();
                  String consulta = "UPDATE cliente SET nombre = '"+ pNombre + "' WHERE usuario = '"+ pUsuario +"';";
                  st.execute(consulta);
                  st.close();
                  conexion.close();
                  sePudo=true;
            
        } 
        catch (Exception e) {
             System.out.println("Errorx:"+e.getMessage());
            sePudo = false;
        }
        
        
        return sePudo;
    }
    
 
    public DefaultListModel BuscarPalabrasClave (String pClave) 
    {
        DefaultListModel listRestaurantes= new DefaultListModel();
        
        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
            java.sql.Statement st = conexion.createStatement();
            String consulta = "SELECT nombreRestaurante FROM palabrasClave WHERE palabra = '" + pClave + "'";
            ResultSet result = st.executeQuery(consulta);
                  
            while(result.next()) 
            {
                listRestaurantes.addElement(result.getString("nombreRestaurante")); 
            }
            
            result.close();
            st.close();
            conexion.close();
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
        }
        
        return listRestaurantes;
    }
    
    public Restaurante darInformacionRestaurante (String nRestaurante) 
    {
        Restaurante R = new Restaurante();
        
        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
            java.sql.Statement st = conexion.createStatement();
            String consulta = "SELECT direccion,descripcion,costoEnvio FROM restaurante WHERE nombreRestaurante = '" + nRestaurante+ "'";
            ResultSet result = st.executeQuery(consulta);
                  
            while(result.next()) 
            {
                R.setNombre(result.getString("nombreRestaurante"));
                R.setDireccion(result.getString("direccion"));
                R.setDescripcion(result.getString("descripcion"));
                R.setCostoEnvio(result.getFloat("costoEnvio"));
            }
            
            result.close();
            st.close();
            conexion.close();
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
        }
        
        return R;
    }
    
     public DefaultListModel darNombrePlatos (String pRest) 
    {
        DefaultListModel listPlatos= new DefaultListModel();
        
        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
            java.sql.Statement st = conexion.createStatement();
            String consulta = "SELECT nombrePlato FROM plato WHERE restaurante = '" + pRest + "'";
            ResultSet result = st.executeQuery(consulta);
                  
            while(result.next()) 
            {
                listPlatos.addElement(result.getString("nombreRestaurante")); 
            }
            
            result.close();
            st.close();
            conexion.close();
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
        }
        
        return listPlatos;
    }
     
      public Plato darInformacionPlato(String nRest, String nPlato) 
    {
        Plato P = new Plato();
        
        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
            java.sql.Statement st = conexion.createStatement();
            String consulta = "SELECT precio,descripcion,imagen FROM plato WHERE restaurante = '" + nRest + "' and nombrePlato = '" + nPlato + "'";
            ResultSet result = st.executeQuery(consulta);
                  
            while(result.next()) 
            {
                P.setPrecio(result.getFloat("precio"));
                P.setDescripcion(result.getString("descripcion"));
                P.setImagen(result.getString("imagen"));
            }
            
            result.close();
            st.close();
            conexion.close();
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
        }
        
        return P;
    }
      
      public boolean agregarPedidoCC(String nUsuario, String nRestaurante, String nPlato) 
    {
       boolean resultado = false;
      
       try 
       {
           Class.forName("org.postgresql.Driver");
           Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
           java.sql.Statement st = conexion.createStatement();
           String consulta = "INSERT INTO carritoCompras VALUES ('"+ nUsuario +"', '"+ nRestaurante +"', '"+ nPlato +"');";
           st.execute(consulta);
           st.close();
           conexion.close();
           resultado = true;
       }
       catch (Exception exc)
       {
           System.out.println("Errorx:"+exc.getMessage());
           resultado = false;
       }
       
       return resultado;
    }
      
      public ArrayList<CarroCompras> darCarroCompras(String nUsuario) 
    {
        CarroCompras C = new CarroCompras();
        ArrayList<CarroCompras> listPedidos = new ArrayList<CarroCompras>();
                
        
        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(host, usuario, contrasena);
            java.sql.Statement st = conexion.createStatement();
            String consulta = "SELECT nombreRestaurante, nombrePlato FROM carritoCompras WHERE usuario = '" + nUsuario + "' ";
            ResultSet result = st.executeQuery(consulta);
                  
            while(result.next()) 
            {
                C.setNombreRestaurante(result.getString("nombreRestaurante"));
                C.setNombrePlato(result.getString("nombrePlato"));
                // C.setCantidad(result.getInt("imagen"));
                listPedidos.add(C);
            }
            
            result.close();
            st.close();
            conexion.close();
        }
        catch (Exception exc)
        {
            System.out.println("Errorx:"+exc.getMessage());
        }
        
        return listPedidos;
    }
    
}
