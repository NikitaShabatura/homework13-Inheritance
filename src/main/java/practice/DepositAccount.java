package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    //можно снимать деньги через месяц после последнего пополнения

    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amountToTake) {
        if (LocalDate.now().isAfter(lastIncome.plusMonths(1))) {
            super.take(amountToTake);
        }
    }
}
