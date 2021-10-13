/*
* AUTHOR: Cole Suddarth
* FILE: Library.java
* ASSIGNMENT: Programming Assignment 4 - Library.java
* COURSE: CSc 210; Fall 2021
* PURPOSE: This program creates an instance of a library in Spitify.
* It hold all of the songs and artists in which can be viewed and played
* on Spitify. We can get a song in the library, add songs, remove songs,
* and return every song in the library.
*
* USAGE: 
* java PA4Main 
*
* --------Example Input-----------
* 
* --------------------------------
* This file takes no input to be constructed
* --------------------------------
* | Song firstSong = getSong(Happier);
* | addSong(song);
* | removeSong(Happier);
* | String rep = toString();
* 
* The commands shown above are all of the commands that are supported
* by this program. It is assumed that (except for some specific errors), 
* the input is well-formed, and matches the format shown above.
*/
import java.util.*;

public class Library {
	
	Set<Song> library;
	SortedSet<String> ts = new TreeSet<String>();
	
	/*
	 * Constructor in which constructs a new instance of class with hashset of all songs
	 * 
	 * @param None
	 * @return None
	 */
	public Library() {
		// constructs new instance of class with set of all songs
		library = new HashSet<Song>();
	}
	
	/*
	 * This returns the instance of class Song associated with the input title or null
	 * if the song does not exist
	 * 
	 * @param title - String representing title of instance class Song
	 * @return instance of class song associated with title if exists or null if it doesn't
	 */
	public Song getSong(String title) {
		// returns the Song associated with String title if it is in the library, or null if not
		for (Song song : library) {
			if (song.getTitle().equals(title)) {
				return song;
			}
		}
		return null;
	}
	
	/*
	 * This adds the instance of class song to the library and the name of the song to a sortedset
	 * 
	 * @param Song = an instance of class song
	 * @return = None
	 */
	public void addSong(Song song) {
		// adds songs to the library
		library.add(song);
		ts.add(song.getTitle());
	}
	
	/*
	 * This removes the song from the library and removes the name from the sortedset of names
	 * 
	 * @param Song = instance of class Song
	 * @return None
	 */
	public void removeSong(Song song) {
		// removes song from library if it exists
		for (Song libSong : library) {
			if (libSong.equals(song)) {
				library.remove(song);
				ts.remove(song.getTitle());
				return;
			}
		}
	}
	
	/*
	 * This creates a string representation of the library by printing every song in the library
	 * in alphabetical order
	 * 
	 * @param None
	 * @return string representing every song name in library
	 */
	public String toString() {
		// returns string representation of library
		// print in alphabetical order one song name per line
		String output = "";
		for (String title : ts) {
			output += getSong(title).toString() + "\n";
		}
		return output;
	}

}
