package concrete;

import java.util.Scanner;

import entities.Campaign;
import entities.Customer;
import entities.Game;
import entities.Inventory;

public class GameManager {
	
	Customer customer;
	Inventory inventory;
	Campaign campaign;
	


	public GameManager(Customer customer, Inventory inventory,Campaign campaign) {
		super();
		this.customer = customer;
		this.inventory = inventory;
		this.campaign = campaign;
	}


	Scanner scan = new Scanner(System.in);
	
	
	public void gameBuy(Game game) {
			
			if( Validators.userValidator(customer) && customer.getBalance() > game.getPrice()) {
				if(campaign.getRegisterType().toUpperCase().equals(customer.getRegisterType().toUpperCase()) && campaign.getDiscountPercent() > 0) {
					System.out.println(game.getGameName() +  "isimli oyun " + campaign.getCampaignName()+ " Kampayası ile %"  +
					campaign.getDiscountPercent() +" indirimde !!");
					
					System.out.println(customer.getName() + " " + customer.getLastName() + " " + game.getGameName() + " isimli oyunu satın aldınız.");
					inventory.myInventory.add(game.getGameName());
					customer.setBalance(customer.getBalance() - (game.getPrice()-(game.getPrice()* campaign.getDiscountPercent()/100)));
					System.out.println("Güncel bakiyeniz : " + customer.getBalance());
				}else {
					System.out.println(customer.getName() + " " + customer.getLastName() + " " + game.getGameName() + " isimli oyunu satın aldınız.");
					inventory.myInventory.add(game.getGameName());
					customer.setBalance(customer.getBalance() - game.getPrice());
					System.out.println("Güncel bakiyeniz : " + customer.getBalance());
				}
				
			}
			
	}	
	
	
		
		
		
	}		
	

