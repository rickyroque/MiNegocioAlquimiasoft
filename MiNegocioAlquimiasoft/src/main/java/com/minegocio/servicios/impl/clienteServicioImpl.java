/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.servicios.impl;

import com.minegocio.modelo.cliente;
import com.minegocio.repositorio.clienteRepositorio;
import com.minegocio.servicios.clienteServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ricky Roque
 */
@Service
public class clienteServicioImpl implements clienteServicio{
    
    @Autowired
    private clienteRepositorio clienteRepositorio;
    
    @Override
    public cliente guardarCliente(cliente cliente){
        return clienteRepositorio.save(cliente);
    }
    
    @Override
    public cliente actualizarCliente(cliente cliente) {
        return clienteRepositorio.save(cliente);
    }
    
    @Override
    public void eliminarCliente(Long clienteId) {
        cliente cliente = new cliente();
        cliente.setClienteId(clienteId);
        clienteRepositorio.delete(cliente);
    }
    
    @Override
    public List<cliente> listarNumeroIde(String numeroIdentificacion) {
        return clienteRepositorio.findByNumeroIdentificacion(numeroIdentificacion);
    }
    
    @Override
    public List<cliente> listarNombre(String nombre) {
        return clienteRepositorio.findByNombre(nombre);
    }
    
}
