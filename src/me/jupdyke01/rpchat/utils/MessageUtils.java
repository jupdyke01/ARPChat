package me.jupdyke01.rpchat.utils;

public class MessageUtils {

	public static String format(String str) { 
		String msg = str;
		msg = msg.replace("*",  "§a");
		msg = msg.replace("\"", "§f" + "\"");
		msg = msg.replace("(",  "§7" + "(");
		return msg;
	}
	
}
