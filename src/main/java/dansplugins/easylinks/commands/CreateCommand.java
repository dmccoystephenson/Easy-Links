package dansplugins.easylinks.commands;

import org.bukkit.command.CommandSender;
import preponderous.ponder.misc.AbstractCommand;

import java.util.ArrayList;
import java.util.Collections;

public class CreateCommand extends AbstractCommand {

    private ArrayList<String> names = new ArrayList<>(Collections.singletonList("create"));
    private ArrayList<String> permissions = new ArrayList<>(Collections.singletonList("el.create"));

    @Override
    public ArrayList<String> getNames() {
        return names;
    }

    @Override
    public ArrayList<String> getPermissions() {
        return permissions;
    }

    @Override
    public boolean execute(CommandSender commandSender) {
        // TODO: implement
        return false;
    }

    @Override
    public boolean execute(CommandSender commandSender, String[] strings) {
        // TODO: implement
        return false;
    }
}
