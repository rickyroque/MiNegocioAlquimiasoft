/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.minegocio.servicios;

import com.minegocio.modelo.cliente;
import java.util.List;

/**
 *
 * @author Ricky Roque
 */
public interface clienteServicio {
    
    public cliente guardarCliente(cliente cliente);
    
    cliente actualizarCliente(cliente cliente);
    
    public void eliminarCliente(Long clienteId);
    
    List<cliente> listarNumeroIde(String numeroIdentificacion);
    
    List<cliente> listarNombre(String nombre);
    
    
    
}
