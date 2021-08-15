package hirosuke.fspeed;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

public class CommandFspeed extends JavaPlugin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("fspeed")) {
            if(args.length == 0) {
                return false;
            }
            int amount = Integer.parseInt(args[0]);
            if(sender instanceof Player) {
                ((Player) sender).setFlySpeed(amount);
                getLogger().info("Fly speed set to " + amount);
                return true;
            }
        }
        return false;
    }
}
