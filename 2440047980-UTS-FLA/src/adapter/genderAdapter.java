package adapter;

import model.UserType;

public class genderAdapter {
	UserType username;
	String gender;
	
	public genderAdapter(UserType username, String gender) {
		super();
		this.username = username;
		this.gender = gender;
	}

	public String getGender(String str) {
		switch (str) {
		case "Male":
			return "Mr. "+ username.getUsernames();
		case "Female":
			return "Ms./Mrs. "+username.getUsernames();
		}
		return null;
	}
	

}
