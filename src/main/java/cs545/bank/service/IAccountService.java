package cs545.bank.service;

import java.util.Collection;

import cs545.bank.domain.Account;

public abstract interface IAccountService {
	public Account createAccount(long accountNumber, String customerName);

	public Account getAccount(long accountNumber);

	public Collection<Account> getAllAccounts();

	public void deposit(long accountNumber, double amount);

	public void withdraw(long accountNumber, double amount);

	public void depositEuros(long accountNumber, double amount);

	public void withdrawEuros(long accountNumber, double amount);

	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description);
}
