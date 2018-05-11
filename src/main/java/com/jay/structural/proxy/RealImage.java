/**
 * 
 */
package com.jay.structural.proxy;

import java.net.URL;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class RealImage implements Image{  
	public RealImage(URL url)   {  
		//load up the image      
		loadImage(url);   }  
	@Override
	public void displayImage()   {    
		//		display the image 
	}  
	//a method that only the real image has   
	private void loadImage(URL url)  {    
		//do resource intensive operation to load image  }}
	}
}
