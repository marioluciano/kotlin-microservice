package com.service.organization

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = Info(
                title = "Organizations Management",
                version = "1.0",
                description = "Organization API",
                contact = Contact(url = "", name = "Mário Oliveira", email = "marioluciano@gmail.com")
        )
)
class OrganizationServiceApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Micronaut.run(OrganizationServiceApplication::class.java)
        }
    }

}