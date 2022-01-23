package coupon.core.beans;

import java.util.Objects;

public class Customer {
	
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	
	// add: CTORS, get/set, toString, hashCode, equals(by id)
	
	public Customer() {
		super();
	}

	public Customer(int id, String first_name, String last_name, String email, String password) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, first_name, id, last_name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(email, other.email) && Objects.equals(first_name, other.first_name) && id == other.id
				&& Objects.equals(last_name, other.last_name) && Objects.equals(password, other.password);
	}
	
	
}
	
	
