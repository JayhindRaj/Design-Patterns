/**
 * 
 */
package com.jay.behavioural.command;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 9, 2018
 */
public class FileSystemRecieverUtils {


	public static FilesystemReciever getUnderlyingFileSystem() {
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		if(osName.contains("Windows")){
			return new WindowsFileSystem();
		} else {
			return new LinuxFileSystem();
		}
	}


}
