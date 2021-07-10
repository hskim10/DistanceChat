package deca.chat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import net.md_5.bungee.api.ChatColor;

public class Functions {
	public static void f1(CommandSender sender,String[] args) {
		ExecutorService ep = Executors.newCachedThreadPool();
		ep.execute(() -> {
			Player p = (Player)sender;
			String name = p.getName();
			String data = "";
			for (int i = 0; i < args.length; i++) {
				data = data + args[i]+" ";
			}
			Location l = p.getLocation();
			int centerx = (int)l.getX();
			int centery = (int)l.getY();
			int centerz = (int)l.getZ();
			int maxx = centerx + 10;
			int maxz = centerz + 10;
			int maxy = centery + 9;
			int lowestx = centerx - 10;
			int lowestz = centerz - 10;
			int lowesty = centery - 9;
			for(Player n : Bukkit.getOnlinePlayers()) {
				if(((int)n.getLocation().getX() <= maxx && (int)n.getLocation().getZ() <= maxz) && ((int)n.getLocation().getX() >= lowestx && (int)n.getLocation().getZ() >= lowestz)) {
					if((int)n.getLocation().getY() <= maxy && (int)n.getLocation().getY() >= lowesty) {
						n.sendMessage("["+ChatColor.AQUA+"Quiet"+ChatColor.RESET+"] "+name + " : "+ data);
					}
				}
			}
			return;
		});
	}
	public static void f2(AsyncPlayerChatEvent e) {
		ExecutorService ep = Executors.newCachedThreadPool();
		ep.execute(() -> {
			Player p = e.getPlayer();
			int centerx = (int)p.getLocation().getX();
			int centery = (int)p.getLocation().getY();
			int centerz = (int)p.getLocation().getZ();
			int mx = centerx + 100;
			int my = centery + 30;
			int mz = centerz + 100;
			int lx = centerx - 100;
			int ly = centery - 30;
			int lz = centerz - 100;
			for(Player n : Bukkit.getOnlinePlayers()) {
				if(((int)n.getLocation().getX() <= mx && (int)n.getLocation().getZ() <= mz) && ((int)n.getLocation().getX() >= lx && (int)n.getLocation().getZ() >= lz)) {
					if((int)n.getLocation().getY() <= my && (int)n.getLocation().getY() >= ly) {
						n.sendMessage(p.getName() + " : "+ e.getMessage());
					}
				}
			}
			return;
		});
	}
	public static void f3(CommandSender sender, String[] args) {
		ExecutorService ep = Executors.newCachedThreadPool();
		ep.execute(() -> {
			Player p = (Player)sender;
			String name = p.getName();
			String data = "";
			for (int i = 0; i < args.length; i++) {
				data = data + args[i]+" ";
			}
			Location l = p.getLocation();
			int centerx = (int)l.getX();
			int centery = (int)l.getY();
			int centerz = (int)l.getZ();
			int maxx = centerx + 1000;
			int maxz = centerz + 1000;
			int maxy = centery + 90;
			int lowestx = centerx - 1000;
			int lowestz = centerz - 1000;
			int lowesty = centery - 90;
			for(Player n : Bukkit.getOnlinePlayers()) {
				if(((int)n.getLocation().getX() <= maxx && (int)n.getLocation().getZ() <= maxz) && ((int)n.getLocation().getX() >= lowestx && (int)n.getLocation().getZ() >= lowestz)) {
					if((int)n.getLocation().getY() <= maxy && (int)n.getLocation().getY() >= lowesty) {
						n.sendMessage("["+ChatColor.YELLOW+"Shout"+ChatColor.RESET+"] "+name + " : "+ data);
					}
				}
			}
			return;
		});
	}
public static void f4(CommandSender sender, String[] args) {
		ExecutorService ep = Executors.newCachedThreadPool();
		ep.execute(() -> {
			Player p = (Player)sender;
			if(Bukkit.getOnlinePlayers().toString().indexOf(args[0])==-1){
				p.sendMessage("The player isn't online!");
			}
			else {
				Player rec = Bukkit.getPlayer(args[0]);
				String data = "";
				String lnl = args[0];
				for (int i = 1; i < args.length; i++) {
					data = data + args[i]+" ";
				}
				Location l = p.getLocation();
				int centerx = (int)l.getX();
				int centery = (int)l.getY();
				int centerz = (int)l.getZ();
				int maxx = centerx + 2;
				int maxz = centerz + 2;
				int maxy = centery + 2;
				int lowestx = centerx - 2;
				int lowestz = centerz - 2;
				int lowesty = centery - 2;
				if((rec.getLocation().getX() <= maxx && rec.getLocation().getY() <= maxy)&&rec.getLocation().getZ()<=maxz) {
					if((rec.getLocation().getX() >= lowestx && rec.getLocation().getY() >= lowesty)&&rec.getLocation().getZ()>=lowestz) {
						p.sendMessage(ChatColor.GRAY +""+ ChatColor.ITALIC +lnl+"에게 보낸 귓속말 : "+ data);
						rec.sendMessage(ChatColor.GRAY +""+ ChatColor.ITALIC +p.getName() + "로부터 온 귓속말 : "+ data);
					}
					else {
						p.sendMessage("The Player isn't around you!");
					}
				}
				else {
					p.sendMessage("The Player isn't around you!");
				}
			}
			return;
		});
	}
}
