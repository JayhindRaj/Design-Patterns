/**
 * 
 */
package com.jay.behavioural.command;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 9, 2018
 */
public class WindowsFileSystem implements FilesystemReciever {
	@Override
	public void openFile() {
		System.out.println("Opening file in windows");

	}

	@Override
	public void wirteFile() {
		System.out.println("Writing file in windows");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in windows");
	}
}
