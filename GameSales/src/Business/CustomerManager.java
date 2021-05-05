package Business;

import Abstract.CustomerService;

import Entities.Customer;

public class CustomerManager implements CustomerService {

	private VerificationManager verificationManager;
	
	public CustomerManager(VerificationManager verificationManager) {
		
		this.verificationManager=verificationManager;
	}
	
	
	@Override
	public void add(Customer customer) {
		
		if(verificationManager.checkIfRealPerson(customer)) {
			System.out.println("Customer added : "+ customer.getFirstName());
		}else {
			System.out.println("Not a valid person!");
		}
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Customer updated : "+ customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Customer deleted : "+ customer.getFirstName());
		
	}

}
