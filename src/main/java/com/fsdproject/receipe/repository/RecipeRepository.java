package com.fsdproject.receipe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdproject.receipe.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

	List<Recipe> findAllByOrderByCreatedAtDesc();
}
