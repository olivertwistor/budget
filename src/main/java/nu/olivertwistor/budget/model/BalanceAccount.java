package nu.olivertwistor.budget.model;

public class BalanceAccount extends Account
{
    private double incomingBalance;

    public BalanceAccount(final int budgetYear,
                          final int number,
                          final String description,
                          final double incomingBalance)
    {
        super(budgetYear, number, description);
        this.incomingBalance = incomingBalance;
    }
}
