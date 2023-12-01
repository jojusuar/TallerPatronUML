/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadeMethod;

/**
 *
 * @author davidsuarez
 */
public class AtencionVirtualFachada {
    private String linkSubCanales;
    
     public AtencionVirtualFachada(String linkSubCanales) {
        this.linkSubCanales = linkSubCanales;
    }

    public String getLinkSubCanales() {
        return linkSubCanales;
    }

    public void setLinkSubCanales(String linkSubCanales) {
        this.linkSubCanales = linkSubCanales;
    }
    
    public void recibirConsulta(){
        //implementacion
    }
    
    public void realizarTransaccion(){
        //implementacion
    }
    
}
