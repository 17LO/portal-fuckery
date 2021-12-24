package xyz.lo17.Portalgeist.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.jetbrains.annotations.NotNull;

public class HomeCMD implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command arg1, @NotNull String arg2, @NotNull String[] arg3) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player)sender;

        Location spawn = player.getBedLocation();
        if (spawn == null){
            player.sendMessage("Brak domu. Użyj /sethome!");
            return true;
        }

        player.teleport(spawn, TeleportCause.COMMAND);
        
        return true;
    }
    
}