package hirosuke.fspeed;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFspeed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("fspeed")) {
            if(args.length != 0 && sender instanceof Player) {
                Player player = (Player) sender;
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
