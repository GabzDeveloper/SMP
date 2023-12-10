package fr.survie.smp;

import fr.survie.smp.commands.*;
import fr.survie.smp.guis.DiscordGui;
import fr.survie.smp.listeners.Listeners;
import fr.survie.smp.staff.StaffChat;
import fr.survie.smp.staff.StaffList;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SMP extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("FunSurvie • Démarrage du Bot !");
        System.out.println("FunSurvie • Initialisation du Pack...");

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new Listeners(), this);
        pm.registerEvents(new BlockedCMD(), this);
        pm.registerEvents(new StaffChat(), this);

        getCommand("pack").setExecutor(new PackCommand());
        getCommand("stafflist").setExecutor(new StaffList());
        getCommand("discordgui").setExecutor(new DiscordGuiCMD());
        getCommand("profilgui").setExecutor(new ProfilCMD());
        getCommand("clearchat").setExecutor(new ClearChatCMD());
        getCommand("kitsgui").setExecutor(new KitsCMD());

    }


    @Override
    public void onDisable() {

    }
}
