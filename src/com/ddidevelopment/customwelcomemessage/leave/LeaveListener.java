// Coded by DDI Development
// https://ddidevelopment.com
package com.ddidevelopment.customwelcomemessage.leave;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import com.ddidevelopment.customwelcomemessage.Main;
import com.ddidevelopment.customwelcomemessage.utils.Utils;

public class LeaveListener implements Listener {
	private Main plugin;
	public LeaveListener(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this,  plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		e.setQuitMessage(Utils.chat(plugin.getConfig().getString("leaveMessage").replace("<player>", p.getName())));
	}
	}
