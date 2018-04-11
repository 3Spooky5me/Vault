package me.Optiplex.main;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class MainC extends JavaPlugin{
	static String mainPrefix = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Vault" 
	+ ChatColor.DARK_GRAY + "]: " + ChatColor.GRAY;
	public void onEnable() {
		
	}
	public void onDisable() {
		
	}
	public static String getPrefix() {
		return mainPrefix;
	}
}
