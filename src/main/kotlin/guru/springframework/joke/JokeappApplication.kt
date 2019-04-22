package guru.springframework.joke

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JokeappApplication

fun main(args: Array<String>) {
    runApplication<JokeappApplication>(*args)
}
