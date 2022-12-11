package concrete;

import java.util.Scanner;

import entities.Customer;
import entities.Inventory;

public class CustomerManager {
	
	
	
	Scanner scan = new Scanner(System.in);
			
	public void add(Customer customer) {
		System.out.println("--------------Kayıt Ol-----------\n");
		System.out.print("Ad : ");
		customer.setName(scan.next());
		System.out.print("Soyad : ");
		customer.setLastName(scan.next());
		System.out.print("Tc no : ");
		customer.setIdentiyNumber(scan.next());
		System.out.print("Kullanıcı adı : ");
		customer.setUserName(scan.next());
		System.out.print("E-mail : ");
		customer.setEmail(scan.next());
		System.out.print("Kullanıcı tipi [Öğrenci] veya [Normal] : ");
		customer.setRegisterType(scan.next());
		System.out.print("Şifre : ");
		customer.setPassword(scan.next());
		
		if(Validators.userValidator(customer)) {
			System.out.println("Başarıyla kayıt oluşturuldu.");
			
		}else {
			System.out.println("Kullanıcı adınız 6 ve Şifreniz 8 karakterden fazla olmalıdır...");
			
		}
	
		
	}
	
	public void delete(Customer customer) {
		System.out.println(customer.getUserName() + " kullanıcı isimli oyuncunun kayıtı silindi");
	}
	
	public void update(Customer customer) {

		
		
		System.out.println("Yeni şifre : ");
		customer.setPassword(scan.next());
		System.out.println("Yeni email : ");
		customer.setEmail(scan.next());
		
		if(Validators.updateValidator(customer)) {
			System.out.println("Bilgileriniz başarıyla güncellendi...");
		}else {
			System.out.println("Şifreniz 8 karakterden fazla olmalıdır");
		}
	}

	public void loadBalance(Customer customer,double balance) {
		
		if(balance > 0 && Validators.userValidator(customer)) {
			System.out.println("Bakiye : " + customer.getBalance());
			customer.setBalance(customer.getBalance() + balance);
			System.out.println("Hesabınıza " + balance + " TL yatırıldı");
			System.out.println("Güncel bakiyeniz : " + customer.getBalance());
		}
		
	}

	public void myGame(Inventory inventory,Customer customer) {
		
		if(Validators.userValidator(customer)) {
			System.out.print("Oyunlarınız : ");
			for(String inv : inventory.myInventory) {
				
					System.out.print(inv +", ");
				}
		}
		
	}
}


