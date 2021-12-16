package c.objects;

import java.util.Objects;

public class User {

	private int id;
	private String name;
	private String mail;
	private String password;
	public User() {
		super();
	}
	public User(int id, String name, String mail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// toString() - String concatenate all the fields
		// hashcode() - int - only id
		// equals() - boolean - only id
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getMail()=" + getMail() + ", getPassword()=" + getPassword() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		return id == other.id;
	}
	
	
	
	
	
	
}
