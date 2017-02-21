/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio;

import java.util.List;

/**
 *
 * @author jorgerueda
 */
public class OrdenPregunta {
    
 private String a;
 private String b;
 private String c;
 private String d;
 
 private String selected;

    public OrdenPregunta() {
    }

    public OrdenPregunta(String a, String b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public OrdenPregunta(List<String> list){
      this.a = list.get(0);
      this.b = list.get(1);
      this.c = list.get(2);
      this.d = list.get(3);
      selected = null;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
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
 
    
    
}
