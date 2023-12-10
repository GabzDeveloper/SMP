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

public class ProfilGui extends CustomGui {


    private static int[] redGlass = {0, 1, 2, 3, 5, 6, 7, 8, 9, 17, 18, 19, 20, 21, 23, 24, 25, 26};
    public ProfilGui(Player player) {
        super(3, "§f• §6ᴘʀᴏғɪʟ", player);
        for (int glass : redGlass) {
            setItem(glass, new ItemStack(Material.ORANGE_STAINED_GLASS_PANE));
        }
        setItem(22, CustomItemStack.getCloseGuiItem());
        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1f, 1f);
        LuckPerms luckPerms = LuckPermsProvider.get();
        User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
        ItemStack skull = new ItemStack(Material.LEGACY_SKULL_ITEM, 1, (byte) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setOwner(player.getName());
        skull.setItemMeta(skullMeta);
        setItem(4, new CustomItemStack(skull).setName("§f↳ §c§l" + player.getName()).setLore("\n§f• §7Mort(s): §6" + player.getStatistic(Statistic.DEATHS) + "\n§f• §7Kill(s): §6" + player.getStatistic(Statistic.PLAYER_KILLS) + "\n\n§f• §7Temps de Jeu: §c" + player.getStatistic(Statistic.PLAY_ONE_MINUTE) + "\n§f• §7Link DISCORD: §c✘"));
    }

}

