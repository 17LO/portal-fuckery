package xyz.lo17.Portalgeist;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.lo17.Portalgeist.commands.*;
import xyz.lo17.Portalgeist.events.Soon;

public class Main extends JavaPlugin{
    
    public static Logger logger;

    private Random rand;
    private int time = 0;
    private static Main rrp; //Randomizer Reference Point

    @Override
    public void onEnable() {logger = getLogger();

        Log("Uruchamianie...");

        Log("Konfigurowanie randomizera...");
        rand = new Random();
        rrp = this;

        Log("Wczytywanie komend...");
        this.getCommand("worldinf").setExecutor(new WorldinfCMD());
        this.getCommand("spawn").setExecutor(new SpawnCMD());
        this.getCommand("stage").setExecutor(new StageCMD()); //TODO later
        this.getCommand("end").setExecutor(new EndCMD()); //TODO later
        this.getCommand("home").setExecutor(new HomeCMD());
        this.getCommand("ltp").setExecutor(new TeleportCMD());
        this.getCommand("otherworldbackupadventurecontinue").setExecutor(new AdvContCMD()); //TODO
        this.getCommand("tutorial").setExecutor(new TutorialCMD());
        this.getCommand("sethome").setExecutor(new SethomeCMD());
        this.getCommand("devtpa").setExecutor(new TpaCMD()); //TODO

        Log("Rejestracja eventów...");
        Soon TM = new Soon(); //TODO

        Log("Portalgeist online!");
    }

    public static void Log(String msg) {
        logger.log(Level.INFO, msg);
    }

    public static int randomize(int boundLow, int boundUp){

        //Zdobywanie wartości "losowszej" od losowej
        int salt = rrp.getServer().getOnlinePlayers().size();
        int base = rrp.rand.nextInt();
        int seed = (salt*base+rrp.time)/2;

        //Zdobywanie RNG
        Random r = new Random(seed);

        //Wzrór na dwukeirunkowy bound (tak, na prawdę sam go wyprowadziłem - 0% stackoverflow): U-L=B -> Rand(B)=R -> R+L=F
        int bound = boundUp - boundLow;
        int randomized = r.nextInt(bound);
        int finalValue = randomized+boundLow;

        //Zwrót
        rrp.time++;
        return finalValue;
    }
}