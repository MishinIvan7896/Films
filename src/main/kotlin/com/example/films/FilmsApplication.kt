package com.example.films

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class FilmsApplication

fun main(args: Array<String>) {
	runApplication<FilmsApplication>(*args)
}
