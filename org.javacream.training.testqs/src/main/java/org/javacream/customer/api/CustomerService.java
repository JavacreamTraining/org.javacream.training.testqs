package org.javacream.customer.api;

public interface CustomerService {

	public Customer createCustomer(String lastame, String firstname);
	/**
	 * 
	 * @param lastname
	 * @param firstname
	 * @return customer or null
	 */
	Customer findCustomerByName(String lastname, String firstname);
	void update(Customer c);
	void delete(Customer c);
}
