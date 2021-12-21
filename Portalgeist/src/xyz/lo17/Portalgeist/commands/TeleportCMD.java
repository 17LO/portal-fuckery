package xyz.lo17.Portalgeist.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;
import xyz.lo17.Portalgeist.Main;

public class TeleportCMD implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command arg1, @NotNull String arg2, @NotNull String[] arg3) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player)sender;
        World world = player.getLocation().getWorld();
        String worldfile = world.getName();

        boolean willBeHard;
        int x1 = -6320;
        int x2 = 5800;
        int z1 = -6320;
        int z2 = 5800;

        if (worldfile.equalsIgnoreCase("world")) willBeHard = false;
        else if (worldfile.equalsIgnoreCase("world_nether")) willBeHard = true;
        else{
            player.sendMessage(ChatColor.RED + "RTP można używać tylko w Overworldzie i Netherze!");
            return true;
        }

        if(willBeHard){
            x1 = -770;
            x2 = 740;
            z1 = -800;
            z2 = 730;
        }

        int x = Main.randomize(x1, x2);
        int z = Main.randomize(z1, z2);
        int y = 230;
        int p = Main.randomize(-179, 180);

        if(!willBeHard){
            Location loc = new Location(world, x, y, z, p, 90);
            PotionEffect upadkoodpornosc = new PotionEffect(PotionEffectType.JUMP, 15, 255, false, false, false);

            player.teleport(loc, TeleportCause.CHORUS_FRUIT);
            player.sendMessage("Placeholder"); //TODO: Wiadomość
            player.addPotionEffect(upadkoodpornosc);

            return true;
        }

        return true;
    }
}
