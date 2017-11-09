
package controllers;


import models.ModelMain;
import models.ModelClientes;
import views.ViewClientes;

/**
 *
 * @author Briceyda Angeles
 */
public class ControllerClientes {
    private final ModelMain model_main;
    private final ModelClientes model_clientes;
    private final ViewClientes view_clientes;
    
     public ControllerClientes(Object models[], Object views[], Object controllers[]){
        this.model_main = (ModelMain)models[0];
        this.model_clientes = (ModelClientes)models[2];
        this.view_clientes = (ViewClientes)views[2];
        initView();   
}
