/**
 * 
 */
package com.jay.behavioural.command;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 9, 2018
 */
public class FileOpeningCommand implements Command {

	FilesystemReciever filesystemReciever;

	public FileOpeningCommand(FilesystemReciever filesystemReciever) {
		this.filesystemReciever = filesystemReciever;
	}

	@Override
	public void execute() {
		this.filesystemReciever.openFile();
	}
}
