package com.sample.kotlinmicroservice.controllers

import com.sample.kotlinmicroservice.model.Person
import com.sample.kotlinmicroservice.repositories.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/persons")
class PersonController {

    @Autowired lateinit var repository: PersonRepository

    @GetMapping("/{id}") fun findById(@PathVariable id: Int): Person? = repository.findById(id)

    @GetMapping fun findAll(): List<Person> = repository.findAll()

    @PostMapping fun add(@RequestBody person: Person): Person = repository.save(person)

    @PutMapping fun update(@RequestBody person: Person): Person = repository.update(person)

    @DeleteMapping("/{id}") fun remove(@PathVariable id: Int): Boolean = repository.removeById(id)
}
