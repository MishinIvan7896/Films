package com.example.films.services

import com.example.films.models.Movie
import com.example.films.repository.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class MovieService(@Autowired val movieRepository: MovieRepository) {
    fun getAll(): Flux<Movie?>? {
        return movieRepository.findAll().switchIfEmpty(Flux.empty())
    }

    fun save(post: Movie): Mono<*>? {
        return movieRepository.save(post)
    }

    fun getById(id: Long): Mono<Movie?> {
        return movieRepository.findById(id)
    }

    fun update(movie: Movie): Mono<*>? {
        return movieRepository.save(movie)
    }

    fun delete(id: Long): Mono<*>? {
        return movieRepository.deleteById(id)
    }

}