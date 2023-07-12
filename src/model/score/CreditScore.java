package src.model.score;

import src.model.account.Account;
import src.model.money.Money;

public class CreditScore extends Score {
    public CreditScore (Money balance, Account owner, Integer number){
        super (balance, owner, number);
    }
    @Override
    protected boolean checkBefore(Money money) {
        return false;
    }
}
