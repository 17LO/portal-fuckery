package xyz.lo17.Portalgeist.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class SethomeCMD implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command arg1, @NotNull String arg2, @NotNull String[] arg3) {
        sender.sendMessage(ChatColor.RED+"Żaden /sethome, łóżka użyj leniwcu!\n"+ChatColor.DARK_GRAY+ChatColor.ITALIC+"Se znalazł...");
        return true;
    }
}