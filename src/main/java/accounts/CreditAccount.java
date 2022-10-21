package accounts;

public class CreditAccount extends Account {

    public CreditAccount(String nameOwner, long balance, String nameOfAccount) {
        super(nameOwner, balance, nameOfAccount);
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
        if (balance - amount > -1_000_000) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * Кредитный счёт не может быть положительным
     *
     * @param amount
     * @return
     */
    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            return false;
        } else {
            balance += amount;
            return true;
        }
    }

    @Override
    public boolean transfer(Account accountTo, int amount) {
        if (balance - amount < 0 && (balance - amount > -1_000_000)) {
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
