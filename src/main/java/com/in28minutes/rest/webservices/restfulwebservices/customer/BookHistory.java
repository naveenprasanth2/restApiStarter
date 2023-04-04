package com.in28minutes.rest.webservices.restfulwebservices.customer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
public class BookHistory {
    List<Booking> bookings;
}
