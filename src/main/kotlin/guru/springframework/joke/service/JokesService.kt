package guru.springframework.joke.service

import org.springframework.stereotype.Service


interface JokesService {

    fun getJoke(): String
}
