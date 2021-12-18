package xyz.lo17.Portalgeist.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class WorldinfCMD implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String argstring, @NotNull String[] args) {
        if(sender instanceof Player){
            Player p = (Player)sender;
            sender.sendMessage(p.getLocation().getWorld().getName());
            return true;
        }
        sender.sendMessage("Muszisz być graczem!");
        return false;
    }
}