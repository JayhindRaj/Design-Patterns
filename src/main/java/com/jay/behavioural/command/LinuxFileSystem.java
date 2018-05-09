package com.jay.behavioural.command;

public class LinuxFileSystem implements FilesystemReciever {
	@Override
	public void openFile() {
		System.out.println("Opening file in Linux");

	}

	@Override
	public void wirteFile() {
		System.out.println("Writing file in Linux");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in Linux");
	}
}
