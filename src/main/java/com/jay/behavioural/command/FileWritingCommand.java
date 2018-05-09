/**
 * 
 */
package com.jay.behavioural.command;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 9, 2018
 */
public class FileWritingCommand implements Command {

	FilesystemReciever filesystemReciever;

	public FileWritingCommand(FilesystemReciever filesystemReciever) {
		this.filesystemReciever = filesystemReciever;
	}

	@Override
	public void execute() {
		this.filesystemReciever.wirteFile();
	}
}
