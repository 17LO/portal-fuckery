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
        this.getCommand("worldinf").setExecutor(new WorldinfCMD());
        this.getCommand("spawn").setExecutor(new SpawnCMD());
        this.getCommand("stage").setExecutor(new StageCMD());
        this.getCommand("end").setExecutor(new EndCMD());
        this.getCommand("home").setExecutor(new HomeCMD());

        Log("Wczytywanie teleportu...");
        TeleportCMD tp = new TeleportCMD();
        this.getCommand("rtp").setExecutor(tp);
        this.getCommand("ltp").setExecutor(tp);

        Log("Rejestracja eventów...");
        new Soon();

        Log("Portalgeist online!");
    }

    public static void Log(String msg) {
        logger.log(Level.INFO, msg);
    }
}