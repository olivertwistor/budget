package nu.olivertwistor.budget.model;

public class Account
{
    private int budgetYear;
    private int number;
    private String description;

    public Account(final int budgetYear,
                   final int number,
                   final String description)
    {
        this.budgetYear = budgetYear;
        this.number = number;
        this.description = description;
    }
}
