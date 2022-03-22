package com.me.movies.repository

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import src.main.kotlin.com.me.movies.model.Movie

@Repository
interface MovieRepository: ReactiveCrudRepository<Movie, String> {
}