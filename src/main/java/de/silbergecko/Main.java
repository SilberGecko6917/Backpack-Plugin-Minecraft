package de.silbergecko;

import de.silbergecko.Backpack.BackpackManager;
import de.silbergecko.commands.BackpackCommand;
import de.silbergecko.utils.Config;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main instance;
    private Config config;
    private BackpackManager backpackManager;

    @Override
    public void onLoad() {
        instance = this;
        config = new Config();
    }
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§4PLUGIN ONLINE");

        getCommand("backpack").setExecutor(new BackpackCommand());

        backpackManager = new BackpackManager();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static Main getInstance() {
        return instance;
    }
    public Config getConfiguration() {
        return config;
    }
    public BackpackManager getBackpackManager() {
        return backpackManager;
    }
}
