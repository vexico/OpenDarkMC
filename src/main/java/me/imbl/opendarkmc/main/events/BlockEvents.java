package me.imbl.opendarkmc.main.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockEvents implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        event.setCancelled(true);
        event.getPlayer().sendMessage(ChatColor.RED + "You can't do that!");
    }
}
