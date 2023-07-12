package src.model.score;

import src.model.account.Account;
import src.model.constants.Constants;
import src.model.money.Money;

public class DebetScore extends Score{
    private CreditScore creditScore;
    public DebetScore(Money balance, Account owner, Integer number, CreditScore creditScore) {
        super(balance, owner, number);
        this.creditScore = creditScore;
    }
    protected boolean checkBefore(Money money) {
        if (this.creditScore.getBalance().getValue() < Constants.balanceOfCard){
            return true;
        } else {
            System.out.println("Баланс кредитного счета меньше -20000. Операция запрещена!");
            return false;
        }
    }
}
