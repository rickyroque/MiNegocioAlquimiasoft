/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.controlador;

import com.minegocio.modelo.cliente;
import com.minegocio.modelo.direccionCliente;
import com.minegocio.servicios.direccionClienteServicio;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricky Roque
 */
@RestController
@RequestMapping("/direccionClientes")//declara la peticion http para usuarios
@CrossOrigin("*")
public class direccionClienteControlador {
    
    @Autowired
    private direccionClienteServicio direccionClienteServicio;
    
    @Operation(summary="Metodo guardar la relacion entre clientes y direcciones adicionales, "
            + " se espera recibir el id del cliente y el id de la direccion guardada")
    @PostMapping("/")
    public direccionCliente guardarDireccionCliente(@RequestBody direccionCliente direccionCliente){
        return direccionClienteServicio.guardarDireccionCliente(direccionCliente);
    }
    
    @Operation(summary="Metodo que lista todas las direcciones relacionadas a un cliente, se espera recibir el id del "
            + " cliente")
    @GetMapping("/adicionales/{clienteId}")
    public List<direccionCliente> listarAdicionales(@PathVariable("clienteId") Long clienteId){
        cliente cliente = new cliente();
        cliente.setClienteId(clienteId);
        return direccionClienteServicio.listarAdicionales(cliente);
    }
    
}
