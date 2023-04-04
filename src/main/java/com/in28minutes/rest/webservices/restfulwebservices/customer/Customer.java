package com.in28minutes.rest.webservices.restfulwebservices.customer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Customer {
    private long id;
    private long mobileNo;
    private long age;
    private String firstName;
    private String lastName;
    private String gender;
    private BookHistory bookHistory;
}
