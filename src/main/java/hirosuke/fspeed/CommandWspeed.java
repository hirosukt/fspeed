package hirosuke.fspeed;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandWspeed implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("wspeed") || command.getName().equalsIgnoreCase("ws")) {
            if(args.length != 0 && sender instanceof Player) {
                Player player = ((Player) sender).getPlayer();
                try {
                    float amount = Float.parseFloat(args[0]);
                    player.setWalkSpeed(amount);
                    player.sendMessage("Walk speed set to " + amount);
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
