/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author angel
 */
@Entity
@Table(name = "estudiante")
@NamedQueries({
    @NamedQuery(name = "EstudianteEntity.findAll", query = "SELECT e FROM EstudianteEntity e")
    , @NamedQuery(name = "EstudianteEntity.findByCodigoEstudiante", query = "SELECT e FROM EstudianteEntity e WHERE e.codigoEstudiante = :codigoEstudiante")
    , @NamedQuery(name = "EstudianteEntity.findByNombre", query = "SELECT e FROM EstudianteEntity e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "EstudianteEntity.findByApellido", query = "SELECT e FROM EstudianteEntity e WHERE e.apellido = :apellido")
    , @NamedQuery(name = "EstudianteEntity.findByTelefono", query = "SELECT e FROM EstudianteEntity e WHERE e.telefono = :telefono")
    , @NamedQuery(name = "EstudianteEntity.findByFechaIngreso", query = "SELECT e FROM EstudianteEntity e WHERE e.fechaIngreso = :fechaIngreso")})
public class EstudianteEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigoEstudiante", nullable = false)
    private Integer codigoEstudiante;
    @Basic(optional = false)
    @Column(name = "nombre",length = 50, nullable = false)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido",length = 60, nullable = false)
    private String apellido;
    @Basic(optional = false)
    @Column(name = "telefono",length = 10, nullable = false)
    private String telefono;
    @Basic(optional = false)
    @Column(name = "fechaIngreso", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
     
    
    public EstudianteEntity() {
    }

    public EstudianteEntity(Integer codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public EstudianteEntity(Integer codigoEstudiante, String nombre, String apellido, String telefono, Date fechaIngreso) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(Integer codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoEstudiante != null ? codigoEstudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstudianteEntity)) {
            return false;
        }
        EstudianteEntity other = (EstudianteEntity) object;
        if ((this.codigoEstudiante == null && other.codigoEstudiante != null) || (this.codigoEstudiante != null && !this.codigoEstudiante.equals(other.codigoEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.EstudianteEntity[ codigoEstudiante=" + codigoEstudiante + " ]";
    }
    
}
