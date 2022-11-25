package model;

import java.util.Vector;

public class History {
//class singleton
	private static History history;
	private Vector <Post> posts = new Vector<>();
	public static History getInstance() {
		if(history==null) {
			history = new History();
		}return history;
	}
	
	public void add(Post post) {
		posts.add(post);
	}
	
	public void showPost() {
		System.out.println("History of your Post");
		System.out.println("==================================");
		int count = 1;
		for (Post p:posts) {
			System.out.println(count+".");p.show();
			count+=1;
		}
	}
}
