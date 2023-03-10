package de.silbergecko.commands;

import de.silbergecko.Backpack.Backpack;
import de.silbergecko.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BackpackCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) {
            return true;
        }

        Player player = (Player) sender;

        Backpack backpack = Main.getInstance().getBackpackManager().getBackpack(player.getUniqueId());

        player.openInventory(backpack.getInventory());
        return true;
    }
}
