package uy.edu.ort.ortspringbootkotlin

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class OrtSpringBootKotlinApplication

@RestController
class PersonaController(@Value("\${personas.dummy}") val personasDummy: String) {

    @GetMapping("personas")
    fun findPersonas() = personasDummy.split(",").map(String::trim)
}

fun main(args: Array<String>) {
    SpringApplication.run(OrtSpringBootKotlinApplication::class.java, *args)
}
