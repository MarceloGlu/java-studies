package coupon.core.dao;

import coupon.core.beans.Company;
import coupon.core.exceptions.CouponSystemException;
import coupon.core.facade.AdminFacade;

public class Test2 {
	
	public static void main(String[] args) {

		try {
			AdminFacade af = new AdminFacade();
			System.out.println(af.login("admin@admin.com", "admin"));
			Company company = new Company(0, "CCC", "ccc@mail", "bbbPass");
			int id = af.addCompany(company);
			System.out.println("company " + id + " added");
		} catch (CouponSystemException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}

	}
}
