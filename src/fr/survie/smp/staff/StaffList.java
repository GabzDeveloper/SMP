package fr.survie.smp.staff;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class StaffList implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!player.hasPermission("stafflist.view")) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&2&9&4&f&lS&x&f&c&3&c&5&a&lT&x&f&c&4&e&6&5&lA&x&f&d&6&1&7&0&lF&x&f&d&7&3&7&b&lF") + " §cVous n'avez pas la permission d'utiliser cette commande.");

            }
        }

        StringBuilder staffList = new StringBuilder(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&2&9&4&f&lS&x&f&c&3&c&5&a&lT&x&f&c&4&e&6&5&lA&x&f&d&6&1&7&0&lF&x&f&d&7&3&7&b&lF") + " §f• §7Membre du personnel en ligne: §b");
        for (Player staff : Bukkit.getOnlinePlayers()) {
            if (staff.hasPermission("stafflist.staff")) {
                staffList.append(staff.getName()).append(", ");
            }
        }

        // Enlever la dernière virgule et l'espace
        if (staffList.length() > 0) {
            staffList.setLength(staffList.length() - 2);
        } else {
            staffList.append(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&2&9&4&f&lS&x&f&c&3&c&5&a&lT&x&f&c&4&e&6&5&lA&x&f&d&6&1&7&0&lF&x&f&d&7&3&7&b&lF") + " §f• §cAucun membre du personnel en ligne.");
        }

        sender.sendMessage(staffList.toString());
        return false;
    }
}

