package deca.chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Notice implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(args.length == 0) {
			return false;
		}
		else {
			Bukkit.broadcastMessage("["+ChatColor.LIGHT_PURPLE+""+ChatColor.BOLD+"Notice"+ChatColor.RESET+"] "+args[0]);
		}
		return true;
	}
}
