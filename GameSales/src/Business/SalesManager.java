package Business;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public class SalesManager implements SalesService {

	@Override
	public void sale(Customer customer, Product product) {
		System.out.println(product.getProductName() + " is bought by : " + customer.getFirstName() + " price : "
				+ product.getProductPrice()+" $");

	}

	@Override
	public void campaignSale(Customer customer, Product product, Campaign campaign) {
		System.out.println(product.getProductName() + " is bought by " + customer.getFirstName()
				+ " with campaign : " + campaign.getCampaignName() + " and price : " + product.getProductPrice()+" $");

	}

}
