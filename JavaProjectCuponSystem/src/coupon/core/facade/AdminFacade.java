package coupon.core.facade;

import coupon.core.beans.Company;
import coupon.core.exceptions.CouponSystemException;

public class AdminFacade extends ClientFacade {

	private String email = "admin@admin.com";
	private String password = "admin";

	@Override
	public boolean login(String email, String password) {
		return email.equals(this.email) && password.equals(this.password);
	}

	// all admin methods here:
	public int addCompany(Company company) throws CouponSystemException {
		// check if company name is taken
		if (companyDao.isCompanyNameExist(company.getName())) {
			throw new CouponSystemException("addCompany faild - name already taken");
		}
		// check if company email is taken
		if (companyDao.isCompanyEmailExist(company.getEmail())) {
			throw new CouponSystemException("addCompany faild - email already taken");
		}
		// if name and email are not taken - add the company to the database
		return this.companyDao.addCompany(company);
	}

	public static void main(String[] args) {

		try {
			AdminFacade af = new AdminFacade();
			System.out.println(af.login("admin@admin.com", "admin"));
			Company company = new Company(0, "BBB", "bbb@mail", "bbbPass");
			int id = af.addCompany(company);
			System.out.println("company " + id + " added");
		} catch (CouponSystemException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
