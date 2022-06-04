/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.persistencia;

import co.edu.univalle.modelo.Examen;
import java.util.List;

/**
 *
 * @author JHOJANL
 */
public interface IexamenDAO {

    public void insertar(Examen examen) throws Exception;

    public Examen consultarPorId(int codigo) throws Exception;

    public Examen consultarPorNombre(String nombre) throws Exception;

    public List<Examen> consultar() throws Exception;
}
