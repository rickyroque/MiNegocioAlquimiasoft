/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.minegocio.servicios;

import com.minegocio.modelo.cliente;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricky Roque
 */
public class clienteServicioTest {
    
    public clienteServicioTest() {
    }

    @Test
    public void testGuardarCliente() {
        System.out.println("guardarCliente");
        cliente cliente = null;
        clienteServicio instance = new clienteServicioImpl();
        cliente expResult = null;
        cliente result = instance.guardarCliente(cliente);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testActualizarCliente() {
        System.out.println("actualizarCliente");
        cliente cliente = null;
        clienteServicio instance = new clienteServicioImpl();
        cliente expResult = null;
        cliente result = instance.actualizarCliente(cliente);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEliminarCliente() {
        System.out.println("eliminarCliente");
        Long clienteId = null;
        clienteServicio instance = new clienteServicioImpl();
        instance.eliminarCliente(clienteId);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListarNumeroIde() {
        System.out.println("listarNumeroIde");
        String numeroIdentificacion = "";
        clienteServicio instance = new clienteServicioImpl();
        List<cliente> expResult = null;
        List<cliente> result = instance.listarNumeroIde(numeroIdentificacion);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListarNombre() {
        System.out.println("listarNombre");
        String nombre = "";
        clienteServicio instance = new clienteServicioImpl();
        List<cliente> expResult = null;
        List<cliente> result = instance.listarNombre(nombre);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class clienteServicioImpl implements clienteServicio {

        public cliente guardarCliente(cliente cliente) {
            return null;
        }

        public cliente actualizarCliente(cliente cliente) {
            return null;
        }

        public void eliminarCliente(Long clienteId) {
        }

        public List<cliente> listarNumeroIde(String numeroIdentificacion) {
            return null;
        }

        public List<cliente> listarNombre(String nombre) {
            return null;
        }
    }
    
}
