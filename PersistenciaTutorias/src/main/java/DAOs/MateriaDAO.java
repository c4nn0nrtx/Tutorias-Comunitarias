/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;
import ConexionDB.ConexionDB;
import Dominio.Materia;
import Interfaces.IMateriaDAO;
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
public class MateriaDAO implements IMateriaDAO{

    @Override
    public boolean insertar(Materia materia) {
    
        String sql = "INSERT INTO Alumno(nombre, nivel_Educativo, descripcion VALUES (?, ?, ?)";
        try (
            Connection con = ConexionDB.getConnection(); 
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, materia.getNombre());
            ps.setString(3, materia.getNivel_Educativo());
            ps.setString(2, materia.getDescripcion());


            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("No se pudo insertar la materia");
            return false;
        }
    }

    @Override
    public Materia obtenerPorId(int idMateria) {
        String sql = "SELECT * FROM Materia WHERE idMateria = ?";
        Materia materia = null;

        try (
            Connection con = ConexionDB.getConnection(); 
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNivel_Educativo(rs.getString("nivel_Educativo"));
                materia.setDescripcion(rs.getString("descripcion"));
                return materia;

            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la materia por ID: " + e.getMessage());
        }
        return materia;
    
    }

    @Override
    public List<Materia> obtenerTodos() {
        String sql = "SELECT * FROM Materia";
        List<Materia> lista = new ArrayList<>();   
        try(Connection con = ConexionDB.getConnection(); 
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
            
            while(rs.next()){
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNivel_Educativo(rs.getString("nivel_Educativo"));
                materia.setDescripcion(rs.getString("descripcion"));
                lista.add(materia);
            }
            
        } catch (SQLException ex) {
            System.err.println("Error al obtener la lista de materias");
        }
        return lista;
    
    }

    @Override
    public boolean actualizar(Materia materia) {
        String sql = "UPDATE Materia SET nombre = ?, nivel_Educativo = ?, Descripcion = ? WHERE idMateria = ?";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, materia.getNombre());
            ps.setString(3, materia.getNivel_Educativo());
            ps.setString(2, materia.getDescripcion());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al actualizar la materia: " + e.getMessage());
            return false;
        }
    
    }

    @Override
    public boolean eliminar(int idMateria) {
        
        String sql = "DELETE FROM Materia WHERE idMateria = ?";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idMateria);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al eliminar la materia: " + e.getMessage());
            return false;
        }
    }
    
}
