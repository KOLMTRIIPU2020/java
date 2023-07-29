package lesson12num3;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Bank 1", 1000000, 100000, 10000000);
        Bank bank2 = new Bank("Bank 2", 500000, 50000, 5000000);
        Bank bank3 = new Bank("Bank 3", 20000, 20000, 200000);

        bank1.buyCurrency(bank2, CurrencyType.DOLLAR, 1000);
        bank3.buyCurrency(bank1, CurrencyType.RUBLE, 50000);
        bank2.buyCurrency(bank3, CurrencyType.MANAT, 45000);
    }
}
