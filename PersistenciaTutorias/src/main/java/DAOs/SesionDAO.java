/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import ConexionDB.ConexionDB;
import Dominio.Sesion;
import Interfaces.ISesionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sandra
 */
public class SesionDAO implements ISesionDAO{

    @Override
    public boolean insertar(Sesion sesion) {
        String sql = "INSERT INTO Sesion(estado, fechaHora VALUES (?, ?, ?)";
        try (
            Connection con = ConexionDB.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, sesion.getEstado());
            //ps.setDate(3, sesion.getFechaHora()); //creo que hay que moverle aqu[i

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("No se pudo insertar la sesion");
            return false;
        }
    }

    @Override
    public Sesion obtenerPorId(int idSesion) {
        String sql = "SELECT * FROM Sesion WHERE idSesion = ?";
        Sesion sesion = null;

        try (
            Connection con = ConexionDB.getConnection(); 
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idSesion);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                sesion = new Sesion();
                sesion.setIdSesion(rs.getInt("idSesion"));
                sesion.setEstado(rs.getString("estado"));
                sesion.setFechaHora(rs.getDate("fechaHora"));
                
                return sesion;

            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la sesion por ID: " + e.getMessage());
        }
        return sesion;
        
    }

    @Override
    public List<Sesion> obtenerTodos() {
        String sql = "SELECT * FROM Sesion";
        List<Sesion> lista = new ArrayList<>();   
        try(Connection con = ConexionDB.getConnection(); 
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
            
            while(rs.next()){
                Sesion sesion = new Sesion();
                sesion.setIdSesion(rs.getInt("idSesion"));
                sesion.setEstado(rs.getString("Estado"));
                //alumno.setFechaHora(rs.getString("fechaHora"));
                
                lista.add(sesion);
            }
            
        } catch (SQLException ex) {
            System.err.println("Error al obtener la lista de sesiones");
        }
        return lista;
        
    }

    @Override
    public boolean actualizar(Sesion sesion) {
        
        String sql = "UPDATE Sesion SET estado = ?, fechaHora = ? WHERE idSesion = ?";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, sesion.getEstado());
            //ps.setString(3, sesion.getFechaHora());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al actualizar la sesion: " + e.getMessage());
            return false;
        }
    
    }

    @Override
    public boolean eliminar(int idSesion) {
        
        String sql = "DELETE FROM Sesion WHERE idSesion = ?";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idSesion);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al eliminar la sesion: " + e.getMessage());
            return false;
        }
    }

   
}
