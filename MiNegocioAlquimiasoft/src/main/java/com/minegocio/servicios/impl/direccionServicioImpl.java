/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.servicios.impl;

import com.minegocio.modelo.direccion;
import com.minegocio.repositorio.direccionRepositorio;
import com.minegocio.servicios.direccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ricky Roque
 */
@Service
public class direccionServicioImpl implements direccionServicio{
    
    @Autowired
    private direccionRepositorio direccionRepositorio;
    
    @Override
    public direccion guardarDireccion(direccion direccion){
        return direccionRepositorio.save(direccion);
    }
    
}
