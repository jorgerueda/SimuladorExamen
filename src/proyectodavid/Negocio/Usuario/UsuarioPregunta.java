/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Usuario;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;
import proyectodavid.Negocio.Pregunta.Pregunta;

/**
 *
 * @author jorgerueda
 */
@Entity
@XmlRootElement
@NamedQueries({
   
    @NamedQuery(name = "UsuarioPregunta.removeByUsuario", query = "DELETE  FROM UsuarioPregunta u WHERE u.idUsuario = :usuario")
  })
public class UsuarioPregunta {
    
    @EmbeddedId
    private ClavesUsuarioPregunta ida;
    @ManyToOne
    @MapsId("idUsuario")
    private Usuario idUsuario;
	
    @ManyToOne
    @MapsId("idPregunta")
    private Pregunta idPregunta;
    
    private String solucion_user;
    
    private Boolean aprobado;

    /*public UsuarioPregunta(){
        
    }
    public UsuarioPregunta(Usuario idUsuario, Pregunta idPregunta) {
        this.idUsuario = idUsuario;
        this.idPregunta = idPregunta;
    }*/

    
    
    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Pregunta getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Pregunta idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getSolucionUser() {
        return solucion_user;
    }

    public void setSolucionUser(String solucion_usuer) {
        this.solucion_user = solucion_usuer;
    }

    public ClavesUsuarioPregunta getClaves() {
        return ida;
    }

    public void setClaves(ClavesUsuarioPregunta ida) {
        this.ida = ida;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }
    
   
    
    
}
