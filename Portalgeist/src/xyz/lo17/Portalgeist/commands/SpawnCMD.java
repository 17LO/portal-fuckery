package xyz.lo17.Portalgeist.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.jetbrains.annotations.NotNull;

import xyz.lo17.Portalgeist.events.Soon;

public class SpawnCMD implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command arg1, @NotNull String arg2, @NotNull String[] arg3) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player)sender;
        Soon.savePlayerPos(player);

        double x = 0.5;
        double y = 105.5;
        double z = 0.468;
        float pitch = 90.0f;
        float yaw = 2.4f;
        World world = sender.getServer().getWorld("Spawn");

        Location location = new Location(world, x, y, z, pitch, yaw);
        player.teleport(location, TeleportCause.COMMAND);
        
        return true;
    }
    
}