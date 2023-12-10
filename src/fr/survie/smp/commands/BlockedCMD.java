package fr.survie.smp.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.Arrays;
import java.util.List;

public class BlockedCMD implements Listener {

    @EventHandler
    public void onCommandUse(PlayerCommandPreprocessEvent event) {
        List<String> commands = Arrays.asList("?", "pl", "about", "version", "ver", "plugins", "bukkit:?", "bukkit:pl", "bukkit:about", "bukkit:version", "bukkit:ver", "bukkit:plugins", "minecraft:pl", "minecraft:plugins", "minecraft:about", "minecraft:version", "minecraft:ver");
        commands.forEach(all -> {
            String[] arrCommand = event.getMessage().toLowerCase().split(" ", 2);
            if (arrCommand[0].equalsIgnoreCase("/" + all.toLowerCase())) {
                event.setCancelled(true);
                Player player = event.getPlayer();
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P" + " §f• §cCommande Inconnu."));

            }
        });
    }
}
