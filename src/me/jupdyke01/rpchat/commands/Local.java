package me.jupdyke01.rpchat.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.jupdyke01.rpchat.utils.MessageUtils;
import net.md_5.bungee.api.ChatColor;

public class Local implements Listener {

	@EventHandler
	public void chatEvent(AsyncPlayerChatEvent e) {
		e.setCancelled(true);
		for (Player p : Bukkit.getOnlinePlayers()) {
			if (e.getPlayer().getLocation().distance(p.getLocation()) < 20) {
				p.sendMessage(ChatColor.RESET + e.getPlayer().getDisplayName() + " " + ChatColor.WHITE + MessageUtils.format(e.getMessage()));
			}
		}
	}
	
}
