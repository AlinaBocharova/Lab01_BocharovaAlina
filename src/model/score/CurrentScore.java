package src.model.score;

import src.model.account.Account;
import src.model.constants.Constants;
import src.model.money.Money;
public class CurrentScore extends Score{
    private DebetScore debetScore;
    public CurrentScore(Money balance, Account owner, Integer number, DebetScore debetScore) {
        super(balance, owner, number);
        this.debetScore = debetScore;
    }
    protected boolean checkBefore (Money money) {
        double usdValueIn = money.getValue() * money.getCurrency().getUsdCource();
        if (usdValueIn > Constants.sumForBonus){
            this.debetScore.addMoney(new Money(Constants.bonus, "USD"));
        }
        return true;
    }
}
