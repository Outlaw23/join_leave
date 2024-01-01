package org.mineacademy.lynx.join_leave_event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.mineacademy.fo.annotation.AutoRegister;

@AutoRegister
public final class PlayerListener implements Listener {
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		event.setJoinMessage(ChatColor.DARK_GREEN + "[+] " + ChatColor.GREEN + event.getPlayer().getName() + " joined the Network");

	}

	@EventHandler
	public void onLeave(PlayerQuitEvent event) {
		event.setQuitMessage(ChatColor.DARK_RED + "[-] " + ChatColor.RED + event.getPlayer().getName() + " leaved the Network");
	}
}