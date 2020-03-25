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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * SII
 * 3ºA Ingeniería Informática 
 * @author GRUPOF
 */
@Entity
@DiscriminatorValue(value="A")
public class Alumno extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodUMA;//codAlumno
    @ManyToMany //Relacion Alumno-Asignatura
    @JoinTable(name="jnd_alum_asig",joinColumns=@JoinColumn(name="alumno_fk"),inverseJoinColumns=@JoinColumn(name="asignatura_fk"))
    private List<Asignatura> Asignaturas;

    public Long getCodUMA() {
        return CodUMA;
    }

    public void setCodUMA(Long CodUMA) {
        this.CodUMA = CodUMA;
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
        hash += (CodUMA != null ? CodUMA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.CodUMA == null && other.CodUMA != null) || (this.CodUMA != null && !this.CodUMA.equals(other.CodUMA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grupof.Alumno[ id=" + CodUMA + " ]";
    }
    
}
