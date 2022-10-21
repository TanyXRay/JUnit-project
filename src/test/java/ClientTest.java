import accounts.Account;
import accounts.CheckingAccount;
import clients.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {
    private Client client;

    @BeforeEach
    public void createClient() {
        client = new Client("Unknown", 2);
    }

    @Test
    @DisplayName("Тестирование метода добавления нового аккаунта")
    public void testAddNewAccounts() {
        CheckingAccount checkingAccount = new CheckingAccount("Unknown", 1_000, "расчетный счет", 0);
        client.addNewAccount(checkingAccount);
        assertNotNull(client.getAccounts());
        assertNotEquals(new Account[client.getMaxAccount()], client.getAccounts());
        System.out.println("Тестирование метода addNewAccounts завершено");
    }

    @Test
    @DisplayName("Тестирование метода уплаты денежных средств")
    public void testPay() {
        assertFalse(client.pay(100));
        System.out.println("Тестирование метода pay завершено");
    }

    @Test
    @DisplayName("Тестирование метода подтверждения зачисления денежных средств")
    public void accept() {
        assertFalse(client.accept(100));
        System.out.println("Тестирование метода accept завершено");
    }
}
