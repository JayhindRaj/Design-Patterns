/**
 * 
 */
package com.jay.behavioural.command;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 9, 2018
 */
class  Invoker {
	Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void execute() {
		this.command.execute();
	}
}
