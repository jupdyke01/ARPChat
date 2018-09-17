package me.jupdyke01.rpchat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.jupdyke01.rpchat.commands.Global;
import me.jupdyke01.rpchat.commands.Local;
import me.jupdyke01.rpchat.commands.Shout;
import me.jupdyke01.rpchat.commands.Whisper;

public class Main extends JavaPlugin {

	public void onEnable() {
		getCommand("g").setExecutor(new Global());
		getCommand("w").setExecutor(new Whisper());
		getCommand("s").setExecutor(new Shout());
		Bukkit.getPluginManager().registerEvents(new Local(), this);
	}
	
}
