package com.example.films.repository

import com.example.films.models.User
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Mono


interface UserRepository : ReactiveMongoRepository<User, Long> {
    fun findByUsername(name: String?): Mono<User?>?
}