package accounts;

public class CheckingAccount extends Account {
    private final int minBalance;


    public CheckingAccount(String nameOwner, long balance, String nameOfAccount, int minBalance) {
        super(nameOwner, balance, nameOfAccount);
        this.minBalance = minBalance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= balance && balance >= minBalance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean transfer(Account accountTo, int amount) {
        if (amount <= balance && balance >= minBalance) {
            if (accountTo.add(amount)) {
                balance -= amount;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(int money) {
        if (add(money)) {
            return true;
        }
        return false;
    }
}
