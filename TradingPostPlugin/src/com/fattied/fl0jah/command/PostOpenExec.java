package com.fattied.fl0jah.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PostOpenExec implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, 
			Command command, 
			String label, 
			String[] args) {

		return true;
	}

}
