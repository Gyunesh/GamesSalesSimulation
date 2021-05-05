package GameSalesProject;

import Business.CampaignManager;
import Business.CustomerManager;
import Business.ProductManager;
import Business.SalesManager;
import Business.VerificationManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer(1, "123456789", "Ali", "Veli", "25/05/1999");
		Customer customer2 = new Customer(2, "123456789", "Ahmet", "Yilmaz", "12/04/1978");
		Customer customer3 = new Customer(3, "123456789", "Ayse", "Develi", "04/08/2001");

		CustomerManager customerManager = new CustomerManager(new VerificationManager());
		customerManager.add(customer1);
		customerManager.delete(customer2);
		customerManager.update(customer3);
		
		System.out.println("-----------------------------------------------");

		Product product1 = new Product(1, "Game Of Thrones", 150, 25);
		Product product2 = new Product(2, "Power Rangers", 75, 12);
		Product product3 = new Product(3, "Super Mario", 25, 48);

		ProductManager productManager = new ProductManager();
		productManager.add(product1);
		productManager.delete(product2);
		productManager.update(product2);
		
		System.out.println("-----------------------------------------------");

		Campaign campaign1 = new Campaign(1, "Winter Discount", "All products has 10% discount.");
		Campaign campaign2 = new Campaign(2, "Valentines Day", "All products has 20% discount.");
		Campaign campaign3 = new Campaign(3, "Student's Festival", "Who show student Id has 30% discount.");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign2);
		campaignManager.delete(campaign3);
		campaignManager.update(campaign1);
		
		System.out.println("-----------------------------------------------");
		
		
		SalesManager salesManager=new SalesManager();
		salesManager.sale(customer3, product2);
		salesManager.sale(customer2, product1);
		
		System.out.println("-----------------------------------------------");
		
		salesManager.campaignSale(customer2, product3, campaign1);
		salesManager.campaignSale(customer1, product2, campaign2);
		

	}

}
