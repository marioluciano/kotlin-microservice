package com.sample.kotlinmicroservice.repositories

import com.sample.kotlinmicroservice.model.Person
import org.springframework.stereotype.Repository

@Repository
class PersonRepository {
    val persons: MutableList<Person> = ArrayList()

    fun findById(id: Int): Person? {
        return persons.singleOrNull { it.id == id }
    }

    fun findAll(): List<Person> {
        return persons
    }

    fun save(person: Person): Person {
        person.id = (persons.maxByOrNull { it.id!! }?.id ?: 0) + 1
        persons.add(person)
        return person
    }

    fun update(person: Person): Person {
        val index = persons.indexOfFirst { it.id == person.id }
        if (index >= 0) {
            persons[index] = person
        }
        return person
    }

    fun removeById(id: Int): Boolean {
        return persons.removeIf { it.id == id }
    }
}