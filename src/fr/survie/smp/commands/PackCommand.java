package fr.survie.smp.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PackCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P" + " §f• §cAucun lien ne fonctionne."));
            }
        }
        return false;
    }
}
