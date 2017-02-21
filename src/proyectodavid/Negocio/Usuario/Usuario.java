/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Usuario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorgerueda
 */
@Entity
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id"),
    @NamedQuery(name = "Usuario.findByUsuario", query = "SELECT u FROM Usuario u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuario.findByApellidos", query = "SELECT u FROM Usuario u WHERE u.apellidos = :apellidos"),
    @NamedQuery(name = "Usuario.findByRol", query = "SELECT u FROM Usuario u WHERE u.rol = :rol"),
    @NamedQuery(name = "Usuario.findByIntentos", query = "SELECT u FROM Usuario u WHERE u.intentos = :intentos")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "USUARIO",unique=true)
    private String usuario;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "ROL")
    private String rol;
    @Column(name = "PASSWORD")
    private String pass;
    @Column(name = "INTENTOS")
    private Integer intentos;
    @Column(name = "INTENTOS_REALIZADOS")
    private Integer intentosRealizados;

    @OneToMany(mappedBy ="idUsuario", cascade={CascadeType.PERSIST}, orphanRemoval=true)
    //@OrderBy ("idPregunta.categoria.id ASC")
    private Collection <UsuarioPregunta> lista_preguntas;

    public Usuario() {
        
        lista_preguntas= new ArrayList<UsuarioPregunta>();
        this.intentosRealizados=0;
    }

    public Usuario(Integer id) {
        this.id = id;
        lista_preguntas= new ArrayList<UsuarioPregunta>();
        this.intentosRealizados=0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getIntentos() {
        return intentos;
    }

    public void setIntentos(Integer intentos) {
        this.intentos = intentos;
    }
    
    public Integer getIntentosRealizados() {
        return intentosRealizados;
    }

    public void setIntentosRealizados(Integer intentosRealizados) {
        this.intentosRealizados = intentosRealizados;
    }

    public Collection<UsuarioPregunta> getLista_preguntas() {
        return lista_preguntas;
    }

    public void setLista_preguntas(Collection <UsuarioPregunta> lista_preguntas) {
        this.lista_preguntas = lista_preguntas;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectodavid.Negocio.Usuario.Usuario[ id=" + id + " ]";
    }
    
}
