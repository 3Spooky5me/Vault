package me.Optiplex.Credits;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class Events implements Listener{
	private Credits credits;
	public void Events() {
		
		this.credits = new Credits();
	}
	public Credits getCredits() {
		return this.credits;
	}
	
	@EventHandler
	public void Pickup (PlayerPickupItemEvent e) {
	 
	}
}
