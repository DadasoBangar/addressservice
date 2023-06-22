package com.address.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

	private String cityName;
	private String tahshil;
	private String district;
	private String state;
	private String country;
}
