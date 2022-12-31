/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.controlador;

import com.minegocio.modelo.direccion;
import com.minegocio.servicios.direccionServicio;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricky Roque
 */
@RestController
@RequestMapping("/direcciones")//declara la peticion http para usuarios
@CrossOrigin("*")
public class direccionControlador {
    
    @Autowired
    private direccionServicio direccionServicio;
    
    @Operation(summary="Metodo para ingresar nuevas direcciones, en el campo tipo puede escribir 'matriz' o 'adicional'"
            + " con el fin de identificar que tipo de direccion es")
    @PostMapping("/")
    public direccion guardarDireccion(@RequestBody direccion direccion){
        return direccionServicio.guardarDireccion(direccion);
    }
    
}
