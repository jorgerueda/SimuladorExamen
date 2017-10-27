/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Estadistica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import proyectodavid.Negocio.Categoria.Categoria;
import proyectodavid.Negocio.Pregunta.Pregunta;
import proyectodavid.Negocio.Usuario.Usuario;

/**
 *
 * @author jorgerueda
 */
@Entity
@Table(name = "ESTADISTICA")
@XmlRootElement

@NamedQueries({
     @NamedQuery(name = "Estadistica.SelectALL", query = "SELECT p FROM Estadistica p"),
    @NamedQuery(name = "Estadistica.SelectEstadisticaByUser", query = "SELECT p FROM Estadistica p WHERE p.usuario = :usuario"),
    @NamedQuery(name = "Estadistica.SelectEstadisticaByCategoria", query = "SELECT p FROM Estadistica p WHERE p.usuario = :usuario and p.Categoria = :categoria")
})
public class Estadistica implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "ID") 
    private Integer id;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Categoria Categoria;
    @Column(name = "OLD")
    private Integer old;
    @Column(name = "ACTUAL")
    private Integer actual;
    @Column(name = "CONTESTADASNEW")
    private Integer contestadasNew;
     @Column(name = "CONTESTADASOLD")
    private Integer contestadasOld;
    

    public Estadistica(Usuario usuario, Categoria Categoria, Integer actual,Integer contestadasNew) {
        this.usuario = usuario;
        this.Categoria = Categoria;
        this.actual = actual;
        this.contestadasNew=contestadasNew;
    }

    public Estadistica() {
        
        
        
        
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        this.actual = actual;
    }

    public Integer getContestadasNew() {
        return contestadasNew;
    }

    public void setContestadasNew(Integer contestadasNew) {
        this.contestadasNew = contestadasNew;
    }

    public Integer getContestadasOld() {
        return contestadasOld;
    }

    public void setContestadasOld(Integer contestadasOld) {
        this.contestadasOld = contestadasOld;
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
        if (!(object instanceof Estadistica)) {
            return false;
        }
        Estadistica other = (Estadistica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectodavid.Negocio.Estadistica.Estadistica[ id=" + id + " ]";
    }
    
   
}
