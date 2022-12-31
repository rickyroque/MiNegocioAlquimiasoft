/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.controlador;

import com.minegocio.modelo.cliente;
import com.minegocio.servicios.clienteServicio;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricky Roque
 */
@RestController
@RequestMapping("/clientes")//declara la peticion http para clientes
@CrossOrigin("*")
public class clienteControlador {
    
    @Autowired
    private clienteServicio clienteServicio;
    
    @Operation(summary="Metodo para guardar datos del cliente; "
            + "en el campo direccion es necesario ingresar el id de la direccion")
    @PostMapping("/")
    public cliente guardarCliente(@RequestBody cliente cliente){
        return clienteServicio.guardarCliente(cliente);
    }
    
    @Operation(summary="Metodo para editar datos del cliente es necesario especificar el campo id")
    @PutMapping("/")
    public cliente actualizarCliente(@RequestBody cliente cliente){
        return clienteServicio.actualizarCliente(cliente);
    }
    
    @Operation(summary="Metodo para que elimina un cliente, se espera el Id del cliente")
    @DeleteMapping("/{clienteId}")
    public void eliminarCliente(@PathVariable("clienteId") Long clienteId){
        clienteServicio.eliminarCliente(clienteId);
    }
    
    @Operation(summary="Metodo para listar un cliente por numero de identificacion,"
            + " se espera recibir RUC o DNI")
    @GetMapping("/numeroIde/{numeroIdentificacion}")
    public List<cliente> listarNumeroIde(@PathVariable("numeroIdentificacion") String numeroIdentificacion){
        return clienteServicio.listarNumeroIde(numeroIdentificacion);
    }
    
    @Operation(summary="Metodo para listar un cliente por Nombre, ese necesario escribir el nombre completo"
            + " del cliente")
    @GetMapping("/nombre/{nombre}")
    public List<cliente> listarNombre(@PathVariable("nombre") String nombre){
        return clienteServicio.listarNombre(nombre);
    }
    
    
}
