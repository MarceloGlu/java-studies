package coupon.core.dao;

import coupon.core.beans.Company;
import coupon.core.exceptions.CouponSystemException;

// this is an interface - later on we will write an implementing class

public interface CompanyDao {
	
		
	//this is an abstract method of the interface
	int addCompany(Company company) throws CouponSystemException;
	

}
