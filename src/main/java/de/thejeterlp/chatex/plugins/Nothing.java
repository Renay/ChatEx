package de.thejeterlp.chatex.plugins;

import de.thejeterlp.chatex.utils.Config;
import org.bukkit.entity.Player;

/**
 * @author TheJeterLP
 */
public class Nothing implements PermissionsPlugin {

    @Override
    public String getPrefix(Player p) {
        return "";
    }

    @Override
    public String getSuffix(Player p) {
        return "";
    }

    @Override
    public String[] getGroupNames(Player p) {
        return new String[]{""};
    }

    @Override
    public String getName() {
        return "Nothing was found!";
    }

    @Override
    public String getMessageFormat(Player p) {
        return Config.FORMAT.getString();
    }

    @Override
    public String getGlobalMessageFormat(Player p) {
        return Config.GLOBALFORMAT.getString();
    }

}
