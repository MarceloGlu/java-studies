package coupon.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import coupon.core.exceptions.CouponSystemException;

// A singleton object that is a pool of open connections

public class ConnectionPool {

	public static final int SIZE = 5;
	private boolean open; // false es el default
	private String dbUrl = "jdbc:mysql://localhost:3306/coupon_system";
	private String user = "root";
	private String password = "1234";
	private Set<Connection> connections = new HashSet<>();

	// singleton step 1 - define the single instance
	private static ConnectionPool instance;

	// singleton step 2 - private constructor prevents more creations
	private ConnectionPool() throws SQLException {
		for (int i = 0; i < SIZE; i++) {
			Connection con = DriverManager.getConnection(dbUrl, user, password);
			connections.add(con);
		}
		open = true;
	}

	// singleton step 3 - getter for the instance
	public static ConnectionPool getInstance() throws CouponSystemException {
		if (instance == null) {
			try {
				instance = new ConnectionPool();
			} catch (SQLException e) {
				throw new CouponSystemException("connection pool failed to start,);", e);
			}

		}
		return instance;
	}

	public synchronized Connection getConnection() throws CouponSystemException {

		if (!open) {
			throw new CouponSystemException("getConnection failed = pool is closed");
		}
		while (connections.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Iterator<Connection> it = connections.iterator();
		Connection con = it.next();
		it.remove();
		return con;
	}

	public synchronized void restoreConnection(Connection con) {
		connections.add(con);
		notify();
	}

	public synchronized void closeAllConnections() throws CouponSystemException {
		this.open = false;
		while (connections.size() < SIZE) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// if we are here all connections are in pool
		try {
			for (Connection connection : connections) {
			connection.close();
		}
		}
		catch (SQLException e) {
		throw new CouponSystemException("closeAllConnections failed", e);
		}
	}
}

