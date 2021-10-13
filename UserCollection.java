/*
* AUTHOR: Cole Suddarth
* FILE: UserCollection.java
* ASSIGNMENT: Programming Assignment 4 - UserCollection.java
* COURSE: CSc 210; Fall 2021
* PURPOSE: This program creates an instance of a userCollection for Spitify.
* It creates a TreeSet of all the users, that can be created. The file can 
* also login a user, addUsers and return the collection of users.
*
* USAGE: 
* java PA4Main 
*
* --------Example Input-----------
* 
* --------------------------------
* This file takes no input to be constructed
* --------------------------------
* | boolean userExist = userExists(String cole);
* | User curUser = login(String cole, String password);
* | addUser(curUser);
* | String users = toString(); 
* 
* The commands shown above are all of the commands that are supported
* by this program. It is assumed that (except for some specific errors), 
* the input is well-formed, and matches the format shown above.
*/

import java.util.*;

public class UserCollection {
	/*
	 * This function/class is a comparator to keep the users in alphabetical order
	 */
	class userNameComparator implements Comparator<User> {
 		public int compare(User u1, User u2) {
 			return u1.getName().compareTo(u2.getName());
 		}
	}
	
	TreeSet<User> allUsers;
	
	/*
	 * Constructor for UserCollection to create new TreeSet of all users on Spitify
	 * 
	 * @param = none
	 * @return = none
	 */
	public UserCollection() {
		// constructs a UserCollection class
		allUsers = new TreeSet<User>(new userNameComparator());
	}
	
	/*
	 * This function check if a user with username exists in the collection of all users
	 * 
	 * @param username = String representing username
	 * @return true if user exists in collection, false if does not
	 */
	public boolean userExists(String username) {
		// returns true if user with username exists
		for (User user : allUsers) {
			if (user.getName().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * This function logins the user to access their information of class User
	 * 
	 * @param username = string representing username
	 * @param password = string representing password
	 * @return the instance of class User associated with name and password or null if none exists
	 */
	public User login(String username, String password) {
		// returns user associated with name and password or null if failed login
		if (userExists(username)) {
			// return user from userCollection
			for (User curUser : allUsers) {
				if (curUser.getName().equals(username) && curUser.attemptLogin(password)) {
					return curUser;
				}
			}
		}
		return null;
	}
	
	/*
	 * This function adds the user to the collection of allUsers
	 * 
	 * @param add - instance of class User
	 * @return None
	 */
	public void addUser(User add) {
		// adds this user to collection of all users
		//
			allUsers.add(add);
	}
	
	/*
	 * This function returns a collection of all users in alphabetical order that follows:
	 * { username1: 0 playlists, username2: 2 playlists,}
	 * 
	 * @param None
	 * @return string representing all users in collection
	 */
	public String toString() {
		// returns a string description of all user in alphabetical order
		String output = "{";
		for (User curUser : allUsers) {
			output += curUser.getName() + ": " + curUser.getPlaylists().size() + " playlists,";
		}
		output += "}\n";
		return output;
	}
	
	

}
