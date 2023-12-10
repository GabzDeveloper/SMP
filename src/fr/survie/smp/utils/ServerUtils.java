package fr.survie.smp.utils;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import static java.lang.String.format;

public class ServerUtils {

    public void sendActionbar(String message) {
        for (Player players : Bukkit.getOnlinePlayers()){
            players.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(format(message)));
        }

    }
}
