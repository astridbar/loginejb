/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import com.mycompany.UsuarioFacadeLocal;
import entity.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author astrid
 */
@Named
@ViewScoped
public class Ilogin implements Serializable {
    
    @EJB
    private UsuarioFacadeLocal EjbUsuario;
    private Usuario usuario;
    
    @PostConstruct
    public void init(){
        usuario= new Usuario();
    }

    public Usuario getUsuario() {
         return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String iniciarSesion(){
        Usuario us;
      String redireccion =null;
        try{ 
            
            us = EjbUsuario.iniciarSesion(usuario);
            if (us!=null){
                      redireccion="principal";
            }
            else{
                       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
				"Aviso","usuario incorrecto"));
  
            }
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"no se puede conectar intente de nevo","no se puede conectar intente de nevo"));
        }
        return redireccion;
}}
        
 