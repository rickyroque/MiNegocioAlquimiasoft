/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.documentacion;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ricky Roque
 */
@Configuration
public class OpenApiDocumentacion {
    
    @Bean
    public OpenAPI getOpenApi(){
        return new OpenAPI()
                .components(new Components())
                .info(
                        new Info()
                        .title("Documentacion Sistema Mi Negocio")
                        .description("Se definen los endpoints necesarios para la aplicacion")
                )
                ;
    }
    
}
