package com.fsdproject.receipe.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(schema = "fsdproject", name = "recipe")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private Long id;
	
	private String title;
	
	@ManyToOne
	private User user;
	
	private String image;
	
	private String description;
	
	private boolean vagitarian;
	
	private LocalDateTime  createdAt;
	
	private List<Long> likes= new ArrayList<>();

}
