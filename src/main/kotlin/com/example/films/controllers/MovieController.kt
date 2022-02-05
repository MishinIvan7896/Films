package com.example.films.controllers

import com.example.films.models.Movie
import com.example.films.services.MovieService
import lombok.AllArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@AllArgsConstructor
@RestController
@RequestMapping("movies")
class MovieController(@Autowired val movieService: MovieService) {

    @GetMapping
    fun getAll(): Flux<Movie?>? {
        println("movies :: ")
        return movieService.getAll()
    }

    @PostMapping
    fun save(@RequestBody movie: Movie): Mono<*>? {
        println(
            "will insert movie ::  id = " + movie.getId() + " title = " + movie.getTitle() + "  director: " + movie.getDirector()
        )
        return movieService.save(movie)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Mono<Movie?>? {
        println("get Movie with id = $id ")
        return movieService.getById(id)
    }

    @PutMapping("/{id}")
    fun updateById(@PathVariable id: Long, @RequestBody movie: Movie): Mono<*>? {
        println("update the Movie :: id = " + movie.getId() + " title = " + movie.getTitle() + "  director: " + movie.getDirector())
        return movieService.update(movie)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): Mono<*>? {
        println("will delete Post with id = $id ")
        return movieService.delete(id)
    }

}