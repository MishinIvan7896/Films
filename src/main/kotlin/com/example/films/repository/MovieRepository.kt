package com.example.films.repository

import com.example.films.models.Movie
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface MovieRepository : ReactiveMongoRepository<Movie, Long> {
    abstract fun save(movie: Movie?): Mono<Movie?>
}