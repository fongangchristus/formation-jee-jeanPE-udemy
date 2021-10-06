/**
 * 
 */
package com.directmedia.onlinestore.core;

import java.util.Arrays;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

/**
 * @author Christus
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Artist artiste1 = new Artist("Christus");
		Artist artiste2 = new Artist("Tagne");
		Artist artiste3 = new Artist("fingon");
		
		Work work1 = new Work("Cour Spring security");
		work1.setMainArtist(artiste1);
		
		Work work2 = new Work("commedi");
		work1.setMainArtist(artiste2);
		
		Work work3 = new Work("comedi plus plus");
		work1.setMainArtist(artiste3);

		Catalogue.listOfWorks.addAll(Arrays.asList(work1, work2, work3));
		
		for (Work theWork : Catalogue.listOfWorks) {
			System.out.println(theWork.getTitle());
		}
	}

}
