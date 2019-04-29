package net.snapecraft.colorsigns;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class SignListener implements Listener {
    @EventHandler
    public void sign(SignChangeEvent e) {
        boolean color = false;
        for (String line:
             e.getLines()) {
            if(line.contains("&")) {
                color = true;
            }

        }
        if(!color) {
            return;
        }
        if(e.getPlayer().hasPermission("signcolor.use")) {
            for (int i = 0; i < e.getLines().length; i++) {
                e.setLine(i, ChatColor.translateAlternateColorCodes('&', e.getLine(i)));
            }
        } else {
            e.getPlayer().sendMessage("§cDu hast keine Rechte farbige Schilder zu erstellen.");
        }
    }
}
