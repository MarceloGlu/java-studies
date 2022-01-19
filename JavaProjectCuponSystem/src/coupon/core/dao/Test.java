package coupon.core.dao;

import coupon.core.beans.Company;
import coupon.core.exceptions.CouponSystemException;

public class Test {

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


