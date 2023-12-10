package fr.survie.smp.staff;

import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class StaffChat implements Listener {


    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        if (event.isCancelled() || !(event instanceof Player))
            return;
        Player player = (Player) event.getPlayer();
        String message = event.getMessage();
        if (message.startsWith("*")) {
            event.setCancelled(true);

            String worldName = player.getWorld().getName();

            String modifiedMessage = ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&2&9&4&f&lS&x&f&c&3&c&5&a&lT&x&f&c&4&e&6&5&lA&x&f&d&6&1&7&0&lF&x&f&d&7&3&7&b&lF") + " §f• §8(§7" + worldName + "§8) §e" + player.getName() + " §8» §b" + message.substring(1);

            for (Player target : Bukkit.getOnlinePlayers()) {
                if (target.hasPermission("staffchat.view")) {
                    target.sendMessage(modifiedMessage);
                }
            }
        }
    }
}
