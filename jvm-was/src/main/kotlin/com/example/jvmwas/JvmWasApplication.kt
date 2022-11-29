package com.example.jvmwas

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JvmWasApplication

fun main(args: Array<String>) {
  runApplication<JvmWasApplication>(*args)
}
