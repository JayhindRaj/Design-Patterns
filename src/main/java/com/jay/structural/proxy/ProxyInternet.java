/**
 * 
 */
package com.jay.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class ProxyInternet implements Internet {

	private Internet internet = new RealInternet();
	private static List<String> bannedSites;

	static {
		bannedSites = new ArrayList<String>();
		bannedSites.add("abc.com");
		bannedSites.add("pqr.com");
		bannedSites.add("msn.bingo.com");
		bannedSites.add("youtube.com.com");
		bannedSites.add("capgemini.com");
	}

	@Override
	public void connectTo(String serverHost) throws Exception {
		if (bannedSites.contains(serverHost)) {
			throw new Exception("Access denied!!!");
		}
		internet.connectTo(serverHost);
	}
}
