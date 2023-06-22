package com.address.microservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.address.microservice.dto.AddressDTO;

@Service
public interface AddressService {

	String saveAddressDetails(AddressDTO addressDTO);

	AddressDTO getAddressDetailsById(String empId);

	List<AddressDTO> getAddressDetails();

}
