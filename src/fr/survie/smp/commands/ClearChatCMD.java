package fr.survie.smp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import fr.survie.smp.guis.DiscordGui;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ClearChatCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.isOp()) {
            for (int i = 0; i <= 100; i++) {
                Bukkit.broadcastMessage("  ");
            }

            if (args.length >= 1) {
                StringBuilder sb = new StringBuilder();
                for (int i0 = 0; i0 < args.length; i0++) {
                    sb.append(args[i0]).append(" ");
                }
                String message = ChatColor.translateAlternateColorCodes('&', sb.toString().trim());
                Bukkit.broadcastMessage("§cLe chat a été néttoyé par §e" + sender.getName() + " §cpour la raison: §6" + message + "§c.");
            } else {
                Bukkit.broadcastMessage("§cLe chat a été nettoyé par §e" + sender.getName() + " §csans aucune rasion.");
                return true;
            }

            return true;
        }

        return false;
    }

}
