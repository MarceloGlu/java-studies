package coupon.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import coupon.core.beans.Company;
import coupon.core.exceptions.CouponSystemException;

public class CompanyDaoDb implements CompanyDao {

	@Override
	public int addCompany(Company company) throws CouponSystemException {

		// 1. get a connection from pool
		Connection con = ConnectionPool.getInstance().getConnection();
		// 2. define the sql command as string with ? place holders;
		String sql = "insert into company values(0,?,?,?)";
		// 3. create a prepared statement
		try (PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
			// 4. set the ? to real values from the company parameter
			pstmt.setString(1, company.getName());
			pstmt.setString(2, company.getEmail());
			pstmt.setString(3, company.getPassword());
			// 5. execute
			pstmt.executeUpdate();
			// 6. get the generated company id from the db
			ResultSet rsId = pstmt.getGeneratedKeys();
			rsId.next(); // go to row 1
			int id = rsId.getInt(1);
			// 7. return the id
			return id;
			}catch (SQLException e) {
			//handle any possible exception
			throw new CouponSystemException("add company failed, e);");
		} finally { //finally block will run before the return above
			// 8. finally
			ConnectionPool.getInstance().restoreConnection(con);
	}
		
	}
	public boolean isCompanyExist(String email, String password) throws CouponSystemException {
		Connection con = ConnectionPool.getInstance().getConnection();
		String sql = "select * from company where email =? and password=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1,  email);
			pstmt.setString(2,  password);
			ResultSet rs = pstmt.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			throw new CouponSystemException("isCompanyExist failed", e);
		} finally {ConnectionPool.getInstance().restoreConnection(con);
	}
			
			
		}
	}

