/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupof;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author GRUPOF
 */
@Entity
public class Valoracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IDValoracion;
    private String TipoValoracion;
    private Integer Calificacion;
    private String Comentarios;

    public Long getIDValoracion() {
        return IDValoracion;
    }

    public void setIDValoracion(Long IDValoracion) {
        this.IDValoracion = IDValoracion;
    }

    public String getTipoValoracion() {
        return TipoValoracion;
    }

    public void setTipoValoracion(String TipoValoracion) {
        this.TipoValoracion = TipoValoracion;
    }

    public Integer getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Integer Calificacion) {
        this.Calificacion = Calificacion;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (IDValoracion != null ? IDValoracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valoracion)) {
            return false;
        }
        Valoracion other = (Valoracion) object;
        if ((this.IDValoracion == null && other.IDValoracion != null) || (this.IDValoracion != null && !this.IDValoracion.equals(other.IDValoracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grupof.Valoracion[ id=" + IDValoracion + " ]";
    }
    
}