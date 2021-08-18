package com.service.organization.client

import com.service.organization.model.Employee
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client(id = "employee-service", path = "/employees")
interface EmployeeClient {

    @Get("/organization/{organizationId}")
    fun findByOrganization(organizationId: Long): MutableList<Employee>
}
