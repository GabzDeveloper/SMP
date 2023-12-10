package fr.survie.smp.listeners;

import dev.lone.itemsadder.api.FontImages.FontImageWrapper;
import fr.survie.smp.scoreboard.FastBoard;
import fr.survie.smp.utils.ServerUtils;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class Listeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage(null);

        new ServerUtils().sendActionbar("§6§l» §7[§a✔§7] §7" + player.getName() + " §6§l«");

        player.sendTitle(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P"), "§aCompte Premium détécté !", 10, 30, 10);

        player.sendMessage("§8§m-------------------------------------------");
        player.sendMessage("");
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P") + " §f• §fBienvenue §6" + player.getDisplayName() + " §f!");
        player.sendMessage("");
        player.sendMessage("§8§m-------------------------------------------");

        LuckPerms luckPerms = LuckPermsProvider.get();
        User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);

        FastBoard board = new FastBoard(player);
        board.updateTitle(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P"));
        board.updateLine(0, "");
        board.updateLine(1, "§6┃ §fGrade: " + ChatColor.translateAlternateColorCodes('&', "§" + user.getCachedData().getMetaData().getPrefix()));
        board.updateLine(2, "§6┃ §fMoney: §e0 " + new FontImageWrapper("icons:coins").getString());
        board.updateLine(3, "§6┃ §fMétier(s): §cBientôt...");
        board.updateLine(4, "");
        board.updateLine(5, "§6┃ §fMonde: §c" + player.getWorld().getName());
        board.updateLine(6, "§6┃ §fConnecté(s): §b" + Bukkit.getOnlinePlayers().size());
        board.updateLine(7, "");
        board.updateLine(8, "§e↳ sᴍᴘ.ʟʏxɪᴢ.ғʀ");


        if (player.isOp()) {
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "§" + user.getCachedData().getMetaData().getPrefix()) + player.getName() + " §c§ovient de rejoindre la Survie !");
        }
    }


    @EventHandler
    private void onPlayerChat(AsyncPlayerChatEvent event) {
        String[] gg;
        Random random;
        Player player = event.getPlayer();
        int r;
        String congrats;
        String message = event.getMessage();
        LuckPerms luckPerms = LuckPermsProvider.get();
        User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
        event.setFormat(ChatColor.translateAlternateColorCodes('&', "§" + user.getCachedData().getMetaData().getPrefix()) + player.getName() + " §8» §f" + message);

        if (player.isOp()) {
            event.setFormat(ChatColor.translateAlternateColorCodes('&', "§" + user.getCachedData().getMetaData().getPrefix()) + player.getName() + " §8» §b" + message);
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(null);

        new ServerUtils().sendActionbar("§6§l» §7[§c✘§7] §7" + player.getName() + " §6§l«");
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {


        Player player = (Player) event.getWhoClicked();
        ItemStack current = event.getCurrentItem();
        if (event.getView().getTitle().equalsIgnoreCase("§f• §9ᴅɪsᴄᴏʀᴅ")) {

            event.setCancelled(true);
            if (current.getItemMeta().getDisplayName() == null) {
                return;


            } else if (current.getType() == Material.BARRIER) {
                player.closeInventory();


            } else if (current.getItemMeta().getDisplayName().equalsIgnoreCase("§f↳ Comment rejoindre le Discord ?")) {
                player.closeInventory();
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P" + " §f• §9§ohttp://discord.lyxiz.fr"));

            } else if (current.getItemMeta().getDisplayName().equalsIgnoreCase("§f↳ Comment se link Minecraft à discord ?")) {
                player.closeInventory();
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P" + " §f• §cNon disponible (Prochainement???)"));

            }

        } else if (event.getView().getTitle().equalsIgnoreCase("§f• §6ᴘʀᴏғɪʟ")) {

            event.setCancelled(true);
            if (current.getItemMeta().getDisplayName() == null) {
                return;


            } else if (current.getType() == Material.BARRIER) {
                player.closeInventory();

            }
        } else if (event.getView().getTitle().equalsIgnoreCase("§f• §aᴋɪᴛs")) {

            event.setCancelled(true);
            if (current.getItemMeta().getDisplayName() == null) {
                return;


            } else if (current.getType() == Material.BARRIER) {
                player.closeInventory();

            } else if (current.getItemMeta().getDisplayName().equalsIgnoreCase("§f↳ §7§lKIT JOUEUR")) {
                player.closeInventory();
                Bukkit.dispatchCommand(player, "kit joueur");
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P" + " §f• §aVous avez reçu le KIT."));

            } else if (current.getItemMeta().getDisplayName().equalsIgnoreCase("§f↳ §a§lKIT MINIVIP")) {
                player.closeInventory();
                Bukkit.dispatchCommand(player, "kit minivip");
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P" + " §f• §aVous avez reçu le KIT."));

            } else if (current.getItemMeta().getDisplayName().equalsIgnoreCase("§f↳ §e§lKIT VIP")) {
                player.closeInventory();
                Bukkit.dispatchCommand(player, "kit vip");
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P" + " §f• §aVous avez reçu le KIT."));

            } else if (current.getItemMeta().getDisplayName().equalsIgnoreCase("§f↳ §b§lKIT VIP+")) {
                player.closeInventory();
                Bukkit.dispatchCommand(player, "kit vip+");
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P" + " §f• §aVous avez reçu le KIT."));

            } else if (current.getItemMeta().getDisplayName().equalsIgnoreCase("§f↳ §e§lKIT LYXIZ & LYXIZ+")) {
                player.closeInventory();
                Bukkit.dispatchCommand(player, "kit lyxiz");
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&9&2&fL&x&f&b&b&4&3&7y&x&f&c&b&f&3&ex&x&f&c&c&a&4&6i&x&f&c&d&6&4&ez&x&f&c&e&1&5&6S&x&f&d&e&c&5&dM&x&f&d&f&7&6&5P" + " §f• §aVous avez reçu le KIT."));
            }
        }

    }
}




