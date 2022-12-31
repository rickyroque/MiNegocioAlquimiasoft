/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.minegocio.repositorio;

import com.minegocio.modelo.direccion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ricky Roque
 */
public interface direccionRepositorio extends JpaRepository<direccion,Long>{
    
}
