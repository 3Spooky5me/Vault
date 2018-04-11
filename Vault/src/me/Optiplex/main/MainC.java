package me.Optiplex.main;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MainC extends JavaPlugin{
	Plugin plugin;
	Player p ;
	String s "BEAST WAS HERE";
	
	public void onEnable() {
		plugin = this;
	}
	
	public void onDisable() {
		plugin = null;
	}
	public Plugin getPlugin() {
		return plugin;
	}
}
