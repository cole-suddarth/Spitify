/*
* AUTHOR: Cole Suddarth
* FILE: Song.java
* ASSIGNMENT: Programming Assignment 4 - Song.java
* COURSE: CSc 210; Fall 2021
* PURPOSE: This program creates an instance of a song for Spitify.
* This class features a song name, artist and number of times played.
* The class has getters for all these attributes and can also play the
* instance of the class
*
* USAGE: 
* java PA4Main 
*
* --------Example Input-----------
* Song(Happier, Marshmello);
* --------------------------------
* | String title = getTitle();
* | String artist = getArtist();
* | int plays = getTimesPlayed();
* | play();
* | String rep = toString();
* 
* The commands shown above are all of the commands that are supported
* by this program. It is assumed that (except for some specific errors), 
* the input is well-formed, and matches the format shown above.
*/

public class Song {
	
	String songName;
	String songArtist;
	int numPlays = 0;
	
	/*
	 *  Constructor for instance of class SOng, which has attributes songName and
	 *  songArtist which are initialized by command line arguments
	 *  
	 *  @param title = String
	 *  @param Artist = String
	 *  @return None
	*/
	public Song(String title, String artist) {
		// construct a new instance with specified song title and artist
		songName = title;
		songArtist = artist;
	}
	
	/*
	 * Getter for the tile of the instance of class song
	 * 
	 * @param None
	 * @return string representing songName attribute of instance
	 */
	public String getTitle() {
		// returns title of the song
		return songName;
	}
	
	/*
	 * Getter for the artist of the instance of class song
	 * 
	 * @param None
	 * @return string representing songArtist attribute of this instance
	 */
	public String getArtist() {
		// returns artist of song
		return songArtist;
	}
	
	/*
	 * Getter for the number of times a song has been played
	 * 
	 * @param None
	 * @return integer representing number of times a song has been played
	 */
	public int getTimesPlayed() {
		// returns number of times the song has been played
		return numPlays;
	}
	
	/*
	 * Plays the instance of class song by printing info about it and incrementing the number of plays
	 * 
	 * @param None
	 * @return None
	 */
	public void play() {
		// play the song by printing description and # of times its been played
		System.out.println(toString());
		numPlays++;
	}
	
	/*
	 * Gets a string representation of the song in order:
	 * Title by Artist, numPlays play(s)
	 * 
	 * @param None
	 * @return string representation of instance of class song
	 */
	public String toString() {
		// return string description of song
		// title by artist, timesPlayed   
		return getTitle() + " by " + getArtist() + ", " + getTimesPlayed() + " play(s)\n";
	}

}
