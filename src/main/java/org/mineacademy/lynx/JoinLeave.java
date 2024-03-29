package org.mineacademy.lynx;

import org.bukkit.event.Listener;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class JoinLeave extends SimplePlugin implements Listener {

	@Override
	protected void onPluginStart() {
		System.out.println("Reload Done");
	}
}
