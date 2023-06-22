package com.address.microservice.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.address.microservice.dto.AddressDTO;
import com.address.microservice.entity.AddressEntity;
import com.address.microservice.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Override
	public String saveAddressDetails(AddressDTO addressDTO) {
		AddressEntity addressEntity=new AddressEntity();
		return null;
	}

	@Override
	public AddressDTO getAddressDetailsById(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AddressDTO> getAddressDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
