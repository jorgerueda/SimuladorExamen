/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Usuario;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author jorgerueda
 */
@Embeddable
public class ClavesUsuarioPregunta implements Serializable {
    
    private int idUsuario;
    private int idPregunta;
    
    public ClavesUsuarioPregunta(){}
    
     public ClavesUsuarioPregunta(int idUsuario, int idPregunta) {
        this.idUsuario = idUsuario;
        this.idPregunta = idPregunta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPRegunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }
    
    @Override
	public int hashCode() {
		return idUsuario + idPregunta;
	}
 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClavesUsuarioPregunta other = (ClavesUsuarioPregunta) obj;
		if (idPregunta != other.idPregunta)
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		return true;
	}
    
    
    
}
