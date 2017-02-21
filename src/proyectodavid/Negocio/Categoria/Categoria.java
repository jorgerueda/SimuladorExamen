/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Categoria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import proyectodavid.Negocio.Pregunta.Pregunta;

/**
 *
 * @author jorgerueda
 */
@Entity
@Table(name = "CATEGORIA")
@XmlRootElement

@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c"),
    @NamedQuery(name = "Categoria.findAllNames", query = "SELECT c.nombre FROM Categoria c"),
    @NamedQuery(name = "Categoria.findById", query = "SELECT c FROM Categoria c WHERE c.id = :id"),
    @NamedQuery(name = "Categoria.findByNombre", query = "SELECT c FROM Categoria c WHERE c.nombre = :nombre")
})
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "NUMERO_PREGUNTAS")
    private Integer numeroPreguntas;
    @Column(name = "TIEMPO")
    private Integer tiempo;
    @Column(name = "NOTA_MINIMA")
    private Integer notaMinima;
    @Column(name = "ACIERTO")
    private Double acierto;
    @Column(name = "FALLO")
    private Double fallo;
    @Column (name="ORDEN")
    private Integer orden;
    
    
    
    @OneToMany (mappedBy="categoria")
    private List<Pregunta> lista_preguntas;

    public Categoria() {
        lista_preguntas = new ArrayList <Pregunta>();
    }
     public Categoria(String nombre) {
        lista_preguntas = new ArrayList <Pregunta>();
        this.nombre= nombre;
    }
     
     public Categoria(int id){
         lista_preguntas = new ArrayList <Pregunta>();
         this.id =id;
         
     }
     
    public Categoria(String nombre, Integer numeroPreguntas, Integer tiempo) {
        this.nombre = nombre;
        this.numeroPreguntas = numeroPreguntas;
        this.tiempo = tiempo;
        lista_preguntas = new ArrayList <Pregunta>();
    }

    public Categoria(String nombre, Integer numeroPreguntas, Integer tiempo, Integer notaMinima, Double acierto, Double fallo,Integer orden) {
        this.orden = orden;
        this.nombre = nombre;
        this.numeroPreguntas = numeroPreguntas;
        this.tiempo = tiempo;
        this.notaMinima = notaMinima;
        this.acierto = acierto;
        this.fallo = fallo;
        lista_preguntas = new ArrayList <Pregunta>();

    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroPreguntas() {
        return numeroPreguntas;
    }

    public void setNumeroPreguntas(Integer numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public List<Pregunta> getLista_preguntas() {
        return lista_preguntas;
    }

    public void setLista_preguntas(List<Pregunta> lista_preguntas) {
        this.lista_preguntas = lista_preguntas;
    }
    

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public Integer getNotaMinima() {
        return notaMinima;
    }

    public void setNotaMinima(Integer notaMinima) {
        this.notaMinima = notaMinima;
    }

    public Double getAcierto() {
        return acierto;
    }

    public void setAcierto(Double acierto) {
        this.acierto = acierto;
    }

    public Double getFallo() {
        return fallo;
    }

    public void setFallo(Double fallo) {
        this.fallo = fallo;
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
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectodavid.Negocio.Categoria.Categoria[ id=" + id + " ]";
    }
    
   
}
