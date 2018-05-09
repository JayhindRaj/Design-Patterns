/**
 * 
 */
package com.jay.behavioural.command;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 9, 2018
 */
public class FileClosingCommand implements Command {

	FilesystemReciever filesystemReciever;

	public FileClosingCommand(FilesystemReciever filesystemReciever) {
		this.filesystemReciever = filesystemReciever;
	}

	@Override
	public void execute() {
		this.filesystemReciever.closeFile();
	}
}
