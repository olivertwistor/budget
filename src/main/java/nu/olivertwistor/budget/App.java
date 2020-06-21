package nu.olivertwistor.budget;

import nu.olivertwistor.budget.menus.MainMenu;
import nu.olivertwistor.budget.menus.Menu;
import nu.olivertwistor.java.tui.Terminal;

import java.io.IOException;

public class App
{
    public static void main(String[] args)
    {
        final Menu mainMenu = new MainMenu();

        while (true)
        {
            mainMenu.show();

            final String menuChoice;
            try
            {
                menuChoice = Terminal.readString("? ");

                mainMenu.handleMenuItem(menuChoice);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
