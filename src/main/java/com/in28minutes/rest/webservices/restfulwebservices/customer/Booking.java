package com.in28minutes.rest.webservices.restfulwebservices.customer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Builder
public class Booking {
    private long hotelId;
    private LocalDate localDate;
}
