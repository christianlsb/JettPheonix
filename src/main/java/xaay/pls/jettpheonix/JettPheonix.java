package xaay.pls.jettpheonix;

import org.bukkit.plugin.java.JavaPlugin;
import xaay.pls.jettpheonix.Listeners.Listener;

public final class JettPheonix extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Start Plugin!");

        this.getServer().getPluginManager().registerEvents(new Listener(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Finish Plugin!");
    }
}
