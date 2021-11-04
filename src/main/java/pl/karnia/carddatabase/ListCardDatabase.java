package pl.karnia.carddatabase;

import pl.karnia.credit.CardDatabase;
import pl.karnia.credit.CreditCard;

import java.util.Optional;

public class ListCardDatabase implements CardDatabase {
    @Override
    public void save(CreditCard card) {

    }

    @Override
    public Optional<CreditCard> loadByNumber(String cardNumber) {
        return Optional.empty();
    }
}
