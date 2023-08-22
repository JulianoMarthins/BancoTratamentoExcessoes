package entities;

import entities.exception.DomainException;

public class Account {

    private Integer Number;
    private String holder;
    private Double balance;
    private Double withdrawLimlit;

    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimlit) {
        Number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimlit = withdrawLimlit;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimlit() {
        return withdrawLimlit;
    }

    public void setWithdrawLimlit(Double withdrawLimlit) {
        this.withdrawLimlit = withdrawLimlit;
    }

    public void deposit(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) {
        if (amount > withdrawLimlit) {
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new DomainException("Not enough balance");
        }
        this.balance = this.balance - amount;
    }

    public String toString() {
        return "Enter account data: \nNumber: " + getNumber() + "\nHolder: " + getHolder()
                + String.format("\nBalance: $%.2f", getBalance())
                + String.format("\nWithdraw limit: $%.2f",
                getWithdrawLimlit());
    }
}
