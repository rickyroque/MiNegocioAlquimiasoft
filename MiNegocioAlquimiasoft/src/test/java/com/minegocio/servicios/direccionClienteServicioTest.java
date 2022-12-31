/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.minegocio.servicios;

import com.minegocio.modelo.cliente;
import com.minegocio.modelo.direccionCliente;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricky Roque
 */
public class direccionClienteServicioTest {
    
    public direccionClienteServicioTest() {
    }

    @Test
    public void testGuardarDireccionCliente() {
        System.out.println("guardarDireccionCliente");
        direccionCliente direccionCliente = null;
        direccionClienteServicio instance = new direccionClienteServicioImpl();
        direccionCliente expResult = null;
        direccionCliente result = instance.guardarDireccionCliente(direccionCliente);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListarAdicionales() {
        System.out.println("listarAdicionales");
        cliente cliente = null;
        direccionClienteServicio instance = new direccionClienteServicioImpl();
        List<direccionCliente> expResult = null;
        List<direccionCliente> result = instance.listarAdicionales(cliente);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class direccionClienteServicioImpl implements direccionClienteServicio {

        public direccionCliente guardarDireccionCliente(direccionCliente direccionCliente) {
            return null;
        }

        public List<direccionCliente> listarAdicionales(cliente cliente) {
            return null;
        }
    }
    
}
