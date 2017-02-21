/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Pregunta;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.swing.ImageIcon;
import javax.xml.bind.annotation.XmlRootElement;
import proyectodavid.Negocio.Categoria.Categoria;

/**
 *
 * @author jorgerueda
 */
@Entity
@Table(name = "PREGUNTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pregunta.findAll", query = "SELECT p FROM Pregunta p"),
    @NamedQuery(name = "Pregunta.findById", query = "SELECT p FROM Pregunta p WHERE p.id = :id"),
    @NamedQuery(name = "Pregunta.findByPregunta", query = "SELECT p FROM Pregunta p WHERE p.pregunta = :pregunta"),
    @NamedQuery(name = "Pregunta.findByA", query = "SELECT p FROM Pregunta p WHERE p.a = :a"),
    @NamedQuery(name = "Pregunta.findByB", query = "SELECT p FROM Pregunta p WHERE p.b = :b"),
    @NamedQuery(name = "Pregunta.findByC", query = "SELECT p FROM Pregunta p WHERE p.c = :c"),
    @NamedQuery(name = "Pregunta.findByD", query = "SELECT p FROM Pregunta p WHERE p.d = :d"),
    @NamedQuery(name = "Pregunta.findByCategoria", query = "SELECT p FROM Pregunta p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "Pregunta.SelectIdByCategoria", query = "SELECT p.id FROM Pregunta p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "Pregunta.findByPhoto1", query = "SELECT p FROM Pregunta p WHERE p.photo1 = :photo1"),
    @NamedQuery(name = "Pregunta.findByPhoto2", query = "SELECT p FROM Pregunta p WHERE p.photo2 = :photo2"),
    @NamedQuery(name = "Pregunta.findBySolucion", query = "SELECT p FROM Pregunta p WHERE p.solucion = :solucion"),
    @NamedQuery(name = "Pregunta.findMaxId", query = "SELECT MAX(p.id) FROM Pregunta p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "Pregunta.findRandom", query = "SELECT p FROM Pregunta p WHERE p.id IN (:lista) AND p.categoria = :categoria")
  
})
public class Pregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PREGUNTA")
    private String pregunta;
    @Column(name = "A")
    private String a;
    @Column(name = "B")
    private String b;
    @Column(name = "C")
    private String c;
    @Column(name = "D")
    private String d;
    @ManyToOne
   // @Column(name = "CATEGORIA")
    private Categoria categoria;
    @Lob
    @Column(name = "PHOTO1")
    private byte[] photo1;
    @Column(name = "PHOTO2")
    private byte[] photo2;
    @Column(name = "NAME_PHOTO1")
    private String namePhoto1;
    @Column(name = "NAME_PHOTO2")
    private String namePhoto2;
    @Column(name = "SOLUCION")
    private String solucion;
    @Column(name = "SOLUCION_USER")
    private String solucionUser;

   

    public Pregunta() {
    }

    public Pregunta(Integer id) {
        this.id = id;
    }

    public Pregunta(String pregunta, String a, String b, String c, String d, Categoria categoria, String solucion) {
        this.pregunta = pregunta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.categoria = categoria;
        this.solucion = solucion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public byte[] getPhoto1() {
        return photo1;
    }

    public void setPhoto1(byte[] photo1) {
        this.photo1 = photo1;
    }

    public byte[] getPhoto2() {
        return photo2;
    }

    public void setPhoto2(byte[] photo2) {
        this.photo2 = photo2;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }
    
     public String getSolucionUser() {
        return solucionUser;
    }

    public void setSolucionUser(String solucionUser) {
        this.solucionUser = solucionUser;
    }
    
    public String getNamePhoto1() {
        return namePhoto1;
    }

    public void setNamePhoto1(String namePhoto1) {
        this.namePhoto1 = namePhoto1;
    }

    public String getNamePhoto2() {
        return namePhoto2;
    }

    public void setNamePhoto2(String namePhoto2) {
        this.namePhoto2 = namePhoto2;
    }
    
    public Image obtenerImagen1(){
    Image img = Toolkit.getDefaultToolkit().createImage(this.photo1) ;
    ImageIcon icon = new ImageIcon(img);
    return img;
    }
     public Image obtenerImagen2(){
    Image img = Toolkit.getDefaultToolkit().createImage(this.photo2) ;
    ImageIcon icon = new ImageIcon(img);
    return img;
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
        if (!(object instanceof Pregunta)) {
            return false;
        }
        Pregunta other = (Pregunta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectodavid.Negocio.Pregunta.Pregunta[ id=" + id + " ]";
    }
    
}
