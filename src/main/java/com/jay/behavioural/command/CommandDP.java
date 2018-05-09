package com.jay.behavioural.command;

public class CommandDP {
	public static void main(String[] args) {
		FilesystemReciever filesystemReciever = FileSystemRecieverUtils
				.getUnderlyingFileSystem();

		Invoker invoker = new Invoker(
				new FileOpeningCommand(filesystemReciever));
		invoker.execute();

		invoker = new Invoker(new FileClosingCommand(filesystemReciever));
		invoker.execute();

		invoker = new Invoker(new FileWritingCommand(filesystemReciever));
		invoker.execute();
	}
}