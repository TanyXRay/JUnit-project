import accounts.CreditAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CreditAccountTest {
    private CreditAccount creditAccount = new CreditAccount("Unknown", 1, "кредитный счет");

    @Test
    @DisplayName("Тест метода добавления денежных средств")
    public void testAdd() {
        assertFalse(creditAccount.add(500));
        System.out.println("Тестирование метода add завершено!");
    }

    @Test
    @DisplayName("Тест метода уплаты денежных средств")
    public void testPay() {
        assertEquals(creditAccount.getBalance() > -1_000_000, creditAccount.pay(1_000_000));
        System.out.println("Тестирование метода pay завершено!");
    }
}
