package Business;

import Abstract.VerificationService;
import Entities.Customer;

public class VerificationManager implements VerificationService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		
	}

}
