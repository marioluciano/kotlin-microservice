package com.service.employee.controller

import io.micronaut.http.annotation.Controller
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Controller("/employees")
open class EmployeeController(
        private val logger: Logger = LoggerFactory.getLogger(EmployeeController::class.java)
) {
    // @Inject
    // lateinit var repository:EmployeeRepository
}
