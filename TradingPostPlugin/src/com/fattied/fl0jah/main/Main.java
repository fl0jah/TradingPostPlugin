package com.fattied.fl0jah.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.fattied.fl0jah.command.PostOpenExec;
import com.fattied.fl0jah.events.PostListener;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		
		// Create listener to execute implemented 
		// code for specific events (Inventory...)
		Bukkit.getServer().getPluginManager().registerEvents(new PostListener(), this);
		
		// Register a command executor 
		// to execute code on command input
		this.getCommand("openpost").setExecutor(new PostOpenExec());
		
		System.out.println("[TradingPost] Plugin Successfully Enabled!");
	}
	
	@Override
	public void onDisable() {
		System.out.println("[TradingPost] Plugin Successfully Disabled!");
	}
}
