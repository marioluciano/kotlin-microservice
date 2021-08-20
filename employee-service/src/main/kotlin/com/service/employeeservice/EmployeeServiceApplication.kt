package com.service.employee

import io.micronaut.runtime.Micronaut
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info

@OpenAPIDefinition(
        info =
                Info(
                        title = "Employees Management",
                        version = "1.0",
                        description = "Employee API",
                        contact =
                                Contact(
                                        url = "",
                                        name = "Mário Oliveira",
                                        email = "marioluciano@gmail.com"
                                )
                )
)
class EmployeeServiceApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Micronaut.run(EmployeeServiceApplication::class.java)
        }
    }
}
