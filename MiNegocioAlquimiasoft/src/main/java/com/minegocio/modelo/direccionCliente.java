/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ricky Roque
 */
@Entity
public class direccionCliente {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long direccionclienteId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private cliente cliente;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private direccion direccion;

    public direccionCliente() {
    }

    public direccionCliente(Long direccionclienteId, cliente cliente, direccion direccion) {
        this.direccionclienteId = direccionclienteId;
        this.cliente = cliente;
        this.direccion = direccion;
    }

    public Long getDireccionclienteId() {
        return direccionclienteId;
    }

    public void setDireccionclienteId(Long direccionclienteId) {
        this.direccionclienteId = direccionclienteId;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(direccion direccion) {
        this.direccion = direccion;
    }
    
}
