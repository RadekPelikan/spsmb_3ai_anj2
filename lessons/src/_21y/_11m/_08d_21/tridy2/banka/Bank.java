package _21y._11m._08d_21.tridy2.banka;

//Vytvořte třídu bankovní účet s potřebnými datovými prvky a metodami. Ve třídě Banka
//vytvořte pole účtů, které náhodně inicializujete. Vypište celkovou hotovost v bance.

import java.util.Arrays;
import java.util.Random;

public class Bank {
    int nAccunts;
    private BankAccount[] accountArr;
    private float bankBalance;

    public Bank() {
        this.nAccunts = 13;
        this.accountArr = new BankAccount[this.nAccunts];
        for (int i = 0; i < nAccunts; i++) {
            Random rn = new Random();
            this.accountArr[i] = createAccount(String.format("Client%03d", i));
        }
    }

    public Bank(String[] names) {
        this.nAccunts = names.length;
        this.accountArr = new BankAccount[this.nAccunts];
        for (int i = 0; i < this.nAccunts; i++) {
            this.accountArr[i] = createAccount(names[i]);
        }
    }

    private BankAccount createAccount(String name) {
        return new BankAccount(name);
    }

    public BankAccount[] getAccounts() {
        return this.accountArr;
    }

    public void calculateBankBalance() {
        this.bankBalance = 0;
        for (BankAccount account : accountArr) {
            this.bankBalance += account.getBalance();
        }
    }

    public float getBankBalance() {
        calculateBankBalance();
        return bankBalance;
    }

    public static void main(String[] args) {
        Bank spsBank = new Bank();
        System.out.println(Arrays.toString(spsBank.getAccounts()));
        BankAccount a = spsBank.getAccounts()[1];
        a.deposit(99999);
        System.out.println(a.getOwner().getName());
        System.out.println(spsBank.getBankBalance());
    }
}
