package hirosuke.fspeed;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fspeed extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("plugin has loaded.");
        getCommand("fspeed").setExecutor(new CommandFspeed());
    }

    @Override
    public void onDisable() {
        getLogger().info("plugin has unloaded.");
    }
}
