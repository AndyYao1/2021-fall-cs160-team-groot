package com.cs160groot.FoodFinder.Entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class AppUser {
	@Id
	private int userID;
	
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private List<Integer> uploaded;
	private List<Integer> favorited;
	private Preferences preferences;
	
	public AppUser() {
		// TODO Auto-generated constructor stub
	}
	
	public AppUser(int userID, String firstName, String lastName, String email, String username, String password, 
			List<Integer> uploaded, List<Integer> favorited, Preferences preferences) {
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.uploaded = uploaded;
		this.favorited = favorited;
		this.preferences = preferences;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Integer> getUploaded() {
		return this.uploaded;
	}
	
	public void setUploaded(List<Integer> uploaded) {
		this.uploaded = uploaded;
	}
	
	public List<Integer> getFavorited() {
		return this.favorited;
	}
	
	public void setFavorited(List<Integer> favorited) {
		this.favorited = favorited;
	}
	
	public Preferences getPreferences(){
		return this.preferences;
	}
	
	public void setPreferences(Preferences preferences) {
		this.preferences = preferences;
	}

}
