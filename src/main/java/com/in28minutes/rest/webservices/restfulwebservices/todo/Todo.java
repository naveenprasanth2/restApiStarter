package com.in28minutes.rest.webservices.restfulwebservices.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo {

	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private String description;
	private LocalDate targetDate;
	private boolean done;

}