package me.jupdyke01.rpchat.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Global implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (!(sender instanceof Player)) {
			sender.sendMessage("You must be a player to use this!");
			return true;
		}
		if (args.length == 0) {
			sender.sendMessage("Please enter a message");
			return true;
		}
		Player p = (Player) sender;

		String msg = "";
		for (String str : args) {
			msg = msg + (str + " ");
		}

		for (Player pP : Bukkit.getOnlinePlayers()) {
			pP.sendMessage(ChatColor.GREEN + "[Global] " + ChatColor.RESET + p.getName() + ChatColor.GRAY + ": " + msg);
		}


		return true;
	}

}
