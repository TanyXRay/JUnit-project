import accounts.SavingsAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SavingAccountTest {
    private SavingsAccount savingsAccount;

    @BeforeEach
    public void createSavingAccount() {
        savingsAccount = new SavingsAccount("Unknown", 1_000, "накопительный счет", 500);
    }

    @Test
    @DisplayName("Тест метода добавления денежных средств")
    public void testAdd() {
        assertTrue(savingsAccount.add(500));
        System.out.println("Тестирование метода add завершено!");
    }

    @Test
    @DisplayName("Тест метода уплаты денежных средств")
    public void testPay() {
        assertTrue(savingsAccount.pay(500));
        assertFalse(savingsAccount.pay(1500));
        System.out.println("Тестирование метода pay завершено!");
    }
}
