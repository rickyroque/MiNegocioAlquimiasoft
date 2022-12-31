/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.servicios.impl;

import com.minegocio.modelo.cliente;
import com.minegocio.modelo.direccionCliente;
import com.minegocio.repositorio.direccionClienteRepositorio;
import com.minegocio.servicios.direccionClienteServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ricky Roque
 */
@Service
public class direccionClienteServicioImpl implements direccionClienteServicio{
    
    @Autowired
    private direccionClienteRepositorio direccionClienteRepositorio;
    
    @Override
    public direccionCliente guardarDireccionCliente(direccionCliente direccionCliente){
        return direccionClienteRepositorio.save(direccionCliente);
    }
    
    @Override
    public List<direccionCliente> listarAdicionales(cliente cliente) {
        return direccionClienteRepositorio.findByCliente(cliente);
    }
    
}
