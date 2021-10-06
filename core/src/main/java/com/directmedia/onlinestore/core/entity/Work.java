/**
 * 
 */
package com.directmedia.onlinestore.core.entity;

import java.io.Serializable;

/**
 * @author Christus
 *
 */
public class Work implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String genre;
	private int release;
	private String summary;
	private Artist mainArtist;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the release
	 */
	public int getRelease() {
		return release;
	}
	/**
	 * @param release the release to set
	 */
	public void setRelease(int release) {
		
		//this.release = (Integer) String.format("%03d", release);
		this.release = release;
	}
	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * @return the mainArtist
	 */
	public Artist getMainArtist() {
		return mainArtist;
	}
	/**
	 * @param mainArtist the mainArtist to set
	 */
	public void setMainArtist(Artist mainArtist) {
		this.mainArtist = mainArtist;
	}
	/**
	 * @param title
	 */
	public Work(String title) {
		
		this.title = title;
	}
	/**
	 * 
	 */
	public Work() {
		
	}
	
	
	
	
}
