package me.imbl.opendarkmc.main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("tutorial")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;

                if (sender.hasPermission("opendarkmc.command.tutorial")) {
                    Material type;
                    ItemStack diamond = new ItemStack(Material.DIAMOND);
                    ItemStack bricks = new ItemStack(Material.BRICK);

                    bricks.setAmount(25);
                    player.getInventory().addItem(bricks, diamond);
                    player.sendMessage(ChatColor.GREEN + "You got free crap!");
                } else {
                    player.sendMessage(ChatColor.RED + "You do not get free crap!");
                }
            }
        }
        return true;
    }
}
