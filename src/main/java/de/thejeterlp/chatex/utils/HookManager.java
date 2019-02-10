package de.thejeterlp.chatex.utils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

/**
 * @author TheJeterLP
 */
public class HookManager {

    public static boolean checkVault() {
        Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("Vault");
        return plugin != null && plugin.isEnabled();
    }
}
