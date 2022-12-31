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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Ricky Roque
 */
@Entity
@Table(name = "clientes")
public class cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;
    
    @Column(name = "tipoIdentificacion", length = 10)
    private String tipoIdentificacion;
    @Column(name = "numeroIdentificacion", length = 15, unique = true)
    private String numeroIdentificacion;
    @Column(name = "nombre", length = 50)
    private String nombre;
    @Column(name = "correo", length = 50)
    private String correo;
    @Column(name = "telefono", length = 10)
    private String telefono;
    
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "cliente")
    @JsonIgnore
    private Set<direccionCliente> direccionClientes = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    private direccion direccion;
    
    public cliente() {
    }

    public cliente(Long clienteId, String tipoIdentificacion, String numeroIdentificacion, String nombre, String correo, String telefono, direccion direccion) {
        this.clienteId = clienteId;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(direccion direccion) {
        this.direccion = direccion;
    }

    public Set<direccionCliente> getDireccionClientes() {
        return direccionClientes;
    }

    public void setDireccionClientes(Set<direccionCliente> direccionClientes) {
        this.direccionClientes = direccionClientes;
    }
    
}
