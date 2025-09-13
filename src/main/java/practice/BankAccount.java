package practice;

public class BankAccount {

  private double amount;

  public double getAmount() {
    // верните значение количества денег не счету
    return amount;
  }

  public void put(double amountToPut) {
    // метод зачисляет деньги на счет
    if (amountToPut >= 0) {
      amount += amountToPut;
    }
  }

  public void take(double amountToTake) {
    // метод списывает деньги со счета
    if (amount >= amountToTake) {
      amount -= amountToTake;
    }
  }
}
