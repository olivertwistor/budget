package nu.olivertwistor.budget.menus;

import nu.olivertwistor.java.tui.Terminal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Menu
{
    protected final Map<String, String> menuItems;

    protected Menu()
    {
        this.menuItems = new HashMap<>();
    }

    public void show()
    {
        for (final String menuItem : this.menuItems.values())
        {
            Terminal.writeLine(menuItem);
        }
    }

    public abstract void handleMenuItem(final String menuItemKey);
}
