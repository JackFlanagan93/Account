package Operational;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountMapRepository;
import com.qa.util.JSONUtil;

public class Runner {

	public static void main(String[] args) {

		AccountMapRepository amr = new AccountMapRepository();
		amr.createAccount(Constants.ACCOUNT_ONE);
		amr.createAccount(Constants.ACCOUNT_TWO);
		
	//	amr.deleteAccount(1);
	//  amr.deleteAccount(2);
		
		amr.getAllAccounts();
		
//		JSONUtil ju1 = new JSONUtil();
//		
//		Account a1 = new Account("Jack", "Flanagan");
//		Account a2 = new Account("Krystal", "Ryan");
//		
//		System.out.println(ju1.getJSONForObject(a1));
//		System.out.println(ju1.getJSONForObject(a2));
		
		
		
	}

}
