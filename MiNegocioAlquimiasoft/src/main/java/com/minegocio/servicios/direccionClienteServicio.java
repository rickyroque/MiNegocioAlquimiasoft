/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.minegocio.servicios;

import com.minegocio.modelo.cliente;
import com.minegocio.modelo.direccionCliente;
import java.util.List;

/**
 *
 * @author Ricky Roque
 */
public interface direccionClienteServicio {
    
    public direccionCliente guardarDireccionCliente(direccionCliente direccionCliente);
    
    List<direccionCliente> listarAdicionales(cliente cliente);
}
