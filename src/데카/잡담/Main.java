package deca.chat;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new DefaultMessage(), this);
		this.getCommand("w").setExecutor(new Whisper());
		this.getCommand("tell").setExecutor(new Whisper());
		this.getCommand("whisper").setExecutor(new Whisper());
		this.getCommand("q").setExecutor(new quiet());
		this.getCommand("quiet").setExecutor(new quiet());
		this.getCommand("notice").setExecutor(new Notice());
		this.getCommand("shout").setExecutor(new Shout());
		this.getCommand("s").setExecutor(new Shout());
	}
	@Override
	public void onDisable() {
		
	}
}
