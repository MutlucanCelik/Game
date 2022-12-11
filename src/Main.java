import concrete.CustomerManager;
import concrete.GameManager;
import entities.Campaign;
import entities.Customer;
import entities.Game;
import entities.Inventory;

public class Main {

	public static void main(String[] args) {
		
	
		Customer customer = new Customer();
		
		CustomerManager customerManager = new CustomerManager();
		
		Inventory inv = new Inventory();
		
		
		customerManager.add(customer);
		System.out.println();
		
		customerManager.loadBalance(customer, 1000);
		System.out.println();
		
		Campaign campaign = new Campaign(1,"Öğrenciysen Şanslısın",35,"Öğrenci");
		
		Game game1 = new Game(1,"Counter Strike Global",80,"Savaş");
		Game game2 = new Game(2,"Knight Online",100,"Savaş");
		Game game3 = new Game(3,"Rise Onlibe",100,"Savaş");
		
		GameManager gameManager = new GameManager(customer,inv,campaign);
		gameManager.gameBuy(game1);
		System.out.println();
		gameManager.gameBuy(game2);
		System.out.println();
		gameManager.gameBuy(game3);
		System.out.println();
		
	    customerManager.myGame(inv,customer);
	    System.out.println();
	    
	   
	    
	    System.out.println("---------------------------------------------------------------------------------------");
	    
	    Customer customer2 = new Customer();
	    
		Inventory inv2 = new Inventory();
	
		
		customerManager.add(customer2);
		System.out.println();
		
		customerManager.loadBalance(customer2, 1000);
		System.out.println();
		
		
		GameManager gameManager2 = new GameManager(customer2,inv,campaign);
		gameManager2.gameBuy(game1);
		System.out.println();
		gameManager2.gameBuy(game2);
		System.out.println();
		gameManager2.gameBuy(game3);
		System.out.println();
		
	    customerManager.myGame(inv2,customer2);
	    System.out.println();

	}

}
