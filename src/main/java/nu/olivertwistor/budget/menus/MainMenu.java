package nu.olivertwistor.budget.menus;

import nu.olivertwistor.java.tui.Terminal;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends Menu
{
    public MainMenu()
    {
        this.menuItems.put("x", "E[x]it");
    }

    @Override
    public void handleMenuItem(final String menuItemKey)
    {
        switch (menuItemKey)
        {
            case "x":
                Terminal.writeLine("Good bye!");
                System.exit(0);
            default:
                break;
        }
    }
}
