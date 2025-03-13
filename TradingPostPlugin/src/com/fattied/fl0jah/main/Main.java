package com.fattied.fl0jah.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		System.out.println("[TradingPost] Plugin Successfully Enabled!");
	}
	
	@Override
	public void onDisable() {
		System.out.println("[TradingPost] Plugin Successfully Disabled!");
	}
}
