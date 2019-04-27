package net.snapecraft.colorsigns;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Colorsigns extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new SignListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
