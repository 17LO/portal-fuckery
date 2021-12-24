package xyz.lo17.Portalgeist.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class SethomeCMD implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command arg1, @NotNull String arg2, @NotNull String[] arg3) {
        sender.sendMessage(ChatColor.RED+"Żaden sethołm, łoożka użyj, ty leniwcu joden!\n"+ChatColor.DARK_GRAY+ChatColor.ITALIC+"Se znolozł droge na skróty...");
        return true;
    }
}