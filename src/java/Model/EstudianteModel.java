/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import Entity.EstudianteEntity;
import javax.persistence.Query;
/**
 *
 * @author angel
 */
@Stateless
public class EstudianteModel {

    @PersistenceContext(unitName = "Test_JSF_Glassfish_5_Mysql_CRUDPU")
    private EntityManager em;
    
    
    /* Listar los registros del estudiante */
    public List<EstudianteEntity> getListarEstudiante() {
        Query consulta = em.createNamedQuery("EstudianteEntity.findAll");
        return consulta.getResultList();
    }
    
    /* Insertar un estudiante en la base de datos */
    public int setInsertarEstudiante(EstudianteEntity estudiante) {
        try {
            em.persist(estudiante);
            em.flush();
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }
    
    /* Eliminar un estudiante de la base de datos */
    public int setEliminarEstudiante(Integer codigo) {
        try {
            EstudianteEntity estudiante = em.find(EstudianteEntity.class, codigo);
            if (estudiante != null) {
                em.remove(estudiante);
                em.flush();
                return 0;
            } else {
                return 2;
            }
        } catch (Exception e) {
            return 1;
        }
    }
    
    /* Modificar estudiante */
    public int setModificarEstudiante(EstudianteEntity estudiante) {
        try {
            em.merge(estudiante);
            em.flush();
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }
}
