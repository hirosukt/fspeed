package hirosuke.fspeed;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fspeed extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getLogger().info("plugin has loaded.");
    }

    @Override
    public void onDisable() {
        getLogger().info("plugin has unloaded.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("fspeed")) {
            if(args.length == 0) {
                return false;
            }
            if(sender instanceof Player) {
                ((Player) sender).setFlySpeed(Integer.parseInt(args[0]));
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
