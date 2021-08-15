package hirosuke.fspeed;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fspeed extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getCommand("fspeed").setExecutor(new CommandFspeed());
        getCommand("fs").setExecutor(new CommandFspeed());
        getCommand("wspeed").setExecutor(new CommandWspeed());
        getCommand("ws").setExecutor(new CommandWspeed());
        getLogger().info("plugin has loaded.");
    }

    @Override
    public void onDisable() {
        getLogger().info("plugin has unloaded.");
    }
}
