package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

public class AccountMapRepository implements AccountRepository{
	
	Map<Integer, Account> accountMap = new HashMap<Integer, Account>();
	JSONUtil j1 = new JSONUtil();
	
	//You must provide concrete implementation for each of these methods
	//do not change the method signature
	//THINK - if the parameter is a String, or the return type is a String
	//How can I convert to a String from an Object?
	//What utility methods do I have available?
	
	//You must complete this section using TDD
	//You can use the suggested tests or build your own.

	public String getAllAccounts() {
		
		System.out.println(j1.getJSONForObject(accountMap.values()));
		
		return j1.getJSONForObject(accountMap.values());
	}

	public String createAccount(String Account) {
		Account a1 = j1.getObjectForJSON(Account, Account.class);
		accountMap.put(a1.getAccountNumber(), a1);
		System.out.println(("Account Created : " + j1.getJSONForObject(accountMap.get(a1.getAccountNumber()))));
		return ("Account Created : " + j1.getJSONForObject(accountMap.get(a1.getAccountNumber())));
	}

	public String deleteAccount(int accountNumber) {
		accountMap.remove(accountNumber);
		//System.out.println(accountMap.get(1));
		//System.out.println(accountMap.get(2));
		return null;
	}

	public String updateAccount(int accountNumber, String account) {
		// TODO Auto-generated method stub
		return null;
	}

}
