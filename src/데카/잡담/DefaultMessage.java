package deca.chat;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class DefaultMessage implements Listener{
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Functions.f2(e);
		e.setCancelled(true);
	}
}
