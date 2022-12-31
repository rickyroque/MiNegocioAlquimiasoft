/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.minegocio.repositorio;

import com.minegocio.modelo.cliente;
import com.minegocio.modelo.direccionCliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ricky Roque
 */
public interface direccionClienteRepositorio extends JpaRepository<direccionCliente,Long>{
    
    List<direccionCliente> findByCliente(cliente cliente);
    
}
