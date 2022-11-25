package model;

import builder.Director;

public class Post {
	private String title;
	private String content;
	private Director theme;
	private String picture;
	
	public Post(String title, String content, Director theme, String picture) {
		super();
		this.title = title;
		this.content = content;
		this.theme = theme;
		this.picture = picture;
	}
	
	public void show() {
		System.out.println("Tittle  : "+getTitle());
		System.out.println("Content : "+getContent());
		System.out.println("Theme   : "+getTheme());
		System.out.println("Picture : "+getPicture());
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Director getTheme() {
		return theme;
	}

	public void setTheme(Director theme) {
		this.theme = theme;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}
