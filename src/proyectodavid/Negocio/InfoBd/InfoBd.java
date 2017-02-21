package proyectodavid.Negocio.InfoBd;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorgerueda
 */
@Entity
@Table(name = "INFO_BD")
@XmlRootElement
public class InfoBd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CATEGORIA")
    private String categoria;
   @Column(name = "NUMERO_PREGUNTAS")
    private Integer numPreguntas;
  
    public InfoBd() {
    }

    public InfoBd(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

      public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getNumPreguntas() {
        return numPreguntas;
    }

    public void setNumPreguntas(Integer numPreguntas) {
        this.numPreguntas = numPreguntas;
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
        if (!(object instanceof InfoBd)) {
            return false;
        }
        InfoBd other = (InfoBd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectodavid.Negocio.InfoBd.InfoBd[ id=" + id + " ]";
    }
    
}
