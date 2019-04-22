package guru.springframework.joke.service

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service

@Service
class JokesServiceImpl : JokesService {

    val chuckNorrisQuotes: ChuckNorrisQuotes by lazy { ChuckNorrisQuotes() }

    override fun getJoke(): String = chuckNorrisQuotes.randomQuote
}
