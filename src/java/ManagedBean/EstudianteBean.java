/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import Model.EstudianteModel;
import javax.ejb.EJB;
import javax.inject.Named;
import Entity.EstudianteEntity;
import java.util.List;
import javax.enterprise.context.RequestScoped;
/**
 *
 * @author angel
 */
@Named(value = "estudianteBean")
@RequestScoped
public class EstudianteBean {

    @EJB
    private EstudianteModel estudianteModel;

    private List<EstudianteEntity> lista;
    private EstudianteEntity estudiante = new EstudianteEntity();
    
    public EstudianteBean() {
    }

    public List<EstudianteEntity> getLista() {
        this.lista = estudianteModel.getListarEstudiante();
        return lista;
    }

    public EstudianteEntity getEstudiante() { return estudiante; }
    public void setEstudiante(EstudianteEntity est) { this.estudiante = est; }
    
    public String insertarEstudiante() {
        estudianteModel.setInsertarEstudiante(estudiante);
        return  "/index";
    }
    
    public String eliminarEstudiante(Integer codigo) {
        estudianteModel.setEliminarEstudiante(codigo);
        return  "/index";
    }
    
    public void editarEstudiante(EstudianteEntity estudiante) {
        this.estudiante = estudiante;
    }
    
    public String actualizarEstudiante() {
        estudianteModel.setModificarEstudiante(estudiante);
        return  "/index";
    }
    
}
