package com.service.department.client

import com.service.department.model.Employee
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client(id = "employee-service", path = "/employees")
interface EmployeeClient {

    @Get("/department/{departmentId}")
    fun findByDepartment(departmentId: Long): MutableList<Employee>
}
