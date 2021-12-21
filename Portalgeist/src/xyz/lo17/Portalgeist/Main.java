package xyz.lo17.Portalgeist;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.lo17.Portalgeist.commands.*;
import xyz.lo17.Portalgeist.events.Soon;

public class Main extends JavaPlugin{
    
    public static Logger logger;

    @Override
    public void onEnable() {logger = getLogger();

        Log("Uruchamianie...");

        Log("Wczytywanie komend...");
        this.getCommand("tworldinf").setExecutor(new WorldinfCMD());
        this.getCommand("tspawn").setExecutor(new SpawnCMD());
        this.getCommand("tstage").setExecutor(new StageCMD());
        this.getCommand("tend").setExecutor(new EndCMD());
        this.getCommand("thome").setExecutor(new HomeCMD());

        Log("Wczytywanie teleportu...");
        TeleportCMD tp = new TeleportCMD();
        this.getCommand("trtp").setExecutor(tp);
        this.getCommand("tltp").setExecutor(tp);

        Log("Rejestracja eventów...");
        new Soon();

        Log("Portalgeist online!");
    }

    public static void Log(String msg) {
        logger.log(Level.INFO, msg);
    }
}