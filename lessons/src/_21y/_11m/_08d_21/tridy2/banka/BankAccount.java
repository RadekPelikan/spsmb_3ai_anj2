package _21y._11m._08d_21.tridy2.banka;

public class BankAccount {
    // Standartní inicializace na 0 v Javě u proměnných instance
    private static int LastAccountNumber = 1;
    private float balance;
    private Client owner;
    private final int accountNumber;

    public BankAccount(String ownerName) {
        this.balance = 0f;
        this.owner = new Client(ownerName);
        this.accountNumber = BankAccount.LastAccountNumber++;
    }

    public float getBalance() {
        return balance;
    }

    public Client getOwner() {
        return owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean withdraw(float value) {
        if (value <= 0 && this.balance > value) {
            return false;
        }
        this.balance -= value;
        return true;
    }

    public boolean deposit(float value) {
        if (value <= 0) {
            return false;
        }
        this.balance += value;
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", ownerName='" + owner.getName() + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
