package hirosuke.fspeed;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFspeed implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("fspeed") || command.getName().equalsIgnoreCase("fs")) {
            if(args.length != 0 && sender instanceof Player) {
                Player player;
                if(args.length != 2) {
                    player = (Player) sender;
                } else {
                    player = Bukkit.getPlayer(args[1]);
                }
                try {
                    float amount = Float.parseFloat(args[0]);
                    player.setFlySpeed(amount);
                    player.sendMessage("Fly speed set to " + amount);
                    return true;
                } catch (IllegalArgumentException e) {
                    player.sendMessage(e.getMessage());
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
