package me.Optiplex.Credits;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

import me.Optiplex.main.Utils;

public class Events implements Listener{
	private Credits credits;
	public Events() {
		this.credits = new Credits();
	}
	
	@EventHandler
	public void Pickup (PlayerPickupItemEvent e) {
		Player p = e.getPlayer();
		if(e.getItem().getItemStack().getType() != null) {
			if(e.getItem().getItemStack().getType().equals(credits.Credit)) {
				credits.addCredits(p, e.getItem().getItemStack().getAmount());
			}
		}
	}
	public void Death(PlayerDeathEvent e) {
		Player p = e.getEntity();
		List<ItemStack> s = e.getDrops();
		int i = credits.getCredits(p) / 20;
		credits.remCredits(p, i);
		s.add(new ItemStack (Material.EMERALD, i));
		e.getDrops().addAll(s);
		Utils.sm(p, "You died and dropped " + i + " Credits!");
	}
}
