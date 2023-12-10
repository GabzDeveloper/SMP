package fr.survie.smp.guis;

import fr.survie.smp.utils.CustomGui;
import fr.survie.smp.utils.CustomItemStack;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class KitsGui extends CustomGui {

    private static int[] redGlass = {0, 1, 7, 8, 9, 17, 36, 44, 45, 46, 52, 53};

    public KitsGui(Player p) {

        super(6, "§f• §aᴋɪᴛs", p);
        p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1f, 1f);
        for (int glass : redGlass) {
            setItem(glass, new ItemStack(Material.GREEN_STAINED_GLASS_PANE));
        }

        setItem(49, CustomItemStack.getCloseGuiItem());
        LuckPerms luckPerms = LuckPermsProvider.get();
        User user = luckPerms.getPlayerAdapter(Player.class).getUser(p);
        setItem(20, new CustomItemStack(Material.WOODEN_PICKAXE).setName("§f↳ §7§lKIT JOUEUR").setLore("\n§f• §7Contenu: §6FULL Stuff en Bois, 16 Steak. \n\n§c⚠ VOUS POUVEZ QUE LE PRENDRE 1 FOIS ! ⚠ \n\n§e§o» " + ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&b&5&4&dC&x&f&b&b&7&4&cl&x&f&b&b&9&4&ai&x&f&b&b&b&4&9q&x&f&b&b&d&4&8u&x&f&c&b&f&4&6e&x&f&c&c&1&4&5z &x&f&c&c&3&4&4p&x&f&c&c&5&4&2o&x&f&c&c&7&4&1u&x&f&c&c&9&4&0r &x&f&c&c&b&3&el&x&f&c&c&d&3&de &x&f&c&c&f&3&br&x&f&c&d&1&3&ae&x&f&d&d&3&3&9c&x&f&d&d&5&3&7e&x&f&d&d&7&3&6v&x&f&d&d&9&3&5o&x&f&d&d&b&3&3i&x&f&d&d&d&3&2r")));
        setItem(22, new CustomItemStack(Material.STONE_SWORD).setName("§f↳ §a§lKIT MINIVIP").setLore("\n§f• §7Contenu: §6FULL Armure en CUIR, FULL Stuff en pierre, 20 Steak. \n\n§c⚠ VOUS POUVEZ QUE LE PRENDRE 1 FOIS ! ⚠ \n\n§e§o» "+ ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&b&5&4&dC&x&f&b&b&7&4&cl&x&f&b&b&9&4&ai&x&f&b&b&b&4&9q&x&f&b&b&d&4&8u&x&f&c&b&f&4&6e&x&f&c&c&1&4&5z &x&f&c&c&3&4&4p&x&f&c&c&5&4&2o&x&f&c&c&7&4&1u&x&f&c&c&9&4&0r &x&f&c&c&b&3&el&x&f&c&c&d&3&de &x&f&c&c&f&3&br&x&f&c&d&1&3&ae&x&f&d&d&3&3&9c&x&f&d&d&5&3&7e&x&f&d&d&7&3&6v&x&f&d&d&9&3&5o&x&f&d&d&b&3&3i&x&f&d&d&d&3&2r")));
        setItem(24, new CustomItemStack(Material.IRON_INGOT).setName("§f↳ §e§lKIT VIP").setLore("\n§f• §7Contenu: §6FULL Armure en FER, FULL Stuff en FER, 30 Steak. \n\n§c⚠ VOUS POUVEZ QUE LE PRENDRE 1 FOIS ! ⚠ \n\n§e§o» "+ ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&b&5&4&dC&x&f&b&b&7&4&cl&x&f&b&b&9&4&ai&x&f&b&b&b&4&9q&x&f&b&b&d&4&8u&x&f&c&b&f&4&6e&x&f&c&c&1&4&5z &x&f&c&c&3&4&4p&x&f&c&c&5&4&2o&x&f&c&c&7&4&1u&x&f&c&c&9&4&0r &x&f&c&c&b&3&el&x&f&c&c&d&3&de &x&f&c&c&f&3&br&x&f&c&d&1&3&ae&x&f&d&d&3&3&9c&x&f&d&d&5&3&7e&x&f&d&d&7&3&6v&x&f&d&d&9&3&5o&x&f&d&d&b&3&3i&x&f&d&d&d&3&2r")));
        setItem(30, new CustomItemStack(Material.DIAMOND_BLOCK).setName("§f↳ §b§lKIT VIP+").setLore("\n§f• §7Contenu: §6FULL Armure en FER, FULL Stuff en FER, 40 Steak. \n\n§c⚠ VOUS POUVEZ QUE LE PRENDRE 1 FOIS ! ⚠ \n\n§e§o» "+ ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&b&5&4&dC&x&f&b&b&7&4&cl&x&f&b&b&9&4&ai&x&f&b&b&b&4&9q&x&f&b&b&d&4&8u&x&f&c&b&f&4&6e&x&f&c&c&1&4&5z &x&f&c&c&3&4&4p&x&f&c&c&5&4&2o&x&f&c&c&7&4&1u&x&f&c&c&9&4&0r &x&f&c&c&b&3&el&x&f&c&c&d&3&de &x&f&c&c&f&3&br&x&f&c&d&1&3&ae&x&f&d&d&3&3&9c&x&f&d&d&5&3&7e&x&f&d&d&7&3&6v&x&f&d&d&9&3&5o&x&f&d&d&b&3&3i&x&f&d&d&d&3&2r")));
        setItem(32, new CustomItemStack(Material.NETHERITE_SHOVEL).setName("§f↳ §e§lKIT LYXIZ & LYXIZ+").setLore("\n§f• §7Contenu: §6Demi-Armure En diamant, Demi-Armure en Diamant, 40 Steak. \n\n§c⚠ VOUS POUVEZ QUE LE PRENDRE 1 FOIS ! ⚠ \n\n§e§o» "+ ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&b&5&4&dC&x&f&b&b&7&4&cl&x&f&b&b&9&4&ai&x&f&b&b&b&4&9q&x&f&b&b&d&4&8u&x&f&c&b&f&4&6e&x&f&c&c&1&4&5z &x&f&c&c&3&4&4p&x&f&c&c&5&4&2o&x&f&c&c&7&4&1u&x&f&c&c&9&4&0r &x&f&c&c&b&3&el&x&f&c&c&d&3&de &x&f&c&c&f&3&br&x&f&c&d&1&3&ae&x&f&d&d&3&3&9c&x&f&d&d&5&3&7e&x&f&d&d&7&3&6v&x&f&d&d&9&3&5o&x&f&d&d&b&3&3i&x&f&d&d&d&3&2r")));

    }
}
