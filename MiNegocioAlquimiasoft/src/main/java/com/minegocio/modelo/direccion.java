/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author Ricky Roque
 */
@Entity
@Table(name = "direcciones")
public class direccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long direccionId;
    
    @Column(name = "provincia", length = 50)
    private String provincia;
    @Column(name = "ciudad", length = 50)
    private String ciudad;
    @Column(name = "direccion", length = 50)
    private String direccion;
    @Column(name = "tipo", length = 50)
    private String tipo;
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "direccion")
    @JsonIgnore
    private Set<direccionCliente> direccionClientes = new HashSet<>();
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "direccion")
    @JsonIgnore
    private Set<cliente> clienteR = new HashSet<>();
    

    public direccion() {
    }

    public direccion(Long direccionId, String provincia, String ciudad, String direccion, String tipo) {
        this.direccionId = direccionId;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public Long getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(Long direccionId) {
        this.direccionId = direccionId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<direccionCliente> getDireccionClientes() {
        return direccionClientes;
    }

    public void setDireccionClientes(Set<direccionCliente> direccionClientes) {
        this.direccionClientes = direccionClientes;
    }

    public Set<cliente> getClienteR() {
        return clienteR;
    }

    public void setClienteR(Set<cliente> clienteR) {
        this.clienteR = clienteR;
    }

   
    
}
