package xyz.lo17.Portalgeist;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.lo17.Portalgeist.commands.*;

public class Main extends JavaPlugin{
    
    public static Logger logger;

    @Override
    public void onEnable() {logger = getLogger();
        this.getCommand("worldinf").setExecutor(new Worldinf());
    }

    public static void Log(String msg) {
        logger.log(Level.INFO, msg);
    }
}