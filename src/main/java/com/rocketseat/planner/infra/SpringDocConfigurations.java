package com.rocketseat.planner.infra;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;

public class SpringDocConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Planner de Viagens")
                        .description("API Rest da aplicação Planner, contendo as funcionalidades de CRUD de Agendamento de viagens, adicionar atividades e convidar amigos")
                        .contact(new Contact()
                                .name("Time Backend")
                                .email("danieldev.queiroz@gmail.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://planner/api/licenca")));
    }
}
