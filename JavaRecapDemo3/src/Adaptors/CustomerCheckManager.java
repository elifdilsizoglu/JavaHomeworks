package Adaptors;

import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		String nationalId = customer.getNationalityId();
		if (nationalId == null) return false;

	      if (nationalId.length() != 11) return false;

	      char[] chars = nationalId.toCharArray();
	      int[] a = new int[11];
	  
	      for(int i=0; i<11; i++) {
	          a[i] = chars[i] - '0';
	      }

	      if(a[0] == 0) return false;
	      if(a[10] % 2 == 1) return false;

	      if(((a[0] + a[2] + a[4] + a[6] + a[8]) * 7 - (a[1] + a[3] + a[5] + a[7])) % 10 != a[9]) return false;

	      if((a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7] + a[8] + a[9]) % 10 != a[10]) return false;

	      return true;
	}
}
