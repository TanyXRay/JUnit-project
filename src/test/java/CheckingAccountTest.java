import accounts.CheckingAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckingAccountTest {
    private CheckingAccount checkingAccount;

    @BeforeEach
    public void createCheckingAccount() {
        checkingAccount = new CheckingAccount("Unknown", 1_000, "расчетный счет", 0);
    }


    @Test
    @DisplayName("Тест метода добавления денежных средств")
    public void testAdd() {
        assertTrue(checkingAccount.add(500));
        System.out.println("Тестирование метода add завершено!");
    }

    @Test
    @DisplayName("Тест метода уплаты денежных средств")
    public void testPay() {
        assertTrue(checkingAccount.pay(500));
        assertFalse(checkingAccount.pay(1000));
        System.out.println("Тестирование метода pay завершено!");
    }
}
