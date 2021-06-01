package com.tarento.sbdock.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
	 
	    private Integer id;
	    private String first_name;
	    private String last_name;
	    private String address;
	    private String street;
	    private String city;
	    private Long pincode;
	    private String state;
	    private String country;
}
