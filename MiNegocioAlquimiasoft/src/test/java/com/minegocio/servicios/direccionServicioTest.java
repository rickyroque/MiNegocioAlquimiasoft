/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.minegocio.servicios;

import com.minegocio.modelo.direccion;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Ricky Roque
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class direccionServicioTest {
    
    public direccionServicioTest() {
    }

    @Test
    public void testGuardarDireccion() {
        System.out.println("guardarDireccion");
        direccion direccion = null;
        direccionServicio instance = new direccionServicioImpl();
        direccion expResult = null;
        direccion result = instance.guardarDireccion(direccion);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class direccionServicioImpl implements direccionServicio {

        @Override
        public direccion guardarDireccion(direccion direccion) {
            return null;
        }
    }
    
}
