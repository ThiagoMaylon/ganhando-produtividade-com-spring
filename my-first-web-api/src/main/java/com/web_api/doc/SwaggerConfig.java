package com.web_api.doc;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Value("${springdoc.version}")
    private String appVersion;

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/**")
                .build()
                .addAllOpenApiCustomizer(openApi -> openApi.info(apiInfo()));
    }

    private Info apiInfo() {
        return new Info()
                .title("Title - Rest API")
                .description("API exemplo de uso de Springboot REST API")
                .version(appVersion)
                .termsOfService("Termo de uso: Open Source")
                .contact(new Contact()
                        .name("Seu nome")
                        .url("http://www.seusite.com.br")
                        .email("voce@seusite.com.br"))
                .license(new License()
                        .name("Licença - Sua Empresa")
                        .url("http://www.seusite.com.br"));
    }
}
