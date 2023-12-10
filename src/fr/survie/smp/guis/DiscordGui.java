package fr.survie.smp.guis;

import fr.survie.smp.utils.CustomGui;
import fr.survie.smp.utils.CustomItemStack;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class DiscordGui extends CustomGui {

    private static int[] redGlass = {0, 1, 2, 3, 5, 6, 7, 8, 9, 17, 18, 19, 20, 21, 23, 24, 25, 26};

    public DiscordGui(Player player) {
        super(3, "§f• §9ᴅɪsᴄᴏʀᴅ", player);
        for (int glass : redGlass) {
            setItem(glass, new ItemStack(Material.BLUE_STAINED_GLASS_PANE));
        }

        setItem(22, CustomItemStack.getCloseGuiItem());
        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1f, 1f);
        LuckPerms luckPerms = LuckPermsProvider.get();
        User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
        setItem(11, new CustomItemStack(Material.FISHING_ROD).setName("§f↳ Comment rejoindre le Discord ?").setLore("\n§f• §7Dans votre navigateur Internet: \n§f• §7Veuillez rentré cette URL: §9§odiscord.lyxiz.fr \n§f• §7Il vous demandera de démarrer Discord ! \n\n§e§o» " + ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&a&b&6&1C&x&f&b&a&f&5&fl&x&f&b&b&2&5&di&x&f&b&b&6&5&bq&x&f&b&b&9&5&9u&x&f&b&b&d&5&7e&x&f&c&c&0&5&4z &x&f&c&c&4&5&2p&x&f&c&c&7&5&0o&x&f&c&c&b&4&eu&x&f&c&c&e&4&cr &x&f&c&d&2&4&aa&x&f&c&d&5&4&8v&x&f&c&d&9&4&6o&x&f&c&d&c&4&4i&x&f&c&e&0&4&2r &x&f&d&e&3&3&fl&x&f&d&e&7&3&de &x&f&d&e&a&3&bl&x&f&d&e&e&3&9i&x&f&d&f&1&3&7e&x&f&d&f&5&3&5n")));
        setItem(15, new CustomItemStack(Material.DIAMOND).setName("§f↳ Comment se link Minecraft à discord ?").setLore("\n§f• §cSoon (Un jour peut être...) \n\n§e§o» " + ChatColor.translateAlternateColorCodes('&', "§" + "&x&f&b&4&d&4&dN&x&f&b&5&7&5&7o&x&f&b&6&2&6&2n &x&f&c&6&c&6&cd&x&f&c&7&6&7&6i&x&f&c&8&0&8&0s&x&f&c&8&b&8&bp&x&f&c&9&5&9&5o&x&f&c&9&f&9&fn&x&f&d&a&9&a&9i&x&f&d&b&4&b&4b&x&f&d&b&e&b&el&x&f&d&c&8&c&8e")));
    }
}
