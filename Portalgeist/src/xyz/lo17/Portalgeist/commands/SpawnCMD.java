package xyz.lo17.Portalgeist.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SpawnCMD implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command arg1, @NotNull String arg2, @NotNull String[] arg3) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player)sender;

        //TODO: Znaleźć koordy i tepnąć na nie gracza.
        
        return true;
    }
    
}