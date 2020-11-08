package me.imbl.opendarkmc.main;

import me.imbl.opendarkmc.main.commands.Command;
import me.imbl.opendarkmc.main.events.BlockEvents;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerCommands() {
        getCommand("tutorial").setExecutor(new Command());
    }

    public void registerEvents() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new BlockEvents(), this);
    }
}
