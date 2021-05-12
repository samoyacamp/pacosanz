/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblio;

import com.mycompany.biblio.modelos.Usuario;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author power
 */
public class RegistrarController {
    private static Usuario user;
    
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido;
    @FXML
    private TextField email;
    @FXML
    private TextField pwd;
    @FXML
    private TextField DNI;
    @FXML
    private TextField domicilio;
    @FXML
    private TextField ciudad;
    @FXML
    private TextField provincia;
    @FXML
    private TextField puesto;
    @FXML
    private void regi(){
    
    }
    @FXML
    private void volver() throws IOException{
    App.setRoot("primary");
    
    
    }
    
    
    
    
   
    
    
    
}
