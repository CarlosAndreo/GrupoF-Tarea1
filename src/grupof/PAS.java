/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupof;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
/**
 * SII
 * 3ºA Ingeniería Informática 
 * @author GRUPOF
 */
@Entity
//@DiscriminatorValue(value="PA")
@PrimaryKeyJoinColumn(name="UserID")
public class PAS extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long CodPAS;

    public Long getCodPAS() {
        return CodPAS;
    }

    public void setCodPAS(Long CodPAS) {
        this.CodPAS = CodPAS;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (CodPAS != null ? CodPAS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PAS)) {
            return false;
        }
        PAS other = (PAS) object;
        if ((this.CodPAS == null && other.CodPAS != null) || (this.CodPAS != null && !this.CodPAS.equals(other.CodPAS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grupof.PAS[ id=" + CodPAS + " ]";
    } 
}
