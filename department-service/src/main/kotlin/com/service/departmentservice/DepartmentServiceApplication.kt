package com.service.department

import io.micronaut.runtime.Micronaut
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info

@OpenAPIDefinition(
        info =
                Info(
                        title = "Departments Management",
                        version = "1.0",
                        description = "Department API",
                        contact =
                                Contact(
                                        url = "",
                                        name = "Mário Oliveira",
                                        email = "marioluciano@gmail.com"
                                )
                )
)
class DepartmentServiceApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Micronaut.run(DepartmentServiceApplication::class.java)
        }
    }
}
