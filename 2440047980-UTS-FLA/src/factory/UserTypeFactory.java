package factory;

import model.Gold;
import model.Standard;
import model.UserType;
import model.VIP;

public class UserTypeFactory {
	public Standard standard;
	public Gold gold;
	public VIP vip;
	//Factory method
	public UserType make(String str, String name) {
		switch (str) {
		case "Standard":
			System.out.println("You are choosing Standard Type...");
			System.out.println("Your benefits is that you can post up to 500 characters maximum ");
			System.out.println();
			return new Standard(name);

		case "Gold":
			System.out.println("You are choosing Gold Type...");
			System.out.println("Your benefits is that you can post up to 1000 characters maximum, Gold theme is available");
			System.out.println();
			return new Gold(name);
			
		case "VIP":
			System.out.println("You are choosing VIP Type...");
			System.out.println("Your benefits is that you can post up to 1000 characters maximum , Gold and VIP theme is available");
			System.out.println();
			return new VIP(name);
		}
		
		return null;
	}
}
