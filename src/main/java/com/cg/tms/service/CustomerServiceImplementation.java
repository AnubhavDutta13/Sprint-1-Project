package com.cg.tms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tms.entities.Customer;
import com.cg.tms.exceptions.CustomerNotFoundException;
import com.cg.tms.exceptions.PackageNotFoundException;
import com.cg.tms.exceptions.RouteNotFoundException;
import com.cg.tms.repository.ICustomerRepository;
@Service
public class CustomerServiceImplementation implements ICustomerService{
@Autowired
ICustomerRepository repo;
	@Override
	
	public Customer addCustomer(Customer customer) {
		validateId(customer.getCustomerId());
		validateCustomerName(customer.getCustomerName());
		validateCustomerAddress(customer.getAddress());
		repo.save(customer);
        
		return customer;
	}

	private void validateCustomerAddress(String address) {
		// TODO Auto-generated method stub
		
	}

	private void validateCustomerName(String customerName) {
		// TODO Auto-generated method stub
		
	}

	private void validateId(int customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(Customer customer) throws CustomerNotFoundException {
		
		return null;
	}

	@Override
	public Customer viewCustomer(int custid) throws CustomerNotFoundException {
		Optional<Customer> optional = repo.findById(custid);
		if(!optional.isPresent()) {
			throw new CustomerNotFoundException("Booking not found");
		}
		return optional.get();
	}
		

	@Override
	public List<Customer> viewAllCustomers(int packageId) throws PackageNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> viewCustomerList(int routeId) throws RouteNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
