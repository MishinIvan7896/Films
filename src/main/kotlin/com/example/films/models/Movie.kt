package com.example.films.models

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.ToString
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Data
@Builder
@AllArgsConstructor
@Document
@ToString
class Movie {
    @Id
    private var id: Long? = null
    private var title: String? = null
    private var director: String? = null

    fun getId() : Long? {
        return id
    }

    fun getTitle(): String? {
        return title
    }

    fun getDirector() : String? {
        return director
    }
}