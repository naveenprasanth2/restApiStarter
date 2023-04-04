package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import com.in28minutes.rest.webservices.restfulwebservices.customer.BookHistory;
import com.in28minutes.rest.webservices.restfulwebservices.customer.Booking;
import com.in28minutes.rest.webservices.restfulwebservices.customer.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/basicauth")
	public String basicAuthCheck() {
		return "Success";
	}


	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World V2";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

	@GetMapping(path = "/hello-world-customer")
	public Customer customer() {
		return Customer.builder().id(11).age(22).firstName("naveen")
				.lastName("prasanth")
				.gender("male")
				.mobileNo(85084708289L)
				.bookHistory(BookHistory.builder()
						.bookings(List.of(Booking.builder().hotelId(123).localDate(LocalDate.now().plusDays(1)).build())).build())
				.build();
	}
}
