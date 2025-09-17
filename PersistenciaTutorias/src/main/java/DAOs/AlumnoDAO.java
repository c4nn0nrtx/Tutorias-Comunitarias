/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import ConexionDB.ConexionDB;
import Dominio.Alumno;

import Interfaces.IAlumnoDAO;
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
public class AlumnoDAO implements IAlumnoDAO {

    @Override
    public boolean insertar(Alumno alumno) {
        String sql = "INSERT INTO Alumno(nombre, apellidoPaterno, apellidoMaterno, telefono, escuela_Procedencia, grado_Escolar) VALUES (?, ?, ?, ?, ?, ?)";
        try (
            Connection con = ConexionDB.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, alumno.getNombre());
            ps.setString(3, alumno.getApellidoPaterno());
            ps.setString(2, alumno.getApellidoMaterno());
            ps.setString(4, alumno.getTelefono());
            ps.setString(5, alumno.getEscuela_Procedencia());
            ps.setString(6, alumno.getGrado_Escolar());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("No se pudo insertar el alumno");
            return false;
        }
    }

    @Override
    public Alumno obtenerPorId(int idAlumno) {
        String sql = "SELECT * FROM Alumno WHERE idAlumno = ?";
        Alumno alumno = null;

        try (
            Connection con = ConexionDB.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellidoPaterno(rs.getString("apellidoPaterno"));
                alumno.setApellidoMaterno(rs.getString("apellidoMaterno"));
                alumno.setTelefono(rs.getString("telefono"));
                alumno.setEscuela_Procedencia(rs.getString("escuela_Procedencia"));
                alumno.setGrado_Escolar(rs.getString("grado_Escolar"));
                return alumno;

            }
        } catch (SQLException e) {
            System.err.println("Error al obtener alumno por ID: " + e.getMessage());
        }
        return alumno;
    }

    @Override
    public List<Alumno> obtenerTodos() {
        String sql = "SELECT * FROM Alumno";
        List<Alumno> lista = new ArrayList<>();   
        try(Connection con = ConexionDB.getConnection(); 
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
            
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellidoPaterno(rs.getString("apellidoPaterno"));
                alumno.setApellidoMaterno(rs.getString("apellidoMaterno"));
                alumno.setTelefono(rs.getString("telefono"));
                alumno.setEscuela_Procedencia(rs.getString("escuela_Procedencia"));
                alumno.setGrado_Escolar(rs.getString("grado_Escolar"));
                lista.add(alumno);
            }
            
        } catch (SQLException ex) {
            System.err.println("Error al obtener la lista de alumnos");
        }
        return lista;
    
    }

    @Override
    public boolean actualizar(Alumno alumno) {
        String sql = "UPDATE Alumno SET nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, telefono = ?, escuela_Procedencia = ?, grado_Escolar = ? WHERE idAlumno = ?";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, alumno.getNombre());
            ps.setString(3, alumno.getApellidoPaterno());
            ps.setString(2, alumno.getApellidoMaterno());
            ps.setString(4, alumno.getTelefono());
            ps.setString(5, alumno.getEscuela_Procedencia());
            ps.setString(6, alumno.getGrado_Escolar());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al actualizar alumno: " + e.getMessage());
            return false;
        }
    
    }

    @Override
    public boolean eliminar(int idAlumno) {
    
        String sql = "DELETE FROM Alumno WHERE idAlumno = ?";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al eliminar alumno: " + e.getMessage());
            return false;
        }
    
    }

}
