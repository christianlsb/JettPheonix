package xaay.pls.jettpheonix.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        String playerName = event.getPlayer().getName();
        event.setJoinMessage(ChatColor.GREEN + "Player " + playerName + " se conectou ao servidor");
    }

    @EventHandler

    public void onPlayerLeft(PlayerQuitEvent event){
        String playerName = event.getPlayer().getName();
        event.setQuitMessage(ChatColor.RED + "Player " + playerName + "se desconectou");
    }
}
