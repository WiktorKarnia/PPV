package pl.karnia.credit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {

    @Test
    public void itAllowAssignLimitToCC() {
        //Arrange
        CreditCard card = thereIsCreditCard();
        //Act
        card.assignLimit(BigDecimal.valueOf(200));
        //Assert
        assertEquals(BigDecimal.valueOf(200), card.getCurrentLimit());
    }

    @Test
    public void itIsNotPossibleToAssignLimitBlowTreshold() {
        CreditCard card = thereIsCreditCard();
        try {
            card.assignLimit(BigDecimal.valueOf(50));
            Assertions.fail("Exception should be thrown");
        } catch (CreditLimitBelowMinimumValueException e) {
            assertTrue(true);
        }
    }

    private CreditCard thereIsCreditCard() {
        return new CreditCard("1234-5678");
    }

    @Test
    public void itAllowsToCheckCurrentBalance() {
        CreditCard card = thereIsCreditCard();
        card.assignLimit(BigDecimal.valueOf(1000));

        card.withdraw(BigDecimal.valueOf(500));

        assertEquals(BigDecimal.valueOf(500), card.getBalance());
    }

    @Test
    public void cantWithdrawBelowBalance() {
        CreditCard card = thereIsCreditCard();
        card.assignLimit(BigDecimal.valueOf(1000));

        card.withdraw(BigDecimal.valueOf(500));
        card.withdraw(BigDecimal.valueOf(500));
        assertThrows(NotEnoughMoneyException.class, () -> {
            card.withdraw(BigDecimal.valueOf(500));
        });
    }




    @Test
    public void itIsNotPossibleToAssignLimitBlowTresholdExv2() {
        CreditCard card = thereIsCreditCard();
        assertThrows(CreditLimitBelowMinimumValueException.class, () -> {
            card.assignLimit(BigDecimal.valueOf(50));
        });
    }


    @Test
    public void testNumbers() {
        double d1 = 0.03;
        double d2 = 0.02;

        System.out.println("Double: " + (d1 - d2));

        BigDecimal bd1 = BigDecimal.valueOf(0.03);
        BigDecimal bd2 = BigDecimal.valueOf(0.02);

        System.out.println("Big decimal: " + (bd1.subtract(bd2)));
    }
}
