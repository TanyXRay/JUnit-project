package clients;

import accept.MoneyTarget;
import accounts.Account;

public class Client implements MoneyTarget {
    private String name;
    private int maxAccount;

    private Account[] accounts;

    public Client(String name, int maxAccount) {
        this.name = name;
        this.maxAccount = maxAccount;
        this.accounts = new Account[maxAccount];
    }

    public int getMaxAccount() {
        return maxAccount;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void addNewAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
    }

    public boolean pay(int amount) {
        for (Account account : accounts) {
            if (account != null) {
                if (account.pay(amount))
                    return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(int money) {
        for (Account account : accounts) {
            if (account != null) {
                if (account.accept(money))
                    return true;
            }
        }
        return false;
    }
}
