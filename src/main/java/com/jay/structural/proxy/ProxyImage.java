/**
 * 
 */
package com.jay.structural.proxy;

import java.net.URL;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class ProxyImage implements Image {
	private URL url;

	public ProxyImage(URL url) {
		this.url = url;
	} // this method delegates to the real image 
	@Override
	public void displayImage() {
		RealImage real = new RealImage(url);

		real.displayImage(); 

	}


}
