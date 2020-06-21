package nu.olivertwistor.budget.model;

import java.util.ArrayList;
import java.util.List;

public class Budget
{
    private int year;
    private String name;
    private List<Account> accounts;

    public Budget(final int year, final String name)
    {
        this.year = year;
        this.name = name;
        this.accounts = new ArrayList<>();
    }
}
