package main;

import java.util.Scanner;

import adapter.genderAdapter;
import builder.Director;
import builder.GoldThemeBuilder;
import builder.HeroesBuilder;
import builder.PartyBuilder;
import builder.SerenityBuilder;
import builder.VIPThemeBuilder;
import factory.UserTypeFactory;
import model.History;
import model.Post;
import model.UserType;
import models.theme.GoldTheme;
import models.theme.Heroes;
import models.theme.Party;
import models.theme.Serenity;
import models.theme.VIPTheme;

public class Main {
	private static final Post post = null;
	Scanner scan = new Scanner(System.in);
	UserTypeFactory utf = new UserTypeFactory();
	
	public Main() {
		// TODO Auto-generated constructor stub
		int choose=0;
		UserTypeFactory factory;
		while (true) {

			System.out.println("Welcome!");
			System.out.println("1. Login");
			System.out.println("2. Exit");
			do {
				System.out.println(">>");
				choose=scan.nextInt();
				scan.nextLine();
			} while (choose < 1 || choose > 2);
			switch (choose) {
			case 1:
				factory = new UserTypeFactory();
				makeAccount(factory);
				break;
			case 2:
			System.exit(0);
			return;
			}
		}
	}

	public void makeAccount(UserTypeFactory factory) {
		// TODO Auto-generated method stub
		UserType user;
		String type;
		String gender;
		String username;
		do {
			System.out.println("Choose User Type [Standard | Gold | VIP ]: ");
			type = scan.nextLine();
		} while (!(type.equals("Standard") || type.equals("Gold") || type.equals("VIP")));
		
		do {
			System.out.println("Please input your Username [1-50 char]");
			username=scan.nextLine();
		} while (username.length()<1||username.length()>50);
		do {
			System.out.println("Please input your Gender [Male | Female]");
			gender=scan.nextLine();
		} while (!(gender.equals("Male") || gender.equals("Female") ));
		user= factory.make(type, username);
		
		//menu selanjutnya!
		int choice;
		while (true) {

			System.out.println("Hello!");
			System.out.println("1. Create Post");
			System.out.println("2. Show Posts");
			System.out.println("3. Show Profile");
			System.out.println("4. Exitt");
			do {
				System.out.println(">>");
				choice = scan.nextInt();
				scan.nextLine();
			} while (choice < 1 || choice > 4);
			switch (choice) {
			case 1:
				//createPost
				String title;
				String content;
				String theme = null;
				String picture;
				
				do {
					System.out.println("Please input your title : ");
					title=scan.nextLine();
				} while (title.length()<1||title.length()>100);
			
				if (type.equals("Standard")) {
					do {
						System.out.println("Please input your content : ");
						content=scan.nextLine();
					} while (content.length()<1||content.length()>500);
				}else {
					do {
						System.out.println("Please input your content : ");
						content=scan.nextLine();
					} while (content.length()<1||content.length()>1000);
				}
				
				if (type.equals("Standard")) {
					do {
						System.out.println("===============THEME MENU OPTION=============");
						System.out.println("1. Serenity");
						System.out.println("2. Party");
						System.out.println("3. Heroes");
						System.out.println(">>[Serenity|Party|Heroes]");
						theme=scan.nextLine();
					} while (!(theme.equals("Serenity") || theme.equals("Party") || theme.equals("Heroes")));
				}else if (type.equals("Gold")) {
					do {
						System.out.println("===============THEME MENU OPTION=============");
						System.out.println("1. Serenity");
						System.out.println("2. Party");
						System.out.println("3. Heroes");
						System.out.println("4. Gold");
						System.out.println(">>[Serenity|Party|Heroes|Gold]");
						theme=scan.nextLine();
					} while (!(theme.equals("Serenity") || theme.equals("Party") || theme.equals("Heroes")|| theme.equals("Gold")));
				}else if (type.equals("VIP")) {
					do {
						System.out.println("===============THEME MENU OPTION=============");
						System.out.println("1. Serenity");
						System.out.println("2. Party");
						System.out.println("3. Heroes");
						System.out.println("4. Gold");
						System.out.println("5. VIP ");
						System.out.println(">>[Serenity|Party|Heroes|Gold|VIP]");
						theme=scan.nextLine();
					} while (!(theme.equals("Serenity") || theme.equals("Party") || theme.equals("Heroes")|| theme.equals("Gold"))|| theme.equals("VIP"));
				}
				SerenityBuilder sb = new SerenityBuilder();
				PartyBuilder pb = new PartyBuilder();
				HeroesBuilder hb = new HeroesBuilder();
				GoldThemeBuilder gtb = new GoldThemeBuilder();
				VIPThemeBuilder vtb = new VIPThemeBuilder();
				if (theme.equals("Serenity")) {
					Director director = new Director(sb);
					director.buildSerenityTheme();
					Serenity serenity = sb.getTheme();
					System.out.println(serenity.getBackground().getName());
					System.out.println(serenity.getBackground().getPallete());
					System.out.println(serenity.getBorder().getType());
					System.out.println(serenity.getBorder().getWarna());
					System.out.println(serenity.getIcon().getPic());
					System.out.println(serenity.getMusic().getType());
				}else if (theme.equals("Party")) {
					Director director = new Director(pb);
					director.buildPartyTheme();;
					Party party = pb.getTheme();
					System.out.println(party.getBackground().getName());
					System.out.println(party.getBackground().getPallete());
					System.out.println(party.getBorder().getType());
					System.out.println(party.getBorder().getWarna());
					System.out.println(party.getIcon().getPic());
					System.out.println(party.getMusic().getType());
				}else if (theme.equals("Heroes")) {
					Director director = new Director(hb);
					director.buildHeroesTheme();
					Heroes heroes = hb.getTheme();
					System.out.println(heroes.getBackground().getName());
					System.out.println(heroes.getBackground().getPallete());
					System.out.println(heroes.getBorder().getType());
					System.out.println(heroes.getBorder().getWarna());
					System.out.println(heroes.getIcon().getPic());
					System.out.println(heroes.getMusic().getType());
				}else if (theme.equals("Gold")) {
					Director director = new Director(gtb);
					director.buildGoldTheme();
					GoldTheme gt = gtb.getTheme();
					System.out.println(gt.getBackground().getName());
					System.out.println(gt.getBackground().getPallete());
					System.out.println(gt.getBorder().getType());
					System.out.println(gt.getBorder().getWarna());
					System.out.println(gt.getIcon().getPic());
					System.out.println(gt.getMusic().getType());
				}else if (theme.equals("VIP")) {
					Director director = new Director(vtb);
					director.buildVIPTheme();
					VIPTheme vt = vtb.getTheme();
					System.out.println(vt.getBackground().getName());
					System.out.println(vt.getBackground().getPallete());
					System.out.println(vt.getBorder().getType());
					System.out.println(vt.getBorder().getWarna());
					System.out.println(vt.getIcon().getPic());
					System.out.println(vt.getMusic().getType());
				}
				
				
				do {
					System.out.println("Please upload your picture : ");
					picture=scan.nextLine();
				} while (picture.isEmpty());
				History history=History.getInstance();

				history.add(post);
				break;
			case 2:
				viewPost();
				break;
			case 3 :
				genderAdapter genreadapter = new genderAdapter(gender);
				System.out.println("Username : "+genreadapter.getGender(gender)+user.getUsernames());
				System.out.println("Your UserType"+user.getName());
				System.out.println("Your benefit"+user.getBenefit());
				break;
			case 4:
				return;
			}
		}
	}


	private void viewPost() {
		// TODO Auto-generated method stub
		History history = History.getInstance();
		if (history==null) {
			System.out.println("You did not post anything...");
		}
		history.showPost();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
