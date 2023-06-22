package com.address.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.address.microservice.dto.AddressDTO;
import com.address.microservice.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;

	@PostMapping("/address")
	public String saveAddress(@RequestBody AddressDTO addressDTO) {

		String saveAddressDetails = addressService.saveAddressDetails(addressDTO);
		return saveAddressDetails;

	}

	@GetMapping("/address")
	public List<AddressDTO> getAddress()
	{
		List<AddressDTO> addressDTO=addressService.getAddressDetails();
		return addressDTO;
		
	}
	
@GetMapping("/address/{empId}")
public AddressDTO getAddress(@PathVariable String empId)
{
	AddressDTO addressDTO=addressService.getAddressDetailsById(empId);
	return addressDTO;
	
}
}