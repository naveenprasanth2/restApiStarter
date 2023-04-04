package com.in28minutes.rest.webservices.restfulwebservices.todo;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
	private int id;
	private String userName;
	private String description;
	private LocalDate targetDate;
	private boolean done;

}