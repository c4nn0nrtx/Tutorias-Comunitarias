/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import ConexionDB.ConexionDB;
import Dominio.Tutor;
import Interfaces.ITutorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 /*
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class TutorDAO implements ITutorDAO {

    @Override
    public boolean insertar(Tutor tutor) {
        String sql = "INSERT INTO Tutor(nombre, email, especialidad, telefono) VALUES (?, ?, ?, ?)";
        try (
            Connection con = ConexionDB.getConnection(); 
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, tutor.getNombre());
            ps.setString(3, tutor.getEmail());
            ps.setString(2, tutor.getEspecialidad());
            ps.setString(4, tutor.getTelefono());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("No se pudo insertar el tutor");
            return false;
        }

    }

    @Override
    public Tutor obtenerPorId(int idTutor) {
        String sql = "SELECT * FROM Tutor WHERE idTutor = ?";
        Tutor tutor = null;

        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idTutor);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                tutor = new Tutor();
                tutor.setIdTutor(rs.getInt("idTutor"));
                tutor.setNombre(rs.getString("nombre"));
                tutor.setEmail(rs.getString("email"));
                tutor.setEspecialidad(rs.getString("especialidad"));
                tutor.setTelefono(rs.getString("telefono"));

                return tutor;

            }
        } catch (SQLException e) {
            System.err.println("Error al obtener tutor por ID: " + e.getMessage());
            }
        return tutor;
    }

    @Override
    public List<Tutor> obtenerTodos() {
        String sql = "SELECT * FROM Tutor";
        List<Tutor> lista = new ArrayList<>();
        try (Connection con = ConexionDB.getConnection(); 
                PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Tutor tutor = new Tutor();
                tutor.setIdTutor(rs.getInt("idTutor"));
                tutor.setNombre(rs.getString("nombre"));
                tutor.setEmail(rs.getString("email"));
                tutor.setEspecialidad(rs.getString("especialidad"));
                tutor.setTelefono(rs.getString("telefono"));
                lista.add(tutor);
            }

        } catch (SQLException ex) {
            System.err.println("Error al obtener la lista de tutores");
        }
        return lista;

    }

    @Override
    public boolean actualizar(Tutor tutor) {
        String sql = "UPDATE Tutor SET nombre = ?, email = ?, especialidad = ?, telefono = ? WHERE idTutor = ?";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, tutor.getNombre());
            ps.setString(2, tutor.getEmail());
            ps.setString(3, tutor.getEspecialidad());
            ps.setString(4, tutor.getTelefono());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al actualizar tutor: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(int idTutor) {
        String sql = "DELETE FROM Tutor WHERE idTutor = ?";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idTutor);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al eliminar tutor: " + e.getMessage());
            return false;
        }
    }
    
}   
