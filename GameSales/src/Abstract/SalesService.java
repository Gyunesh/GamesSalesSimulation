package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public interface SalesService {

	public void sale(Customer customer,Product product);
	public void campaignSale(Customer customer,Product product,Campaign campaign);
}
