package lesson12num3;

public class Bank {
    private String name;
    private double manatBalance;
    private double dollarBalance;
    private double rubleBalance;

    public Bank(String name, double manatBalance, double dollarBalance, double rubleBalance) {
        this.name = name;
        this.manatBalance = manatBalance;
        this.dollarBalance = dollarBalance;
        this.rubleBalance = rubleBalance;
    }

    public void buyCurrency(Bank sellerBank, CurrencyType currencyType, double amount) {
        double sellerCurrencyBalance = 0.0;
        double buyerCurrencyBalance = 0.0;

        switch (currencyType) {
            case MANAT:
                sellerCurrencyBalance = sellerBank.manatBalance;
                buyerCurrencyBalance = this.manatBalance;
                break;
            case DOLLAR:
                sellerCurrencyBalance = sellerBank.dollarBalance;
                buyerCurrencyBalance = this.dollarBalance;
                break;
            case RUBLE:
                sellerCurrencyBalance = sellerBank.rubleBalance;
                buyerCurrencyBalance = this.rubleBalance;
                break;
            default:
                System.out.println("Unsupported currency type!");
                return;
        }

        double exchangeRate = calculateExchangeRate(currencyType, this, sellerBank);
        double convertedAmount = amount * exchangeRate;

        if (convertedAmount > sellerCurrencyBalance) {
            System.out.println("Seller bank does not have enough currency for the transaction!");
            return;
        }

        buyerCurrencyBalance += convertedAmount;
        sellerCurrencyBalance -= convertedAmount;

        switch (currencyType) {
            case MANAT:
                this.manatBalance = buyerCurrencyBalance;
                sellerBank.manatBalance = sellerCurrencyBalance;
                break;
            case DOLLAR:
                this.dollarBalance = buyerCurrencyBalance;
                sellerBank.dollarBalance = sellerCurrencyBalance;
                break;
            case RUBLE:
                this.rubleBalance = buyerCurrencyBalance;
                sellerBank.rubleBalance = sellerCurrencyBalance;
                break;
        }

        System.out.println("Currency exchange successful!");
    }

    private double calculateExchangeRate(CurrencyType currencyType, Bank buyerBank, Bank sellerBank) {
        double buyerCurrencyBalance = 0.0;
        double sellerCurrencyBalance = 0.0;

        switch (currencyType) {
            case MANAT:
                buyerCurrencyBalance = buyerBank.manatBalance;
                sellerCurrencyBalance = sellerBank.manatBalance;
                break;
            case DOLLAR:
                buyerCurrencyBalance = buyerBank.dollarBalance;
                sellerCurrencyBalance = sellerBank.dollarBalance;
                break;
            case RUBLE:
                buyerCurrencyBalance = buyerBank.rubleBalance;
                sellerCurrencyBalance = sellerBank.rubleBalance;
                break;
        }

        if (sellerCurrencyBalance == 0.0) {
            return 0.0;
        }

        return buyerCurrencyBalance / sellerCurrencyBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getManatBalance() {
        return manatBalance;
    }

    public void setManatBalance(double manatBalance) {
        this.manatBalance = manatBalance;
    }

    public double getDollarBalance() {
        return dollarBalance;
    }

    public void setDollarBalance(double dollarBalance) {
        this.dollarBalance = dollarBalance;
    }

    public double getRubleBalance() {
        return rubleBalance;
    }

    public void setRubleBalance(double rubleBalance) {
        this.rubleBalance = rubleBalance;
    }
}

enum CurrencyType {
    MANAT,
    DOLLAR,
    RUBLE
}
