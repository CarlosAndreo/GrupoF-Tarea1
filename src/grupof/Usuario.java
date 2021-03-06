/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupof;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;


/**
 * SII
 * 3ºA Ingeniería Informática 
 * @author GRUPOF
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UserID;
    private String Nombre;
    private String Apellidos;
    private String Password;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date FechaNacimiento;
    @Column(name="DNI", unique = true)
    private String DNI;
    private String email;
    private String direccion;
    private String formacion;
    private String foto;
    private Integer telefono;
    private String idioma;
    private String Rol;
    @OneToMany
    private List<ParticipacionEnActividad> participantes;
    @OneToMany//Entidad debil
    private List<Matching> matching;
    @OneToMany
    private List<Mensaje> mensajes;
    @OneToMany
    private List<ValoracionPrivada> valoraciones;
    @OneToMany
    private List<ValoracionPublica> valoracionesPublicas;
    
    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long UserID) {
        this.UserID = UserID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public List<ParticipacionEnActividad> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<ParticipacionEnActividad> participantes) {
        this.participantes = participantes;
    }

    public List<Matching> getMatching() {
        return matching;
    }

    public void setMatching(List<Matching> matching) {
        this.matching = matching;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public List<ValoracionPrivada> getValoraciones() {
        return valoraciones;
    }

    public void setValoraciones(List<ValoracionPrivada> valoraciones) {
        this.valoraciones = valoraciones;
    }  

    public List<ValoracionPublica> getValoracionesPublicas() {
        return valoracionesPublicas;
    }

    public void setValoracionesPublicas(List<ValoracionPublica> valoracionesPublicas) {
        this.valoracionesPublicas = valoracionesPublicas;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (UserID != null ? UserID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.UserID == null && other.UserID != null) || (this.UserID != null && !this.UserID.equals(other.UserID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grupof.Usuario[ id=" + UserID + " ]";
    }
    
}
