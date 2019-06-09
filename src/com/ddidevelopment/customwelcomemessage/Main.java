// Coded by DDI Development
// https://ddidevelopment.com
package com.ddidevelopment.customwelcomemessage;

import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.java.JavaPlugin;

import com.ddidevelopment.customwelcomemessage.join.JoinListener;
import com.ddidevelopment.customwelcomemessage.leave.LeaveListener;


@SuppressWarnings("unused")
public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
	saveDefaultConfig();
	new JoinListener(this);
	new LeaveListener(this);
	}
}
