package com.jay.behavioural;

public class CommandDP {

	public static void main(String[] args) {
		
		FilesystemReciever filesystemReciever = FileSystemRecieverUtils.getUnderlyingFileSystem();
		
		Invoker invoker = new Invoker(new FileOpeningCommand(filesystemReciever));
		invoker.execute();
		
		invoker = new Invoker(new FileClosingCommand(filesystemReciever));
		invoker.execute();
		
		invoker = new Invoker(new FileWritingCommand(filesystemReciever));
		invoker.execute();
		
		
	}
}


interface FilesystemReciever {
	public void openFile();
	public void wirteFile();
	public void closeFile();
}

class WindowsFileSystem implements FilesystemReciever {
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

class LinuxFileSystem implements FilesystemReciever {
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


interface Command {
	public void execute();
}

class FileOpeningCommand implements Command {

	FilesystemReciever filesystemReciever;
	
	public FileOpeningCommand(FilesystemReciever filesystemReciever) {
		this.filesystemReciever = filesystemReciever;
	}
	
	@Override
	public void execute() {
		this.filesystemReciever.openFile();
	}
}

class FileWritingCommand implements Command {

	FilesystemReciever filesystemReciever;
	
	public FileWritingCommand(FilesystemReciever filesystemReciever) {
		this.filesystemReciever = filesystemReciever;
	}
	
	@Override
	public void execute() {
		this.filesystemReciever.wirteFile();
	}
}

class FileClosingCommand implements Command {

	FilesystemReciever filesystemReciever;
	
	public FileClosingCommand(FilesystemReciever filesystemReciever) {
		this.filesystemReciever = filesystemReciever;
	}
	
	@Override
	public void execute() {
		this.filesystemReciever.closeFile();
	}
}

class  Invoker {
	Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void execute() {
		this.command.execute();
	}
}

class FileSystemRecieverUtils {
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