package me.Optiplex.main;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

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
  static String mainPrefix = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Vault" 
	+ ChatColor.DARK_GRAY + "]: " + ChatColor.GRAY;
	public static String getPrefix() {
		return mainPrefix;
}
