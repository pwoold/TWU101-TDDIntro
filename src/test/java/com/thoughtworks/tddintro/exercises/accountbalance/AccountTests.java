package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTests {
    private Account account;
    @Before
    public void setUp() {
        account = new Account();
        account.setBalance(100);
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        account.deposit(50);
        assertThat(account.getBalance(), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account.withdraw(50);
        assertThat(account.getBalance(), is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        account.setBalance(50);
        account.withdraw(100);
        assertThat(account.getBalance(), is(50));
    }
}
