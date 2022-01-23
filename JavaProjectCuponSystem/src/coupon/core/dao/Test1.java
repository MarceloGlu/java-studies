package coupon.core.dao;

import coupon.core.beans.Company;

// This test checks the connection and creates a company on the DB
// without considering the business logic - for that see Test2

import coupon.core.exceptions.CouponSystemException;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			Company company = new Company(0,"AAA", "AAA@gmail", "aaapassword");
			CompanyDao companyDao = new CompanyDaoDb();
			int id = companyDao.addCompany(company);
			System.out.println("created company: " + id);
			System.out.println(company);
						
			} catch (CouponSystemException e) {
				e.printStackTrace();
			}finally {
				try {
					ConnectionPool.getInstance().closeAllConnections();
					
				}catch (CouponSystemException e) {
					e.printStackTrace();
				}
			}
			
			
		}


	}


