package me.Optiplex.main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Utils {
	public void broadCast(String s) {
		for(Player p : Bukkit.getOnlinePlayers()) {
			p.sendMessage(MainC.getPrefix() + s);
		}
	}

	public void sm(Player p , String s) {
		p.sendMessage(MainC.getPrefix() + s);
	}
	
	

}
