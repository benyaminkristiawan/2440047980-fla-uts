package model;

import java.util.ArrayList;

public class UserType {

	private String name;
	private String benefit;
	private ArrayList<String> usernames;
	
	
	public UserType(String name, String benefit) {
		super();
		this.name = name;
		this.benefit = benefit;
		this.usernames = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public ArrayList<String> getUsernames() {
		return usernames;
	}

	public void addUsername(String username) {
		usernames.add(username);
	}

}
