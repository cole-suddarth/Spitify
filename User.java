/*
* AUTHOR: Cole Suddarth
* FILE: User.java
* ASSIGNMENT: Programming Assignment 4 - User.java
* COURSE: CSc 210; Fall 2021
* PURPOSE: This program creates an instance of a user for the Spitify program.
* It creates the user surrounding a command line user name and password. With 
* this we have some methods which get the user name of a user, login a user, 
* and manipulate play lists for a user.
*
* USAGE: 
* java PA4Main 
*
* --------Example Input-----------
* name = Cole
* password = password
* --------------------------------
* | String username = User.getname();
* | boolean loginAttempt = User.attemptLogin(username, password);
* | User.userPlaylists.add(Playlist playlist);
* | User.selectPlaylists(String Throwbacks);
* | System.out.println(User.toString());
* 
* The commands shown above are all of the commands that are supported
* by this program. It is assumed that (except for some specific errors), 
* the input is well-formed, and matches the format shown above.
*/

import java.util.*;

public class User {
	
	String username;
	String userPassword;
	ArrayList<Playlist> userPlaylists = new ArrayList<Playlist>();
	
	
	/*
	 * A constructor which creates a new instance of the class User with
	 * attributes username = the first input argument and password = 
	 * the second user input argument
	 * 
	 * @param name = string
	 * @param password = string
	 * @return None
	 */
	public User(String name, String password) {
		username = name;
		userPassword = password;
	}
	
	/*
	 * Getter for the name of the instance of user class
	 * 
	 * @param None
	 * @return username = a string representing the User class attribute user name
	 */
	public String getName() {
		// returns name of user
		return username;
	}
	 
	/*
	 * Determines if a login is valid for a specific user
	 * 
	 * @param password = string representing the attempted password login for user
	 * @return true if password matches this instances saved password, false if not
	 */
	public boolean attemptLogin(String password) {
		// returns true if password is valid for user
		return password.equals(userPassword);
	}
	
	/*
	 * Adds a already created class of Playlist to a list of the users personal play lists
	 * 
	 * @param newPlaylist = instance of class Playlist
	 * @return None
	 */
	public void addPlaylist(Playlist newPlaylist) {
		// adds playlist to users playlist
		userPlaylists.add(newPlaylist);
	}
	
	/*
	 * Getter for the list of playlist names of this instance of class User
	 * 
	 * @param None
	 * @return userPlaylists = a list of type class Playlist
	 */
	public List<Playlist> getPlaylists() {
		// returns list of playlists of the user
		return userPlaylists;
	}
	
	/*
	 * Selects the play list the with name inputed and begins playing the play list
	 * 
	 * @param name = string representing name of playlist in playlistCollection
	 * @return None
	 */
	public void selectPlaylist(String name) {
		// selects playlist with name if user has it and plays it
		for (int i = 0; i < userPlaylists.size(); i++) {
			if (userPlaylists.get(i).getName().equals(name)) {
				// if playlist name is a playlist in userPlaylists then play it
				userPlaylists.get(i).play();
				return;
			}
		}
		
	}
	
	/*
	 * Returns information of the current instance of user such that it follows
	 * userName, numPlaylist playlists
	 * 
	 * @param None
	 * @return string in order shown above about current instance of class User
	 */
	public String toString() {
		// returns a string description of the user
		// name, numPlaylists playlists
		return " " + username + ", " + String.valueOf(userPlaylists.size()) + " playlists";
	}

}
