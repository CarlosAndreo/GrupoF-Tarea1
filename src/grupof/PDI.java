/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupof;

import java.io.Serializable;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 * SII
 * 3ºA Ingeniería Informática 
 * @author GRUPOF
 */
@Entity
@DiscriminatorValue(value="PDI")
public class PDI extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodPDI;
    private String Departamento;
    private String Titulacion;
    private Long CodActividad;
    @ManyToMany(mappedBy ="PDI")
    private List<Asignatura> Asignaturas;

    public Long getCodPDI() {
        return CodPDI;
    }

    public void setCodPDI(Long CodPDI) {
        this.CodPDI = CodPDI;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public Long getCodActividad() {
        return CodActividad;
    }

    public void setCodActividad(Long CodActividad) {
        this.CodActividad = CodActividad;
    }

    public List<Asignatura> getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(List<Asignatura> Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (CodPDI != null ? CodPDI.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PDI)) {
            return false;
        }
        PDI other = (PDI) object;
        if ((this.CodPDI == null && other.CodPDI != null) || (this.CodPDI != null && !this.CodPDI.equals(other.CodPDI))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grupof.PDI[ id=" + CodPDI + " ]";
    }
    
}
