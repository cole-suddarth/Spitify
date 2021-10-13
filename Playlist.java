/*
* AUTHOR: Cole Suddarth
* FILE: Playlist.java
* ASSIGNMENT: Programming Assignment 4 - Playlist.java
* COURSE: CSc 210; Fall 2021
* PURPOSE: This program creates an instance of a play list in Spitify.
* It holds a name of the playlist and all the songs in a playlist, in which
* songs can be added removed, and the playlist can be played
*
* USAGE: 
* java PA4Main 
*
* --------Example Input-----------
* Playlist(Throwbacks);
* Playlist(Thrwobacks, lib); // where lib represents a previously established playlist
* --------------------------------
* | String playlistName = getName();
* | addSong(song);
* | play();
* | removeSong(Happier);
* 
* The commands shown above are all of the commands that are supported
* by this program. It is assumed that (except for some specific errors), 
* the input is well-formed, and matches the format shown above.
*/
import java.util.*;

public class Playlist {
	
	String playlistName;
	List<Song> playlistContents;
	
	/*
	 * Constructs an instance of playlist, in which it is initialized with a name
	 * and empty contents
	 * 
	 * @param name = string
	 * @return None
	 */
	public Playlist(String name) {
		//constructs a new instance of the Playlist class with specified name
		playlistName = name;
		playlistContents = new ArrayList<Song>();
	}
	
	/*
	 * Constructs an instance of playlist in which it is initialized with a name
	 * and has contents of a previously established list of class songs
	 * 
	 * @param name - String
	 * @param contents - List<Song> list of instances of class song
	 * @return None
	 */
	public Playlist(String name, List<Song> contents) {
		// constructs a new playlist class with specified name and songs
		playlistName = name;
		playlistContents = new ArrayList<Song>();
		playlistContents = contents;
	}
	
	/*
	 * Getter for the name of the playlist
	 * 
	 * @param None
	 * @return playlistName = String
	 */
	public String getName() {
		// returns the name of the playlist
		return playlistName;
	}
	
	/*
	 * Adds an instance of class song to the playlist
	 * 
	 * @param song - instance of class song
	 * @return None
	 */
	public void addSong(Song song) {
		// add specified song to the playlist
		playlistContents.add(song);
	}
	
	/*
	 * Plays the playlist by printing the information about each song in the playlist
	 * 
	 * @param None
	 * @return None
	 */
	public void play() {
		// plays playlist by printing each name, remember song has its own toString method
		for (Song song : playlistContents) {
			song.play();
		}
	}
	
	/*
	 * Removes an instance of class song from a playlist if it exists in the playlist
	 * 
	 * @param song = instance of class song
	 * @return None
	 */
	public void removeSong(Song song) {
		// remove song from playlist if it exists
		if (playlistContents.contains(song)) {
			playlistContents.remove(song);
		}
	}

}
